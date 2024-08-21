// 6 - Faça um algoritmo que leia o salário de um funcionário e aplique um aumento de 15%
// sobre o salário. Ao final do algoritmo apresente o antigo salário e o salário reajustado
// com duas casas decimais. Você deverá utilizar o JOPtionPane.
import javax.swing.JOptionPane;

public class exercicio6 {
    public static void main(String[] args) {
        
        String salario = JOptionPane.showInputDialog("Qual o salário atual desse funcionário?");
        double salario_funcionario = Double.parseDouble(salario);

        double novo_salario = salario_funcionario * 1.15;

        String mensagem = String.format("O funcionário recebeu um aumento de 15%%\nAntigo salário: R$%.2f\nSalário reajustado: R$%.2f", salario_funcionario, novo_salario);

        JOptionPane.showMessageDialog(null, mensagem);

    }
}