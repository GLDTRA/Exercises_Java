package POO.Farmacia;

public class TestaFarmacia {
    public static void main(String[] args) {
        Farmacia farmacia1 = new Farmacia("Dipirona", "500ml", "123123210001-7", "Algodao", "Geandro");
        Farmacia farmacia2 = new Farmacia("Paracetamol", "100ml", "123123210001-7", "Desodorante", "Jacqueline");

        System.out.println("1o Farmacia:\n");
        farmacia1.visualizar();
        System.out.println("\n\n2o Farmacia:\n");
        farmacia2.visualizar();
    }
}
