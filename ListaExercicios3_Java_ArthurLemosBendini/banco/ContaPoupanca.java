//package banco;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {

    private LocalDate diaRendimento;

    //construtor
    public ContaPoupanca(String cliente, int numConta, double saldo, LocalDate diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
        
    }

    //encapsulamento
    public LocalDate getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(LocalDate diaRendimento) {
        this.diaRendimento = diaRendimento;
    }

    //métodos
    public void calcularNovoSaldo(double taxaRendimento){
        saldo += saldo * (taxaRendimento / 100);
        System.out.println("Saldo atualizado com rendimento: R$" + saldo);
    }

    

    

}
