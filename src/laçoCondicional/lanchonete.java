package laçoCondicional;

import java.util.Scanner;

public class lanchonete {
    public static void main(String[] args) {
        int num, quantia;
        float preco, valorTotal;

        Scanner ler = new Scanner(System.in);

        System.out.println("1\n" +
                "Cachorro-quente\n" +
                "R$ 10.00\n" +
                "2\n" +
                "X-Salada\n" +
                "R$ 15.00\n" +
                "3\n" +
                "X-Bacon\n" +
                "R$ 18.00\n" +
                "4\n" +
                "Bauru\n" +
                "R$ 12.00\n" +
                "5\n" +
                "Refrigerante\n" +
                "R$ 8.00\n" +
                "6\n" +
                "Suco de laranja\n" +
                "R$ 13.00\n" +
                "\n");
        System.out.println("Código do Produto: ");
        num = ler.nextInt();
        System.out.println("Quantidade: ");
        quantia = ler.nextInt();
        switch (num) {
            case 1 -> {
                preco = 10;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: Cachorro quente\nValor total: R$ %.2f", valorTotal);
            }
            case 2 -> {
                preco = 15;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: X-Salada\nValor total: R$ %.2f", valorTotal);
            }
            case 3 -> {
                preco = 18;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: X-Bacon\nValor total: R$ %.2f ", valorTotal);
            }
            case 4 -> {
                preco = 12;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: Bauru\nValor total: R$ %.2f", valorTotal);
            }
            case 5 -> {
                preco = 8;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: Refrigerante\nValor total: R$ %.2f", valorTotal);
            }
            case 6 -> {
                preco = 13;
                valorTotal = (preco * quantia);
                System.out.printf("Produto: Suco de laranja\nValor total: R$ %.2f", valorTotal);
            }
            default -> System.out.println("Produto não encontrado!");
        }

    }
}
