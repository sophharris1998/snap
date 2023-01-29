import java.util.ArrayList;

public class CardGame {
    public ArrayList<Card> deckOfCards = new ArrayList<Card>();
    public String name;
    public String[] suitList = {"◆", "♡", "♣", "♠"};
    public String[] symbolList = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    public CardGame (String nameProp)
    {
        name = nameProp;

        for (int i = 0; i < suitList.length; i++) {
            for (int a = 0; a < symbolList.length; a++) {

        Card newCard = new Card();
        newCard.suit=suitList[i];
        newCard.symbol=symbolList[a];
        newCard.value=a + 2;

        deckOfCards.add(newCard);

            }
        }
        System.out.println(deckOfCards);
}}
