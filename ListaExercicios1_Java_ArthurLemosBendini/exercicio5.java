// 5 - Desenvolva um algoritmo que leia o valor de um produto e aplique um desconto a ser
// especificado pelo usuário. Ao final do programa, apresente o nome do produto, seu
// antigo valor e o valor com desconto aplicado com três casas decimais.
import javax.swing.JOptionPane;

public class exercicio5 {
    public static void main(String[] args) {

        String produto = JOptionPane.showInputDialog("Digite o nome de um produto para registrar");

        String preco = JOptionPane.showInputDialog("Digite o valor de " + produto);
        double valor_produto = Double.parseDouble(preco);

        String desconto = JOptionPane.showInputDialog("Digite um desconto, em porcentagem (apenas números), para aplicar em " + produto);
        double aplicar_desconto = Double.parseDouble(desconto);

        double desconto_aplicado = (aplicar_desconto / 100) * valor_produto;

        String mensagem_final = String.format("Produto:%s\nValor original: R$%.3f\nValor com desconto: R$%.3f",produto, valor_produto, desconto_aplicado);

        JOptionPane.showMessageDialog(null, mensagem_final);
        
    }
}