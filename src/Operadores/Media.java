
package Operadores;

import java.util.Scanner;

public class Media {
    public static void main(String[] args){
        float nota1, nota2, nota3, nota4, media;
        Scanner ler = new Scanner(System.in);

        System.out.println("Nota 1:");
        nota1 = ler.nextFloat();
        System.out.println("Nota 2:");
        nota2 = ler.nextFloat();
        System.out.println("Nota 3:");
        nota3 = ler.nextFloat();
        System.out.println("Nota 4:");
        nota4 = ler.nextFloat();
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.printf("Média: %.2f",media);
    }
}
