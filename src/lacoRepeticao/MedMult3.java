package lacoRepeticao;

import java.util.Scanner;

public class MedMult3 {
    public static void main(String[] args) {
        int num;
        float med, mult3=0, cont=0;
        Scanner ler = new Scanner(System.in);

        do{
            System.out.println("Digite um número:");
            num = ler.nextInt();
            if(num % 3 == 0 && num != 0){
                mult3 += num;
                cont++;
            }
        }while(num != 0);
        med = mult3/cont;
        System.out.printf("A média de todos os números múltiplos de 3 é %.1f: ",med);
    }
}
