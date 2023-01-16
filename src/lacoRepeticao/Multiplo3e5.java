package lacoRepeticao;

import java.util.Scanner;

public class Multiplo3e5 {

    public static void main(String[] args) {
        int num1, num2, div3, div5;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o primeiro número do intervalo: ");
        num1 = ler.nextInt();
        System.out.println("Digite o ultimo número do intervalo: ");
        num2 = ler.nextInt();

        if(num1 < num2){
            for(int i = num1; i <= num2; i++){
                if(i % 3 == 0 && i % 5 == 0)
                    System.out.println(i + " é múltiplo de 5 e 3");
            }
        }
        else{
            System.out.println("Intervalo inválido!");
        }
    }

}
