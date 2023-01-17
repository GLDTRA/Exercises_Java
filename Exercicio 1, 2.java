//Exercicio 1

package POO.Cliente;

public class Cliente {
    protected String nome, sobreNome, cel;
    protected int idade, id;

    protected Cliente(int id, String nome, String sobreNome, String cel, int idade) {
        this.id = id;
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cel = cel;
        this.idade = idade;
    }

    protected int getId() {
        return id;
    }

    protected void setId(int id) {
        this.id = id;
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
        System.out.println("Nome:"+this.nome+
                "\nSobernome:"+this.sobreNome+
                "\nIdade:"+this.idade+
                "\nCelular:"+this.cel+
                "\nCPF:"+this.id
        );
    }
}


public class PessoaFisica extends Cliente {
    String rg;

    public PessoaFisica(int id, String nome, String sobreNome, String cel, int idade, String rg) {
        super(id, nome, sobreNome, cel, idade);
        this.rg = rg;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    protected void visualizar(){
        super.visualizar();
        System.out.println("rg: "+this.rg);
    }
}

public class PessoaJuridica extends Cliente {
    protected String CNPJ;

    public PessoaJuridica(int id, String nome, String sobreNome, String cel, int idade, String CNPJ) {
        super(id, nome, sobreNome, cel, idade);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    protected void visualizar(){
        super.visualizar();
        System.out.println("CNPJ:"+this.CNPJ);
    }
}

package POO.Cliente;

public class TestaCliente {
    public static void main(String[] args) {
        PessoaFisica PesFis1 = new PessoaFisica(1, "Everton", "João", "12912345678", 43, "23145854-1");
        PessoaFisica PesFis2= new PessoaFisica(2, "Maria", "João", "12912395678", 33, "23125854-5");

        PessoaJuridica PesJur1 = new PessoaJuridica(3, "Heuron", "LTDA", "12912345678", 59, "12.345.764/0001-9");
        PessoaJuridica PesJur2 = new PessoaJuridica(4, "Helipter ", "casa de contrução", "16912345378", 59, "12.845.794/0001-9");

        System.out.println("1o Cliente - Pessoa fisica:\n");
        PesFis1.visualizar();
        System.out.println("\n2o Cliente - Pessoa fisica\n");
        PesFis2.visualizar();
        System.out.println("3o Cliente - Pessoa juridica:\n");
        PesJur1.visualizar();
        System.out.println("\n4o Cliente - Pessoa juridica\n");
        PesJur2.visualizar();
    }
}

//Exercicio 2 
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

public class Gerente extends POO.Funcionario.Funcionario {
    protected int funcionario;

    public Gerente(String nome, String cpf, String registroFuncionario, String cel, String responsavel, int funcionario) {
        super(nome, cpf, registroFuncionario, cel, responsavel);
        this.funcionario = funcionario;
    }

    public int getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(int funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    protected void visualizar(){
        super.visualizar();
        System.out.println("Funcionários que gerente supervisiona: "+this.funcionario);
    }
}

public class Vendedor extends POO.Funcionario.Funcionario {
    int produtos;

    public Vendedor(String nome, String cpf, String registroFuncionario, String cel, String responsavel, int produtos) {
        super(nome, cpf, registroFuncionario, cel, responsavel);
        this.produtos = produtos;
    }

    public int getProdutos() {
        return produtos;
    }

    public void setProdutos(int produtos) {
        this.produtos = produtos;
    }
    @Override
    protected void visualizar(){
        super.visualizar();
        System.out.println("Quantidade de Produtos:"+this.produtos);
    }
}

public class TestaFuncionario {
    public static void main(String[] args) {
        POO.Funcionario.Vendedor vend1 = new POO.Funcionario.Vendedor("Gustavo", "565432435-6", "12-3456", "215675765", "Goluel", 10000);
        POO.Funcionario.Vendedor vend2 = new POO.Funcionario.Vendedor("Margarete", "565439735-6", "12-3636", "215865765", "Leandro", 678456);

        POO.Funcionario.Gerente ger1 = new POO.Funcionario.Gerente("Marcelo", "565432435-6", "10-3456", "218975765", "Goluel", 51);
        POO.Funcionario.Gerente ger2 = new POO.Funcionario.Gerente("Oswaldo", "565674435-6", "10-3236", "245655765", "Gabriel", 324);

        System.out.println("1o Funcionario:\n");
        vend1.visualizar();
        System.out.println("\n2o Funcionario:\n");
        vend2.visualizar();
        System.out.println("1o Gerente:\n");
        ger1.visualizar();
        System.out.println("\n2o Gerente:\n");
        ger2.visualizar();
    }
}
