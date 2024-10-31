package gerenciamentoHotel;

public class QuartoDuplo implements Acomodacao, ServicoAdicional{

    //atributos
    private static final double VALOR_DIARIA = 180.00;
    private int numPessoas;
    private int dias;

    //construtor
    public QuartoDuplo(int numPessoas, int dias) {
        this.numPessoas = numPessoas;
        this.dias = dias;
    }

    //encapsulamento
    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    //métodos
    @Override
    public double calcularDiaria(){
        return VALOR_DIARIA * dias;
    }

    @Override
    public double calcularServico(){
        double cafeDaManha = 20.00 * numPessoas * dias;
        double limpezaExtra = 30.00 * dias;
        return cafeDaManha + limpezaExtra;
    }

    @Override
    public void exibirDetalhes(int dias){
        double total = calcularDiaria() + calcularServico();
        System.out.println("Detalhes Quarto Duplo");
        System.out.println("Número de Pessoas: " + numPessoas);
        System.out.println("Dias: " + dias);
        System.out.println("Custo da Diária: R$" + calcularDiaria());
        System.out.println("Custo dos Serviços Adicionais: R$" + calcularServico());
        System.out.println("Custo Total: R$" + total);
    }


}
