package exercicio1;

import java.util.Scanner;

public class Principal1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Produto produto = new Produto();
        
        produto.inserirDados(sc);

        produto.exibirDados();

        produto.QuantidadePedido(sc);
        
        if(produto.qntEstoque < produto.qntPedido){
            System.out.println("Não há estoque suficiente para concluir o seu pedido.");
        }
    
        sc.close();
    }
}
