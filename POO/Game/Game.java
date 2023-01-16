package POO.Game;

public class Game {
    protected String nomeGame, produtor, estilo, plataforma, devs;
    protected float preco;

    protected Game(String nomeGame, String produtor, String estilo, String plataforma, String devs, float preco) {
        this.nomeGame = nomeGame;
        this.produtor = produtor;
        this.estilo = estilo;
        this.plataforma = plataforma;
        this.devs = devs;
        this.preco = preco;
    }

    protected String getNomeGame() {
        return nomeGame;
    }

    protected void setNomeGame(String nomeGame) {
        this.nomeGame = nomeGame;
    }

    protected String getProdutor() {
        return produtor;
    }

    protected void setProdutor(String produtor) {
        this.produtor = produtor;
    }

    protected String getEstilo() {
        return estilo;
    }

    protected void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    protected String getPlataforma() {
        return plataforma;
    }

    protected void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    protected String getDevs() {
        return devs;
    }

    protected void setDevs(String devs) {
        this.devs = devs;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    protected void visualizar(){
        System.out.printf("Nome do game: "+nomeGame+
                "\nProdutor: "+produtor+
                "\nEstilo: "+estilo+
                "\nPlataforma: "+plataforma+
                "\nDesenvolvedores: "+devs+
                "\nPreço: %.2f",preco
        );
    }
}
