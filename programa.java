/*          Outro exemplo
Fazer um programa para ler os dados de um produto em estoque (nome, preço e
quantidade no estoque). Em seguida:
• Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no
estoque)
• Realizar uma entrada no estoque e mostrar novamente os dados do produto
• Realizar uma saída no estoque e mostrar novamente os dados do produto */

import java.util.Scanner;

public class programa {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        //IMPORTA CLASSE
        Produto prdt = new Produto();

        //INTERAÇÃO CM O USER
        System.out.println("Digite os dados do produto:");
        System.out.print("Nome:");
        prdt.nome = sc.nextLine();
        System.out.print("Preço:");
        prdt.preco = sc.nextDouble();
        System.out.print("Quantidade em estoque:");
        prdt.quantiEstoque = sc.nextInt();

        //RETORA VALORES COM O (toString)
        System.out.println();
        System.out.println("Dados do Produto: " + prdt);

        System.out.println();
        System.out.println("Digite o número de produtos a serem adicionados ao estoque: ");
        int quantiEstoque = sc.nextInt();
        prdt.addProduto(quantiEstoque); //ATUALIZAÇÃO DA QNTD DENTRO DO OBJETO PRODUTO

        System.out.println();
        System.out.println("Dados atualizados: " + prdt);

        System.out.println();
        System.out.println("Digite o número de produtos a serem removidos do estoque: ");
        quantiEstoque = sc.nextInt();
        prdt.removeProduto(quantiEstoque); //REMOÇÃO DA QNTD DENTRO DO OBJETO PRODUTO

        System.out.println();
        System.out.println("Dados atualizados: " + prdt);
    }
}
