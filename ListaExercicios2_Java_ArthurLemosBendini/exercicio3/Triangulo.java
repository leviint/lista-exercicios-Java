package exercicio3;

import java.util.Scanner;

public class Triangulo {
    
    //atributos
    double ladoA;
    double ladoB;
    double ladoC;

    int num;

    double P; //semiperímetro do triangulo
    double area;

    //métodos
    public void inserirDados(Scanner sc){

        System.out.println("Digite o lado A do triangulo " + num + ":");
        ladoA = sc.nextDouble();

        System.out.println("Digite o lado B do triangulo " + num + ":");
        ladoB = sc.nextDouble();

        System.out.println("Digite o lado C do triangulo " + num + ":");
        ladoC = sc.nextDouble();

    }

    public double calcularArea(){
        P = (ladoA + ladoB + ladoC) / 2;
        return area = Math.sqrt(P*(P - ladoA)*((P - ladoB)*(P - ladoC))); //Teorema de Herão
    }

    public void exibirDados(){
        calcularArea();
        System.out.println(String.format("A area do triangulo " + num + " equivale a %.2f", area));
    }
}