package exercicio2;

import java.util.Scanner;

public class Funcionario {
    
    //atributos
    String nome;
    double salario;

    //métodos
    public void dadosFuncionario(Scanner sc){
        System.out.println("Digite o nome do funcionario: ");
        nome = sc.nextLine();

        System.out.println("Digite salario do funcionario " + nome + ": ");
        salario = sc.nextDouble();

        System.out.println(String.format("Funcionario: " + nome + "\nSalario: %.2f", salario));
    }

    public double aplicarAumento(){
        if(salario >= 1 && salario <= 1000){ //15%
            salario = salario * 1.15;
            System.out.println("Salario do funcionario " + nome + " recebeu um aumento de 15%%!\n");
            System.out.println(String.format("Novo salario: %.2f", salario));
        }else if(salario >= 1001 && salario <= 1500){ //10%
            salario = salario * 1.10;
            System.out.println("Salario do funcionario " + nome + " recebeu um aumento de 10%%!\n");
            System.out.println(String.format("Novo salario: %.2f", salario));
        }else if(salario >= 1501 && salario <= 2000){ //5%
            salario = salario * 1.05;
            System.out.println("Salario do funcionario " + nome + " recebeu um aumento de 5%%!\n");
            System.out.println(String.format("Novo salario: %.2f", salario));
        }else{ //nenhum aumento
            System.out.println("Sem aumento aplicado!");
        }
        return salario;
    }
}