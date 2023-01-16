package Operadores;

import java.util.Scanner;

public class DiferencaProduto {
    public static void main(String[] args) {
        float num1, num2, num3, num4, diferenca;
        Scanner ler = new Scanner(System.in);
        System.out.println("numero1:");
        num1 = ler.nextFloat();
        System.out.println("numero2:");
        num2 = ler.nextFloat();
        System.out.println("numero3:");
        num3 = ler.nextFloat();
        System.out.println("numero4:");
        num4 = ler.nextFloat();
        diferenca = (num1 + num2) - (num3 + num4);
        System.out.printf("Diferença: %.2f",diferenca);
    }
}
