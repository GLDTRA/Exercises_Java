package laçoCondicional;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = ler.nextInt();
        if (num % 2 == 0 && num > 0) {
            System.out.println("O Número " + num + " é par e positivo!");
        } else if (num % 2 == 0 && num < 0) {
            System.out.println("O Número " + num + " é par e negativo!");
        } else if (num % 2 == 1 && num > 0) {
            System.out.println("O Número " + num + " é ímpar e postivo!");
        } else if (num % 2 == 1 && num < 0) {
            System.out.println("O Número " + num + " é ímpar e negativo!");
        } else {
            System.out.println("Numero é neutro");
        }
    }
}
