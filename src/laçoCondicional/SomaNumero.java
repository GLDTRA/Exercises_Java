package laçoCondicional;

import java.util.Scanner;

public class SomaNumero {
    public static void main(String[] args) {
        int soma, a, b, c;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o numero A:");
        a = ler.nextInt();
        System.out.println("Digite o numero B:");
        b = ler.nextInt();
        System.out.println("Digite o numero C:");
        c = ler.nextInt();
        soma = a + b;
        if(soma > c){
            System.out.println("A Soma de A + B é Maior do que C");
        }
        else if(soma < c){
            System.out.println("A Soma de A + B é Menor do que C");
        }
        else{
            System.out.println("A Soma de A + B é Igual a C");
        }
    }
}
