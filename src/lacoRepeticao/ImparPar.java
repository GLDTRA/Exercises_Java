package lacoRepeticao;

import java.util.Scanner;

public class ImparPar{
    public static void main(String[] args) {
        int num, par=0 , impar=0;

        Scanner ler = new Scanner (System.in);
        for(int i = 0; i < 10; i++){
            System.out.println("Digite o "+(i+1)+"o numero: ");
            num = ler.nextInt();
            if(num % 2 == 0){
                par++;
            }
            else{
                impar++;
            }
        }
        System.out.println("Total de números pares: "+par+"\nTotal de números ímpares: "+impar);

    }
}
