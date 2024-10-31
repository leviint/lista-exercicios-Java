//package banco;
public class ContaBancaria {

    //Atributos
    protected String cliente;
    protected int numConta;
    protected double saldo;

    //Construtor
    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    //Encapsulamento
    public String getCliente() {
        return cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Métodos
    public void sacar(double valor) {
        if(valor > saldo){
            System.out.println("Saldo insuficiente para realizar a operação.");
        } else {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
            System.out.println("Saldo atual: R$" + saldo);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
        System.out.println("Saldo atual: R$" + saldo);
    }

}
