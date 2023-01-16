package laçoCondicional;

import java.util.Scanner;

public class votacao {
    public static void main(String[] args) {
        int idade;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a idade:");
        idade = ler.nextInt();

        if(idade < 16){
            System.out.println("A pessoa não está apta a votar");
        }
        else if(idade >= 16 && idade < 18 ){
            System.out.println("A pessoa está apta a votar e o voto é facultativo.");
        }
        else if(idade >= 18 && idade < 65){
            System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
        }
        else if(idade >= 65){
            System.out.println("A pessoa está apta a votar e o voto é facultativo.");}
    }
}
