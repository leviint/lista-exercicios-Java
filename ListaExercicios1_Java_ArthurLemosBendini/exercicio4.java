// 4 - Elabore um programa que apresente o nome e a idade de uma pessoa, considerando
// que ela informe apenas o ano de nascimento e o seu nome. O seu programa deverá
// apresentar a seguinte mensagem: “Você se chama <nome_digitado> e possui
// <idade_calculada> anos de idade!”. Você deverá utilizar o JOptionPane.
import javax.swing.JOptionPane;

public class exercicio4 {
    public static void main(String[] args) {
        
        String nome = JOptionPane.showInputDialog("Olá, qual é o seu nome?");

        String nascimento = JOptionPane.showInputDialog("Em que ano você nasceu, " + nome + "?");
        int ano_nascimento = Integer.parseInt(nascimento);

        int calculo_idade = 2024 - ano_nascimento;

        JOptionPane.showMessageDialog(null, "Seu nome é " + nome + " e você tem " + calculo_idade + " anos de idade.");

    }
}