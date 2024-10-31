package gerenciamentoHotel;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Acomodacao acomodacao = null;
            
            int opcao;
            do {
                System.out.println("\nGERENCIAMENTO DE HOTEL");
                System.out.println("[1] - Fazer Check-in");
                System.out.println("[2] - Exibir custo total");
                System.out.println("[3] - Fazer Check-out");
                System.out.println("[4] - Encerrar programa");
                
                opcao = scanner.nextInt();
                
                switch(opcao) {
                    case 1 -> {
                        System.out.println("Selecione o tipo de acomodação:");
                        System.out.println("[1] - Quarto Simples");
                        System.out.println("[2] - Quarto Duplo");
                        System.out.println("[3] - Suíte");
                        
                        int tipoAcomodacao = scanner.nextInt();
                        System.out.println("Quantos dias de estadia?");
                        int dias = scanner.nextInt();
                        
                        System.out.println("Quantas pessoas?");
                        int numPessoas = scanner.nextInt();
                        
                        switch (tipoAcomodacao) {
                            case 1 -> acomodacao = new QuartoSimples(numPessoas, dias);
                            case 2 -> acomodacao = new QuartoDuplo(numPessoas, dias);
                            case 3 -> acomodacao = new Suite(numPessoas, dias);
                            default -> System.out.println("Opção inválida.");
                        }
                        
                        if (acomodacao != null) {
                            System.out.println("Check-in realizado com sucesso!");
                        }
                    }
                    case 2 -> {
                        if (acomodacao != null) {
                            acomodacao.exibirDetalhes(((QuartoSimples) acomodacao).getDias());
                        } else {
                            System.out.println("Nenhuma acomodação selecionada.");
                        }
                    }
                    case 3 -> {
                        if (acomodacao != null) {
                            System.out.println("Realizando check-out...");
                            acomodacao.exibirDetalhes(((QuartoSimples) acomodacao).getDias());
                            acomodacao = null;
                        } else {
                            System.out.println("Nenhuma acomodação para check-out.");
                        }
                    }
                    case 4 -> System.out.println("Encerrando o programa...");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 4);
        }
    }
}
