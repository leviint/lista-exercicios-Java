package gerenciamentoVeiculos;

public class Onibus extends Veiculo{
    private static final double VALOR_INICIAL = 50000; //valor ilustrativo
    private static final double TAXA_IPVA = 0.02;

    //construtor
    public Onibus(String placa, String marca, String modelo, int anoFabricacao) {
        super(placa, marca, modelo, anoFabricacao);
    }

    //métodos

    @Override
    double valorEstimado(){
        int idade = 2024 - anoFabricacao;
        return Math.max(0, VALOR_INICIAL - (2000 * idade));
    }

    @Override
    double calcularIPVA(){
        return valorEstimado() * TAXA_IPVA;
    }

    @Override
    void exibirDetalhes(){
        System.out.println("Ônibus: " + marca + " " + modelo + " - Placa: " + placa + " - Ano: " + anoFabricacao);
        System.out.printf("Valor Estimado: R$%.2f%n", valorEstimado());
        System.out.printf("IPVA: R$%.2f%n", calcularIPVA());
    }

}