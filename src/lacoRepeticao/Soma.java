package lacoRepeticao;

import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int num, pos=0;

        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Digite um número:");
            num = ler.nextInt();
            if(num > 0)
                pos += num;
        }while(num != 0);
        System.out.println("A soma dos números positivos é: "+pos);
    }
}
