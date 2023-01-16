package Operadores;

import java.util.Scanner;

public class Holerite{
    public static void main(String[] args) {
        float salBruto, adcNot, HExtras, desc, salLiquido;
        Scanner ler = new Scanner(System.in);
        System.out.println("Salário bruto:");
        salBruto = ler.nextFloat();
        System.out.println("Adicional noturno:");
        adcNot = ler.nextFloat();
        System.out.println("Horas extras:");
        HExtras = ler.nextFloat();
        System.out.println("Descontos:");
        desc = ler.nextFloat();
        salLiquido = salBruto + adcNot + (HExtras * 5) - desc;
        System.out.printf("Salário liquido: %.2f",salLiquido);

    }
}
