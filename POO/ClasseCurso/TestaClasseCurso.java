package POO.ClasseCurso;

public class TestaClasseCurso {
    public static void main(String[] args) {
        ClasseCurso curso1 = new ClasseCurso("Estrutura de dados", "Fatec", "20%", 400, 700);
        ClasseCurso curso2 = new ClasseCurso("Matemática aplicada III", "USP", "31%", 60, 650);

        System.out.println("1o Curso:\n");
        curso1.visualizar();
        System.out.println("\n2o Curso:\n");
        curso2.visualizar();
    }
}
