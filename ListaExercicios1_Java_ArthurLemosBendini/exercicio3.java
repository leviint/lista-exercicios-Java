// 3 - Faça um algoritmo que leia o número de horas trabalhadas de um funcionário, o valor
// que ele recebe por hora e calcule o salário desse funcionário. Apresente o salário do
// funcionário com duas casas decimais.
import javax.swing.JOptionPane;

public class exercicio3 {
    public static void main(String[] args) {
        
        String quantas_horas = JOptionPane.showInputDialog("Quantas horas o funcionário trabalhou em um dia?");
        int horas = Integer.parseInt(quantas_horas);

        String quanto_recebe_hora = JOptionPane.showInputDialog("Quanto esse funcionário recebe por hora?");
        double recebe_hora = Double.parseDouble(quanto_recebe_hora);

        double salario =  recebe_hora * horas * 30;

        JOptionPane.showMessageDialog(null, String.format("O salário do funcionário é de R$%.2f", salario));
        

    }
}