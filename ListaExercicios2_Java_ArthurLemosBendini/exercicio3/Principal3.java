package exercicio3;

import java.util.Scanner;

public class Principal3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Triangulo triangulo1 = new Triangulo();
        triangulo1.num = 1;

        Triangulo triangulo2 = new Triangulo();
        triangulo2.num = 2;

        triangulo1.inserirDados(sc);
        triangulo2.inserirDados(sc);

        triangulo1.exibirDados();
        triangulo2.exibirDados();

        if(triangulo1.area > triangulo2.area){
            System.out.println("O triangulo " + triangulo1.num + " possui a area maior que o triangulo " + triangulo2.num);
        }else if(triangulo2.area > triangulo1.area){
            System.out.println("O triangulo " + triangulo2.num + " possui a area maior que o triangulo " + triangulo1.num);
        }else{
            System.out.println("Os triangulos possuem areas iguais");
        }
        sc.close();
    }
}
