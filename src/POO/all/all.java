//package POO.all;
//
////Exercicio 1
//
//public class ClasseCurso {
//    protected String curso, instituicao, pesoNota;
//    protected int alunos, cargaHoraria;
//
//    public ClasseCurso(String curso, String instituicao, String pesoNota, int alunos, int cargaHoraria) {
//        this.curso = curso;
//        this.instituicao = instituicao;
//        this.pesoNota = pesoNota;
//        this.alunos = alunos;
//        this.cargaHoraria = cargaHoraria;
//    }
//
//    public String getCurso() {
//        return curso;
//    }
//
//    public void setCurso(String curso) {
//        this.curso = curso;
//    }
//
//    public String getInstituicao() {
//        return instituicao;
//    }
//
//    public void setInstituicao(String instituicao) {
//        this.instituicao = instituicao;
//    }
//
//    public String getPesoNota() {
//        return pesoNota;
//    }
//
//    public void setPesoNota(String pesoNota) {
//        this.pesoNota = pesoNota;
//    }
//
//    public int getAlunos() {
//        return alunos;
//    }
//
//    public void setAlunos(int alunos) {
//        this.alunos = alunos;
//    }
//
//    public int getCargaHoraria() {
//        return cargaHoraria;
//    }
//
//    public void setCargaHoraria(int cargaHoraria) {
//        this.cargaHoraria = cargaHoraria;
//    }
//
//    protected void visualizar(){
//        System.out.println("Curso: "+curso+
//                "\nInstituicao: "+instituicao+
//                "\nPeso na nota final das matérias: "+pesoNota+
//                "\nAlunos: "+alunos+
//                "\nCarga horária: "+cargaHoraria
//        );
//    }
//}
//
//public class TestaClasseCurso {
//    public static void main(String[] args) {
//        ClasseCurso curso1 = new ClasseCurso("Estrutura de dados", "Fatec", "20%", 400, 700);
//        ClasseCurso curso2 = new ClasseCurso("Matemática aplicada III", "USP", "31%", 60, 650);
//
//        System.out.println("1o Curso:\n");
//        curso1.visualizar();
//        System.out.println("\n2o Curso:\n");
//        curso2.visualizar();
//    }
//}
//
////Exercicio 2
//
//public class Cliente {
//    protected String cpf, nome, sobreNome, cel;
//    protected int idade;
//
//    protected Cliente(String cpf, String nome, String sobreNome, String cel, int idade) {
//        this.cpf = cpf;
//        this.nome = nome;
//        this.sobreNome = sobreNome;
//        this.cel = cel;
//        this.idade = idade;
//    }
//
//    protected String getCpf() {
//        return cpf;
//    }
//
//    protected void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    protected String getNome() {
//        return nome;
//    }
//
//    protected void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    protected String getSobreNome() {
//        return sobreNome;
//    }
//
//    protected void setSobreNome(String sobreNome) {
//        this.sobreNome = sobreNome;
//    }
//
//    protected String getCel() {
//        return cel;
//    }
//
//    protected void setCel(String cel) {
//        this.cel = cel;
//    }
//
//    protected int getIdade() {
//        return idade;
//    }
//
//    protected void setIdade(int idade) {
//        this.idade = idade;
//    }
//
//    protected void visualizar(){
//        System.out.println("Nome:"+nome+
//                "\nSobernome:"+sobreNome+
//                "\nIdade:"+idade+
//                "\nCelular:"+cel+
//                "\nCPF:"+cpf
//        );
//    }
//}
//
//public class TestaCliente {
//    public static void main(String[] args) {
//        Cliente cliente1 = new Cliente("123456789-9", "Amanda", "Silva", "1199878765", 17);
//        Cliente cliente2 = new Cliente("123456789-4", "Gabriel", "João", "1199568765", 19);
//
//
//        System.out.println("1o Cliente:\n");
//        cliente1.visualizar();
//        System.out.println("\n2o Cliente:\n");
//        cliente2.visualizar();
//    }
//}
//
////Exercicio 3
//
//public class Farmacia {
//    protected String remedio, quantidade, cnpj, cosmetico, funcionario;
//
//    protected Farmacia(String remedio, String quantidade, String cnpj, String cosmetico, String funcionario) {
//        this.remedio = remedio;
//        this.quantidade = quantidade;
//        this.cnpj = cnpj;
//        this.cosmetico = cosmetico;
//        this.funcionario = funcionario;
//    }
//
//    protected String getRemedio() {
//        return remedio;
//    }
//
//    protected void setRemedio(String remedio) {
//        this.remedio = remedio;
//    }
//
//    protected String getQuantidade() {
//        return quantidade;
//    }
//
//    protected void setQuantidade(String quantidade) {
//        this.quantidade = quantidade;
//    }
//
//    protected String getCnpj() {
//        return cnpj;
//    }
//
//    protected void setCnpj(String cnpj) {
//        this.cnpj = cnpj;
//    }
//
//    protected String getCosmetico() {
//        return cosmetico;
//    }
//
//    protected void setCosmetico(String cosmetico) {
//        this.cosmetico = cosmetico;
//    }
//
//    protected String getFuncionario() {
//        return funcionario;
//    }
//
//    protected void setFuncionario(String funcionario) {
//        this.funcionario = funcionario;
//    }
//    protected void visualizar(){
//        System.out.printf("Remédio: "+remedio+
//                "\nQuantidae: "+quantidade+
//                "\nCNPJ: "+cnpj+
//                "\nCosmético: "+cosmetico+
//                "\nFuncionario  : "+funcionario
//        );
//    }
//}
//
//public class TestaFarmacia {
//    public static void main(String[] args) {
//        Farmacia farmacia1 = new Farmacia("Dipirona", "500ml", "123123210001-7", "Algodao", "Geandro");
//        Farmacia farmacia2 = new Farmacia("Paracetamol", "100ml", "123123210001-7", "Desodorante", "Jacqueline");
//
//        System.out.println("1o Farmacia:\n");
//        farmacia1.visualizar();
//        System.out.println("\n\n2o Farmacia:\n");
//        farmacia2.visualizar();
//    }
//}
//
////Exercicio 4
//
//public class Funcionario {
//    protected String nome, cpf, registroFuncionario, cel, responsavel;
//
//    protected Funcionario(String nome, String cpf, String registroFuncionario, String cel, String responsavel) {
//        this.nome = nome;
//        this.cpf = cpf;
//        this.registroFuncionario = registroFuncionario;
//        this.cel = cel;
//        this.responsavel = responsavel;
//    }
//
//    protected String getNome() {
//        return nome;
//    }
//
//    protected void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    protected String getCpf() {
//        return cpf;
//    }
//
//    protected void setCpf(String cpf) {
//        this.cpf = cpf;
//    }
//
//    protected String getRegistroFuncionario() {
//        return registroFuncionario;
//    }
//
//    protected void setRegistroFuncionario(String registroFuncionario) {
//        this.registroFuncionario = registroFuncionario;
//    }
//
//    protected String getCel() {
//        return cel;
//    }
//
//    protected void setCel(String cel) {
//        this.cel = cel;
//    }
//
//    protected String getResponsavel() {
//        return responsavel;
//    }
//
//    protected void setResponsavel(String responsavel) {
//        this.responsavel = responsavel;
//    }
//
//    protected void visualizar(){
//        System.out.println("Nome:"+nome+
//                "\nCPF:"+cpf+
//                "\nRegistro do funcionário:"+registroFuncionario+
//                "\nCelular:"+cel+
//                "\nResponsável:"+responsavel
//        );
//    }
//}
//
//public class TestaFuncionario {
//    public static void main(String[] args) {
//        Funcionario func1 = new Funcionario("Gustavo", "565432435-6", "12-3456", "215675765", "Goluel");
//        Funcionario func2 = new Funcionario("Margarete", "565439735-6", "12-3636", "215865765", "Leandro");
//
//        System.out.println("1o Funcionario:\n");
//        func1.visualizar();
//        System.out.println("\n2o Funcionario:\n");
//        func2.visualizar();
//    }
//}
//
////Exercicio 5
//
//public class Game {
//    protected String nomeGame, produtor, estilo, plataforma, devs;
//    protected float preco;
//
//    protected Game(String nomeGame, String produtor, String estilo, String plataforma, String devs, float preco) {
//        this.nomeGame = nomeGame;
//        this.produtor = produtor;
//        this.estilo = estilo;
//        this.plataforma = plataforma;
//        this.devs = devs;
//        this.preco = preco;
//    }
//
//    protected String getNomeGame() {
//        return nomeGame;
//    }
//
//    protected void setNomeGame(String nomeGame) {
//        this.nomeGame = nomeGame;
//    }
//
//    protected String getProdutor() {
//        return produtor;
//    }
//
//    protected void setProdutor(String produtor) {
//        this.produtor = produtor;
//    }
//
//    protected String getEstilo() {
//        return estilo;
//    }
//
//    protected void setEstilo(String estilo) {
//        this.estilo = estilo;
//    }
//
//    protected String getPlataforma() {
//        return plataforma;
//    }
//
//    protected void setPlataforma(String plataforma) {
//        this.plataforma = plataforma;
//    }
//
//    protected String getDevs() {
//        return devs;
//    }
//
//    protected void setDevs(String devs) {
//        this.devs = devs;
//    }
//
//    public float getPreco() {
//        return preco;
//    }
//
//    public void setPreco(float preco) {
//        this.preco = preco;
//    }
//
//    protected void visualizar(){
//        System.out.printf("Nome do game: "+nomeGame+
//                "\nProdutor: "+produtor+
//                "\nEstilo: "+estilo+
//                "\nPlataforma: "+plataforma+
//                "\nDesenvolvedores: "+devs+
//                "\nPreço: %.2f",preco
//        );
//    }
//}
//
//public class TestaGame {
//    public static void main(String[] args) {
//        Game gamer1 = new Game("Bloodborne", "Masaaki Yamagiwa", "Role Play game de ação", "Playstation 4", "From Software", 99.90f);
//        Game gamer2 = new Game("Dark Souls", "Hidetaka Miyazaki", "Role Play game de ação", "PlayStation 3, Xbox 360", "Jun Ito", 139.90f);
//
//        System.out.println("\n1o game da loja de games:\n");
//        gamer1.visualizar();
//        System.out.println("\n2o game da loja de games:\n");
//        gamer2.visualizar();
//    }
//}
//
////Exercicio 6
//
//public class Ingresso {
//    protected String banda, local, horario, date, premium;
//
//    public Ingresso(String banda, String local, String horario, String date, String premium) {
//        this.banda = banda;
//        this.local = local;
//        this.horario = horario;
//        this.date = date;
//        this.premium = premium;
//    }
//
//    public String getBanda() {
//        return banda;
//    }
//
//    public void setBanda(String banda) {
//        this.banda = banda;
//    }
//
//    public String getLocal() {
//        return local;
//    }
//
//    public void setLocal(String local) {
//        this.local = local;
//    }
//
//    public String getHorario() {
//        return horario;
//    }
//
//    public void setHorario(String horario) {
//        this.horario = horario;
//    }
//
//    public String getDate() {
//        return date;
//    }
//
//    public void setDate(String date) {
//        this.date = date;
//    }
//
//    public String getPremium() {
//        return premium;
//    }
//
//    public void setPremium(String premium) {
//        this.premium = premium;
//    }
//
//    protected void visualizar(){
//        System.out.println("Banda: "+banda+
//                "\nLocal: "+local+
//                "\nHorário: "+horario+
//                "\ndate: "+date+
//                "\nPremium  : "+premium
//        );
//    }
//}
//public class TestaIngresso {
//    public static void main(String[] args) {
//        Ingresso ingresso1 = new Ingresso("Iron maiden", "Sao paulo", "21h", "21/12/2006", "Sim");
//        Ingresso ingresso2= new Ingresso("Pink Floyd", "Rio de janeiro", "15h", "07/09/2017", "Sim");
//
//        System.out.println("1o Ingresso:\n");
//        ingresso1.visualizar();
//        System.out.println("\n2o Ingresso:\n");
//        ingresso2.visualizar();
//    }
//}
