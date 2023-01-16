package POO.Game;

public class TestaGame {
    public static void main(String[] args) {
        Game gamer1 = new Game("Bloodborne", "Masaaki Yamagiwa", "Role Play game de ação", "Playstation 4", "From Software", 99.90f);
        Game gamer2 = new Game("Dark Souls", "Hidetaka Miyazaki", "Role Play game de ação", "PlayStation 3, Xbox 360", "Jun Ito", 139.90f);

        System.out.println("\n1o game da loja de games:\n");
        gamer1.visualizar();
        System.out.println("\n2o game da loja de games:\n");
        gamer2.visualizar();
    }
}
