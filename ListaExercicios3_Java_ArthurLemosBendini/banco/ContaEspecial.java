//package banco;

public class ContaEspecial extends ContaBancaria {

    private double limite;

    //construtor
    public ContaEspecial(String cliente, int numConta, double saldo, double limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    //encapsulamento
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    
    //métodos
    @Override
    public void sacar(double valor) {
        if (valor <= saldo + limite) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo + " (limite: R$" + limite + ")");
        } else {
            System.out.println("Operação inválida. Valor maior que o saldo e o limite.");
        }
    }
}
