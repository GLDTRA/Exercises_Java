package laçoCondicional;
import java.util.Objects;
import java.util.Scanner;

public class impRenda {
    public static void main(String[] args) {
        float sal;
        double imp;
        Scanner ler =  new Scanner (System.in);
        System.out.println("Digite o salário: ");
        sal = ler.nextFloat();
        if(sal >= 0 && sal <= 2000.00) {
            System.out.println("Isento");
        }
        else if(sal >= 2000.01 && sal <= 3000){
            imp = sal * 0.08;
            System.out.println("Imposto de Renda: R$ " +imp);
        }
        else if(sal  >= 3000.01 && sal <= 4500){
            imp = sal * 0.18;
            System.out.println("Imposto de Renda: R$ " +imp);
        }
        else if(sal > 4500){
            imp  =  sal * 0.28;
            System.out.println("Imposto de Renda: R$ " +imp);
        }
        else {
            System.out.println("Salário inválido");
        }
    }
}
