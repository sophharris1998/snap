public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        CardGame game = new CardGame ("Snap");
        System.out.println(game.getDeck());
        System.out.println(game.dealCard());
        System.out.println(game.getDeck());

        game.sortDeckInNumberOrder();
        System.out.println(game.getDeck());
        System.out.println(game.dealCard());
        System.out.println(game.getDeck());

    }
}