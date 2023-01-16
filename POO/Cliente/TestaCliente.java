package POO.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("123456789-9", "Amanda", "Silva", "1199878765", 17);
        Cliente cliente2 = new Cliente("123456789-4", "Gabriel", "João", "1199568765", 19);


        System.out.println("1o Cliente:\n");
        cliente1.visualizar();
        System.out.println("\n2o Cliente:\n");
        cliente2.visualizar();
    }
}
