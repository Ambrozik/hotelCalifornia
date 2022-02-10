package context;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Clément Colné
 */
public class EnsCard {

    private List<Card> usefullCards;
    private List<Card> lostCards;

    public EnsCard() {
        usefullCards = new ArrayList<>();
    }

    public Card getCard(int cardId) {
        Card card = null;
        for(Card c : usefullCards) {
            if(c.getId() == cardId) {
                card = c;
            }
        }
        return card;
    }

    public void setLost(int cardId) {
        for(Card c : usefullCards) {
            if(c.getId() == cardId) {
                lostCards.add(c);
                usefullCards.remove(c);
            }
        }
    }

    public void toStringUsefullCards() {
        for(Card c : usefullCards) {
            c.toString();
        }
    }

    public void toStringLostCards() {
        for(Card c : lostCards) {
            c.toString();
        }
    }

}
