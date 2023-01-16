package POO.Cliente;

public class Cliente {
    protected String cpf, nome, sobreNome, cel;
    protected int idade;

    protected Cliente(String cpf, String nome, String sobreNome, String cel, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cel = cel;
        this.idade = idade;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getSobreNome() {
        return sobreNome;
    }

    protected void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    protected String getCel() {
        return cel;
    }

    protected void setCel(String cel) {
        this.cel = cel;
    }

    protected int getIdade() {
        return idade;
    }

    protected void setIdade(int idade) {
        this.idade = idade;
    }

    protected void visualizar(){
        System.out.println("Nome:"+nome+
                "\nSobernome:"+sobreNome+
                "\nIdade:"+idade+
                "\nCelular:"+cel+
                "\nCPF:"+cpf
        );
    }
}
