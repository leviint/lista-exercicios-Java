package exercicio4;

import java.util.Scanner;

public class Principal4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Aluno aluno = new Aluno();

        aluno.inserirDados(sc);
        aluno.exibirDados();

    }

}
