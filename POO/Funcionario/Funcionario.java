package POO.Funcionario;

public class Funcionario {
    protected String nome, cpf, registroFuncionario, cel, responsavel;

    protected Funcionario(String nome, String cpf, String registroFuncionario, String cel, String responsavel) {
        this.nome = nome;
        this.cpf = cpf;
        this.registroFuncionario = registroFuncionario;
        this.cel = cel;
        this.responsavel = responsavel;
    }

    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }

    protected String getRegistroFuncionario() {
        return registroFuncionario;
    }

    protected void setRegistroFuncionario(String registroFuncionario) {
        this.registroFuncionario = registroFuncionario;
    }

    protected String getCel() {
        return cel;
    }

    protected void setCel(String cel) {
        this.cel = cel;
    }

    protected String getResponsavel() {
        return responsavel;
    }

    protected void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    protected void visualizar(){
            System.out.println("Nome:"+nome+
                    "\nCPF:"+cpf+
                    "\nRegistro do funcionário:"+registroFuncionario+
                    "\nCelular:"+cel+
                    "\nResponsável:"+responsavel
            );
    }
}
