// 2 - Faça um programa para ler o valor de um círculo, e depois mostre o valor da área
// deste círculo com quatro casas decimais. Você deverá utilizar o JOptionPane.
import javax.swing.JOptionPane;

public class exercicio2 {
    public static void main(String[] args) {

        String digitar = JOptionPane.showInputDialog("Digite o valor do raio de um círculo: ");
        double raio_circulo = Double.parseDouble(digitar);

        double area_circulo = Math.PI * Math.pow(raio_circulo, 2);

        JOptionPane.showMessageDialog(null, String.format("A área do círculo é: %.4f", area_circulo));
    }
}