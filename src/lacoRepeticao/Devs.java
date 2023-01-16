package lacoRepeticao;
import java.util.Scanner;

public class Devs {
    public static void main(String[] args) {
        int idade , sexo, categoria, contBack=0, contMFront=0, contMobileMai40=0, contFSMen30=0;
        char opcao = 'S';

        Scanner ler = new Scanner(System.in);

        while(opcao == 'S'){
            System.out.println("Digite a sua idade: ");
            idade = ler.nextInt();
            System.out.println("Digite o seu sexo: \n1 - Masculino\n2 - Feminino\n3 - Outros\n");
            sexo = ler.nextInt();
            System.out.println("Digite a sua categoria: \n1 - Backend\n2 - Frontend\n3 - Mobile\n4 - FullStack\n");
            categoria = ler.nextInt();
            if(categoria == 1)
                contBack++;
            else if(sexo == 2 && categoria == 2)
                contMFront++;
            else if(idade > 40 && sexo == 1 && categoria == 3)
                contMobileMai40++;
            else if(idade < 30 && sexo == 2 && categoria == 4)
                contFSMen30++;
            System.out.println("Deseja continuar (S/N):");
            opcao = ler.next().charAt(0);
        }
        System.out.println("Total de pessoas desenvolvedoras Backend:"+contBack+
                "\nTotal de mulheres desenvolvedoras Frontend:"+contMFront+
                "\nTotal de homens desenvolvedores Mobile maiores de 40 anos:"+contMobileMai40+
                "\nTotal de mulheres desenvolvedoras FullStack menores de 30 anos:"+contFSMen30);
    }
}
