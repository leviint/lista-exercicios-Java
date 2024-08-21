// 1 – Elabore um programa que leia 5 valores e calcule a média aritmética deles. Ao final
// do programa, apresente os valores digitados e a média aritmética.
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        
        //entrada de dados
        try (Scanner sc = new Scanner(System.in)) {
            //entrada de dados
            System.out.println("Informe o numero 1: ");
            float numero1 = sc.nextFloat();
            
            System.out.println("Informe o numero 2: ");
            float numero2 = sc.nextFloat();
            
            System.out.println("Informe o numero 3: ");
            float numero3 = sc.nextFloat();
            
            System.out.println("Informe o numero 4: ");
            float numero4 = sc.nextFloat();
            
            System.out.println("Informe o numero 5: ");
            float numero5 = sc.nextFloat();
            
            float media = (numero1 + numero2 + numero3 + numero4 + numero5) / 5;
            
            System.out.println("A media aritmetica e " + media);
        }
    }
}