package exercicio4;

import java.util.Scanner;


public class Aluno {
    
    //atributos
    String nome;
    double[][] notas; //array que armazena notas
    double[] totalTrimestre; //array que armazena o total de notas por trimestre
    double totalAno;

    //métodos
    public Aluno(){
        notas = new double[3][3]; //3 trimestres e 3 notas por trimestre
        totalTrimestre = new double[3]; //armazena o total de notas por trimestre
        totalAno = 0;
    }
    
    public void inserirDados(Scanner sc){
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();

        System.out.println("O primeiro trimestre vale 30 pontos.\nO segundo e o terceiro trimestre valem 35 pontos cada.\n");

        for(int i = 0; i < 3; i++){ //iterar os trimestres
            System.out.println("Notas do trimestre " + (i + 1) + ": ");
            double total = 0; //variável para o total de notas durante cada trimestre
            for(int j = 0; j < 3; j++){ //iterar as notas
                double nota;
                boolean notaValida = false;
                //verificação do intervalo de notas
                while (!notaValida){
                    System.out.println("Digite a nota " + (j + 1) + ": ");
                    nota = sc.nextDouble();
                    if(i == 0 && (nota < 0 || nota > 30)){ //primeiro semestre
                        System.out.println("Nota invalida! A nota deve estar entre 0 e 30. Tente novamente.");
                    }else if((i == 1 || i == 2) && (nota < 0 || nota > 35)){ //segundo ou terceiro semestre
                        System.out.println("Nota invalida! A nota deve estar entre 0 e 35. Tente novamente.");
                    }else{
                        notaValida = true;
                        notas[i][j] = nota;
                        total += nota;
                    }
                }
            }
            totalTrimestre[i] = total;
            totalAno += total;
        }
    }

    public void exibirDados() {
        System.out.println("Nome do aluno: " + nome + "\n");
        for(int i = 0; i < 3; i++) {
            System.out.println("Notas do trimestre " + (i + 1) + ": ");
            for(int j = 0; j < 3; j++) {
                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);
            }
            System.out.println("Total de notas no trimestre " + (i + 1) + ": " + totalTrimestre[i] + "\n");
            
        } 
        System.out.println("Total de pontos no ano: " + totalAno);

        if(totalAno > 70){
            System.out.println("Situacao do aluno " + nome + ": Aprovado");
        }else{
            System.out.println("Situacao do aluno " + nome + ": Reprovado\nRestam " + (70 - totalAno) + " pontos para ser aprovado.");
        }
    }

}
