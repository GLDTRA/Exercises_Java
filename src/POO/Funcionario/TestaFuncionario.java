package POO.Funcionario;

public class TestaFuncionario {
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Gustavo", "565432435-6", "12-3456", "215675765", "Goluel");
        Funcionario func2 = new Funcionario("Margarete", "565439735-6", "12-3636", "215865765", "Leandro");

        System.out.println("1o Funcionario:\n");
        func1.visualizar();
        System.out.println("\n2o Funcionario:\n");
        func2.visualizar();
    }
}
