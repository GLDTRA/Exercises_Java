package Operadores;

import java.util.Scanner;


//Exercicio 1
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

//Exercicio 2

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

//Exercicio 3

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

//Exercicio 4

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
