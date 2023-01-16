package POO.Ingresso;

public class TestaIngresso {
    public static void main(String[] args) {
        Ingresso ingresso1 = new Ingresso("Iron maiden", "Sao paulo", "21h", "21/12/2006", "Sim");
        Ingresso ingresso2= new Ingresso("Pink Floyd", "Rio de janeiro", "15h", "07/09/2017", "Sim");

        System.out.println("1o Ingresso:\n");
        ingresso1.visualizar();
        System.out.println("\n2o Ingresso:\n");
        ingresso2.visualizar();

    }
}
