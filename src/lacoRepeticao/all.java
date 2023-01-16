//package lacoRepeticao;
//import java.util.Scanner;
//
////Exercicio 1
//public class Multiplo3e5 {
//
//    public static void main(String[] args) {
//        int num1, num2, div3, div5;
//        Scanner ler = new Scanner(System.in);
//        System.out.println("Digite o primeiro número do intervalo: ");
//        num1 = ler.nextInt();
//        System.out.println("Digite o ultimo número do intervalo: ");
//        num2 = ler.nextInt();
//
//        if(num1 < num2){
//            for(int i = num1; i <= num2; i++){
//                if(i % 3 == 0 && i % 5 == 0)
//                    System.out.println(i + " é múltiplo de 5 e 3");
//            }
//        }
//        else{
//            System.out.println("Intervalo inválido!");
//        }
//    }
//}
//
////Exercicio 2
//
//public class imparPar{
//    public static void main(String[] args) {
//        int num, par=0 , impar=0;
//
//        Scanner ler = new Scanner (System.in);
//        for(int i = 0; i < 10; i++){
//            System.out.println("Digite o "+(i+1)+"o numero: ");
//            num = ler.nextInt();
//            if(num % 2 == 0){
//                par++;
//            }
//            else{
//                impar++;
//            }
//        }
//        System.out.println("Total de números pares: "+par+"\nTotal de números ímpares: "+impar);
//    }
//}
//
////Exercicio 3
//
//public class IdosoAdoles {
//    public static void main(String[] args) {
//        int idade=0, id21=0, id50=0;
//        Scanner ler = new Scanner(System.in);
//        while(idade >= 0){
//            System.out.println("Digite uma idade: ");
//            idade = ler.nextInt();
//            if(idade < 21 && idade >= 0)
//                id21++;
//            else if(idade > 50)
//                id50++;
//        }
//        System.out.println("Total de pessoas menores de 21 anos:"+id21+"\nTotal de pessoas maiores de 50 anos:"+id50);
//    }
//}
//
////Exercicio 4
//
//public class devs {
//    public static void main(String[] args) {
//        int idade , sexo, categoria, contBack=0, contMFront=0, contMobileMai40=0, contFSMen30=0;
//        char opcao = 'S';
//
//        Scanner ler = new Scanner(System.in);
//
//        while(opcao == 'S'){
//            System.out.println("Digite a sua idade: ");
//            idade = ler.nextInt();
//            System.out.println("Digite o seu sexo: \n1 - Masculino\n2 - Feminino\n3 - Outros\n");
//            sexo = ler.nextInt();
//            System.out.println("Digite a sua categoria: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack\n");
//            categoria = ler.nextInt();
//            if(categoria == 1)
//                contBack++;
//            else if(sexo == 2 && categoria == 2)
//                contMFront++;
//            else if(idade > 40 && sexo == 1 && categoria == 3)
//                contMobileMai40++;
//            else if(idade < 30 && sexo == 2 && categoria == 4)
//                contFSMen30++;
//            System.out.println("Deseja continuar (S/N):");
//            opcao = ler.next().charAt(0);
//        }
//        System.out.println("Total de pessoas desenvolvedoras Backend:"+contBack+
//                "\nTotal de mulheres desenvolvedoras Frontend:"+contMFront+
//                "\nTotal de homens desenvolvedores Mobile maiores de 40 anos:"+contMobileMai40+
//                "\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos:"+contFSMen30);
//    }
//}
//
////Exercicio 5
//
//public class Soma {
//    public static void main(String[] args) {
//        int num, pos=0;
//
//        Scanner ler = new Scanner(System.in);
//
//        do{
//            System.out.println("Digite um número:");
//            num = ler.nextInt();
//            if(num > 0)
//                pos += num;
//        }while(num != 0);
//        System.out.println("A soma dos números positivos é: "+pos);
//    }
//}
//
////Exercicio 6
//
//public class MedMult3 {
//    public static void main(String[] args) {
//        int num;
//        float med, mult3=0, cont=0;
//        Scanner ler = new Scanner(System.in);
//
//        do{
//            System.out.println("Digite um número:");
//            num = ler.nextInt();
//            if(num % 3 == 0 && num != 0){
//                mult3 += num;
//                cont++;
//            }
//        }while(num != 0);
//        med = mult3/cont;
//        System.out.printf("A média de todos os números múltiplos de 3 é %.1f: ",med);
//    }
//}
//
//
