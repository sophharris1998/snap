import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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

}
    public String getDeck() {
        String allCard = "";

        for (int i = 0; i < deckOfCards.stream().count(); i++) {
            allCard += deckOfCards.get(i).toString() + " ";
        }
        return allCard;
    }

    public Card dealCard() {
        return deckOfCards.remove(0);
    }

    public ArrayList<Card> sortDeckInNumberOrder () {
        Collections.sort(deckOfCards, new Comparator<Card>() {
            @Override
            public int compare(Card o1, Card o2) {
                return Integer.valueOf(o1.getValue()).compareTo(o2.getValue());
            }
        });

        return deckOfCards;
    }
}
