package Operadores;

import java.util.Scanner;

public class AbonoSalarial{
    public static void main(String[] args){
        float salario, abono, salarioLiq;
        Scanner ler = new Scanner(System.in);
        System.out.println("Salário:" );
        salario = ler.nextFloat();
        System.out.println("Abono:" );
        abono = ler.nextFloat();
        salarioLiq = salario + abono;
        System.out.printf("Novo salário: %.2f",salarioLiq);
    }
}