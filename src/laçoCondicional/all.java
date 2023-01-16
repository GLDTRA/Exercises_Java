//package laçoCondicional;
//import java.util.Objects;
//import java.util.Scanner;
//
////Exercicio 1
// public class SomaNumero {
//    public static void main(String[] args) {
//        int soma, a, b, c;
//        Scanner ler = new Scanner(System.in);
//        System.out.println("Digite o numero A:");
//        a = ler.nextInt();
//        System.out.println("Digite o numero B:");
//        b = ler.nextInt();
//        System.out.println("Digite o numero C:");
//        c = ler.nextInt();
//        soma = a + b;
//        if(soma > c){
//            System.out.println("A Soma de A + B é Maior do que C");
//        }
//        else if(soma < c){
//            System.out.println("A Soma de A + B é Menor do que C");
//        }
//        else{
//            System.out.println("A Soma de A + B é Igual a C");
//        }
//    }
//}
//
////Exercicio 2
//public class parImpar {
//    public static void main(String[] args) {
//        int num;
//        Scanner ler = new Scanner(System.in);
//        System.out.println("Digite um numero: ");
//        num = ler.nextInt();
//        if(num % 2 == 0 && num > 0){
//            System.out.println("O Número "+num+" é par e positivo!");
//        }
//        else if(num % 2 == 0 && num < 0){
//            System.out.println("O Número "+num+" é par e negativo!");
//        }
//        else if(num % 2 == 1 && num > 0){
//            System.out.println("O Número "+num+" é ímpar e postivo!");
//        }
//        else if(num %  2 == 1 && num < 0){
//            System.out.println("O Número "+num+" é ímpar e negativo!");
//        }
//        else{
//            System.out.println("Numero é neutro");
//        }
//    }
//}
//
////Exercicio 3
//
//public class lanchonete {
//    public static void main(String[] args) {
//        int num, quantia;
//        float preco, valorTotal;
//
//        Scanner ler = new Scanner(System.in);
//
//        System.out.println("1\n" +
//                "Cachorro-quente\n" +
//                "R$ 10.00\n" +
//                "2\n" +
//                "X-Salada\n" +
//                "R$ 15.00\n" +
//                "3\n" +
//                "X-Bacon\n" +
//                "R$ 18.00\n" +
//                "4\n" +
//                "Bauru\n" +
//                "R$ 12.00\n" +
//                "5\n" +
//                "Refrigerante\n" +
//                "R$ 8.00\n" +
//                "6\n" +
//                "Suco de laranja\n" +
//                "R$ 13.00\n" +
//                "\n");
//        System.out.println("Código do Produto: ");
//        num = ler.nextInt();
//        System.out.println("Quantidade: ");
//        quantia = ler.nextInt();
//        switch (num) {
//            case 1 -> {
//                preco = 10;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: Cachorro quente\nValor total: R$ %.2f", valorTotal);
//            }
//            case 2 -> {
//                preco = 15;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: X-Salada\nValor total: R$ %.2f", valorTotal);
//            }
//            case 3 -> {
//                preco = 18;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: X-Bacon\nValor total: R$ %.2f ", valorTotal);
//            }
//            case 4 -> {
//                preco = 12;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: Bauru\nValor total: R$ %.2f", valorTotal);
//            }
//            case 5 -> {
//                preco = 8;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: Refrigerante\nValor total: R$ %.2f", valorTotal);
//            }
//            case 6 -> {
//                preco = 13;
//                valorTotal = (preco * quantia);
//                System.out.printf("Produto: Suco de laranja\nValor total: R$ %.2f", valorTotal);
//            }
//            default -> System.out.println("Produto não encontrado!");
//        }
//    }
//}
//
////Exercicio 4
//
//public class votacao {
//    public static void main(String[] args) {
//        int idade;
//
//        Scanner ler = new Scanner(System.in);
//
//        System.out.println("Digite a idade:");
//        idade = ler.nextInt();
//
//        if(idade < 16){
//            System.out.println("A pessoa não está apta a votar");
//        }
//        else if(idade >= 16 && idade < 18 ){
//            System.out.println("A pessoa está apta a votar e o voto é facultativo.");
//        }
//        else if(idade >= 18 && idade < 65){
//            System.out.println("A pessoa está apta a votar e o voto é obrigatório.");
//        }
//        else if(idade >= 65){
//            System.out.println("A pessoa está apta a votar e o voto é facultativo.");}
//    }
//}
//
////Exercicio 5
//
//public class impRenda {
//    public static void main(String[] args) {
//        float sal;
//        double imp;
//        Scanner ler =  new Scanner (System.in);
//        System.out.println("Digite o salário: ");
//        sal = ler.nextFloat();
//        if(sal >= 0 && sal <= 2000.00) {
//            System.out.println("Isento");
//        }
//        else if(sal >= 2000.01 && sal <= 3000){
//            imp = sal * 0.08;
//            System.out.println("Imposto de Renda: R$ " +imp);
//        }
//        else if(sal  >= 3000.01 && sal <= 4500){
//            imp = sal * 0.18;
//            System.out.println("Imposto de Renda: R$ " +imp);
//        }
//        else if(sal > 4500){
//            imp  =  sal * 0.28;
//            System.out.println("Imposto de Renda: R$ " +imp);
//        }
//        else {
//            System.out.println("Salário inválido");
//        }
//    }
//}
//
////Exercicio 6
//
//public class animal {
//    public static void main(String[] args) {
//        String vertebrado, tipagem, alimentacao;
//
//        Scanner ler = new Scanner(System.in);
//
//        System.out.println("Digite a opção desejada para a verificação de animal: \nVertebrado\nInvertebrado\n");
//        vertebrado = ler.nextLine();
//        if (Objects.equals(vertebrado, "Vertebrado") || Objects.equals(vertebrado, "vertebrado")) {
//            System.out.println("Digite a tipagem de animais entre as opções: \nAve\nMamífero\n");
//            tipagem = ler.nextLine();
//            if (Objects.equals(tipagem, "Ave") || Objects.equals(tipagem, "ave")) {
//                System.out.println("Digite tipo de alimentação entre as opções: \nCarnívoro\nOnívoro\n");
//                alimentacao = ler.nextLine();
//                if (Objects.equals(alimentacao, "Carnívoro") || Objects.equals(alimentacao, "carnívoro"))
//                    System.out.println("Águia");
//                else if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
//                    System.out.println("Pomba");
//                else
//                    System.out.println("Alimentação inválida");
//            } else if (Objects.equals(tipagem, "Mamífero") || Objects.equals(tipagem, "mamífero")) {
//                System.out.println("Digite tipo de alimentação entre as opções: \nOnívoro\nHerbívoro\n");
//                alimentacao = ler.nextLine();
//                if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
//                    System.out.println("Homem");
//                else if (Objects.equals(alimentacao, "Herbívoro") || Objects.equals(alimentacao, "herbívoro"))
//                    System.out.println("Vaca");
//                else
//                    System.out.println("Alimentação inválida");
//            } else
//                System.out.println("tipagem inválida");
//        } else if (Objects.equals(vertebrado, "Invertebrado") || Objects.equals(vertebrado, "invertebrado")) {
//            System.out.println("Digite a tipagem de animais entre as opções: \nInseto\nAnelídeo\n");
//            tipagem = ler.nextLine();
//            if (Objects.equals(tipagem, "Inseto") || Objects.equals(tipagem, "inseto")) {
//                System.out.println("Digite tipo de alimentação entre as opções: \nHematófago\nHerbívoro\n");
//                alimentacao = ler.nextLine();
//                if (Objects.equals(alimentacao, "Hematófago") || Objects.equals(alimentacao, "hematófago"))
//                    System.out.println("Pulga");
//                else if (Objects.equals(alimentacao, "Herbívoro") || Objects.equals(alimentacao, "herbívoro"))
//                    System.out.println("Lagarta");
//                else
//                    System.out.println("Alimentação inválida");
//            } else if (Objects.equals(tipagem, "Anelídeo") || Objects.equals(tipagem, "anelídeo")) {
//                System.out.println("Digite tipo de alimentação entre as opções: \nHematófago\nOnívoro\n");
//                alimentacao = ler.nextLine();
//                if (Objects.equals(alimentacao, "Hematófago") || Objects.equals(alimentacao, "hematafógo"))
//                    System.out.println("Sanguessuga");
//                else if (Objects.equals(alimentacao, "Onívoro") || Objects.equals(alimentacao, "onívoro"))
//                    System.out.println("Minhoca");
//                else
//                    System.out.println("Alimentação inválida");
//            } else
//                System.out.println("tipagem inválida");
//        } else
//            System.out.println("Tipo vertebral inválido");
//    }
//}
