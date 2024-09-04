package exercicio2;

import java.util.Scanner;

public class Principal2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Funcionario funcionario = new Funcionario();

        funcionario.dadosFuncionario(sc);
        funcionario.aplicarAumento();

        sc.close();
    }

}
