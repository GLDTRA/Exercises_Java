package lacoRepeticao;

import java.util.Scanner;

public class IdosoAdoles {
    public static void main(String[] args) {
        int idade=0, id21=0, id50=0;
        Scanner ler = new Scanner(System.in);
        while(idade >= 0){
            System.out.println("Digite uma idade: ");
            idade = ler.nextInt();
            if(idade < 21 && idade >= 0)
                id21++;
            else if(idade > 50)
                id50++;
        }
        System.out.println("Total de pessoas menores de 21 anos:"+id21+"\nTotal de pessoas maiores de 50 anos:"+id50);
    }

}
