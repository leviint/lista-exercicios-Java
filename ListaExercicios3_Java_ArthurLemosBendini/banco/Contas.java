import java.time.LocalDate;
import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            ContaPoupanca contaPoupanca = new ContaPoupanca("Arthur", 12345, 1000.0, LocalDate.now());
            ContaEspecial contaEspecial = new ContaEspecial("Arthur", 54321, 500.0, 1000.0);

            int opcao;
            do {
                System.out.println("\nEscolha uma opção:");
                System.out.println("[1] - Sacar de conta poupança");
                System.out.println("[2] - Depositar na conta poupança");
                System.out.println("[3] - Calcular novo saldo com rendimento (poupança)");
                System.out.println("[4] - Sacar de conta especial");
                System.out.println("[5] - Depositar na conta especial");
                System.out.println("[6] - Mostrar dados das contas");
                System.out.println("[0] - Sair");

                opcao = scanner.nextInt();

                switch (opcao) {
                    case 1 -> {
                        System.out.print("Digite o valor a sacar: ");
                        double valorSaquePoupanca = scanner.nextDouble();
                        contaPoupanca.sacar(valorSaquePoupanca);
                    }
                    case 2 -> {
                        System.out.print("Digite o valor a depositar: ");
                        double valorDepositoPoupanca = scanner.nextDouble();
                        contaPoupanca.depositar(valorDepositoPoupanca);
                    }
                    case 3 -> {
                        System.out.print("Digite a taxa de rendimento (%): ");
                        double taxaRendimento = scanner.nextDouble();
                        contaPoupanca.calcularNovoSaldo(taxaRendimento);
                    }
                    case 4 -> {
                        System.out.print("Digite o valor a sacar: ");
                        double valorSaqueEspecial = scanner.nextDouble();
                        contaEspecial.sacar(valorSaqueEspecial);
                    }
                    case 5 -> {
                        System.out.print("Digite o valor a depositar: ");
                        double valorDepositoEspecial = scanner.nextDouble();
                        contaEspecial.depositar(valorDepositoEspecial);
                    }
                    case 6 -> {
                        System.out.println("Conta Poupança - Cliente: " + contaPoupanca.getCliente() + ", Saldo: R$" + contaPoupanca.getSaldo());
                        System.out.println("Conta Especial - Cliente: " + contaEspecial.getCliente() + ", Saldo: R$" + contaEspecial.getSaldo() + ", Limite: R$" + contaEspecial.getLimite());
                    }
                    case 0 -> System.out.println("Saindo...");
                    default -> System.out.println("Opção inválida.");
                }
            } while (opcao != 0);
        }
    }
}
