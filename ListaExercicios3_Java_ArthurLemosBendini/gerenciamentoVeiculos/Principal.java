package gerenciamentoVeiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            List<Veiculo> veiculos = new ArrayList<>();
            int opcao;
            do {
                System.out.println("\nGERENCIAMENTO DE VEÍCULOS");
                System.out.println("[1] - Criar novo veículo");
                System.out.println("[2] - Exibir informações de um veículo");
                System.out.println("[3] - Calcular IPVA");
                System.out.println("[4] - Encerrar programa");
                
                opcao = scanner.nextInt();
                
                switch(opcao) {
                    case 1 -> {
                        System.out.println("Qual será o tipo de veículo?");
                        System.out.println("[1] - Carro");
                        System.out.println("[2] - Caminhão");
                        System.out.println("[3] - Ônibus");
                        
                        int opcaoVeiculo = scanner.nextInt();
                        scanner.nextLine();
                        
                        System.out.print("Digite a placa: ");
                        String placa = scanner.nextLine();
                        
                        System.out.print("Digite a marca: ");
                        String marca = scanner.nextLine();
                        
                        System.out.print("Digite o modelo: ");
                        String modelo = scanner.nextLine();
                        
                        System.out.print("Digite o ano de fabricação: ");
                        int anoFabricacao = scanner.nextInt();
                        
                        switch(opcaoVeiculo) {
                            case 1 -> {
                                Carro carro = new Carro(placa, marca, modelo, anoFabricacao);
                                veiculos.add(carro);
                                System.out.println("Carro criado com sucesso!");
                            }
                            case 2 -> {
                                Caminhao caminhao = new Caminhao(placa, marca, modelo, anoFabricacao);
                                veiculos.add(caminhao);
                                System.out.println("Caminhão criado com sucesso!");
                            }
                            case 3 -> {
                                Onibus onibus = new Onibus(placa, marca, modelo, anoFabricacao);
                                veiculos.add(onibus);
                                System.out.println("Ônibus criado com sucesso!");
                            }
                            default -> System.out.println("Tipo de veículo inválido.");
                        }
                    }
                    case 2 -> {
                        System.out.println("Exibindo informações dos veículos:");
                        for (Veiculo veiculo : veiculos) {
                            veiculo.exibirDetalhes();
                        }
                    }
                    case 3 -> {
                        System.out.println("Calculando IPVA dos veículos:");
                        for (Veiculo veiculo : veiculos) {
                            double ipva = veiculo.calcularIPVA();
                            System.out.printf("IPVA do veículo %s: R$%.2f%n", veiculo.getPlaca(), ipva);
                        }
                    }
                    case 4 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 4);
        }
    }
}
