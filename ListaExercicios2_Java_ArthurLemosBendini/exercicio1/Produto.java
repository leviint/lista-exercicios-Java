package exercicio1;

import java.util.Scanner;

public class Produto {

    //atributos
    String nome;
    double preco;
    double qntEstoque;
    double valorEstoque;

    double qntPedido;

    //métodos
    public void exibirDados(){

        System.out.println("Nome do Produto: " + nome);
        System.out.println("Preco do Produto: " + preco);
        System.out.println("Quantidade no Estoque: " + qntEstoque);
        System.out.println("Valor do Estoque: " + valorEstoque);
    }

    public double EstoqueValor(){
        return valorEstoque = preco * qntEstoque;
    }

    public void inserirDados(Scanner sc){

        System.out.println("Digite o nome do produto: ");
        nome = sc.nextLine();

        System.out.println("Digite o preco de " + nome + ": ");
        preco = sc.nextDouble();

        System.out.println("Digite a quantidade de " + nome + " em estoque: ");
        qntEstoque = sc.nextInt();

        EstoqueValor();
    }

    public void QuantidadePedido(Scanner sc){
        System.out.println("Quanto de " + nome + " voce deseja?");
        qntPedido = sc.nextDouble();
    }
}