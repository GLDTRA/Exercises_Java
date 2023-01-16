package laçoCondicional;
import java.util.Objects;
import java.util.Scanner;

public class animal {
    private static int t = 0;
    public static void main(String[] args) {
        String vertebrado, tipagem, alimentacao;
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a opção desejada para a verificação de animal: \nVertebrado\nInvertebrado\n");
        vertebrado = ler.nextLine();
        if (Objects.equals(vertebrado, "Vertebrado") || Objects.equals(vertebrado, "vertebrado")) {
            System.out.println("Digite a tipagem de animais entre as opções: \nAve\nMamífero\n");
            tipagem = ler.nextLine();
            if (Objects.equals(tipagem, "Ave") || Objects.equals(tipagem, "ave")) {
                System.out.println("Digite tipo de alimentação entre as opções: \nCarnívoro\nOnívoro\n");
                alimentacao = ler.nextLine();
                if (Objects.equals(alimentacao, "Carnívoro") || Objects.equals(alimentacao, "carnívoro"))
                    System.out.println("Águia");
                else if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
                    System.out.println("Pomba");
                else
                    System.out.println("Alimentação inválida");
            } else if (Objects.equals(tipagem, "Mamífero") || Objects.equals(tipagem, "mamífero")) {
                System.out.println("Digite tipo de alimentação entre as opções: \nOnívoro\nHerbívoro\n");
                alimentacao = ler.nextLine();
                if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
                    System.out.println("Homem");
                else if (Objects.equals(alimentacao, "Herbívoro") || Objects.equals(alimentacao, "herbívoro"))
                    System.out.println("Vaca");
                else
                    System.out.println("Alimentação inválida");
            } else
                System.out.println("tipagem inválida");
        } else if (Objects.equals(vertebrado, "Invertebrado") || Objects.equals(vertebrado, "invertebrado")) {
            System.out.println("Digite a tipagem de animais entre as opções: \nInseto\nAnelídeo\n");
            tipagem = ler.nextLine();
            if (Objects.equals(tipagem, "Inseto") || Objects.equals(tipagem, "inseto")) {
                System.out.println("Digite tipo de alimentação entre as opções: \nHematófago\nHerbívoro\n");
                alimentacao = ler.nextLine();
                if (Objects.equals(alimentacao, "Hematófago") || Objects.equals(alimentacao, "hematófago"))
                    System.out.println("Pulga");
                else if (Objects.equals(alimentacao, "Herbívoro") || Objects.equals(alimentacao, "herbívoro"))
                    System.out.println("Lagarta");
                else
                    System.out.println("Alimentação inválida");
            } else if (Objects.equals(tipagem, "Anelídeo") || Objects.equals(tipagem, "anelídeo")) {
                System.out.println("Digite tipo de alimentação entre as opções: \nHematófago\nOnívoro\n");
                alimentacao = ler.nextLine();
                if (Objects.equals(alimentacao, "Hematófago") || Objects.equals(alimentacao, "hematafógo"))
                    System.out.println("Sanguessuga");
                else if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
                    System.out.println("Minhoca");
                else
                    System.out.println("Alimentação inválida");
            } else
                System.out.println("tipagem inválida");
        } else
            System.out.println("Tipo vertebral inválido");
    }
}
