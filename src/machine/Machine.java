package machine;

import context.EnsCard;

/**
 * @author Clément Colné
 */
public class Machine {

    private EnsCard ensCard;

    public Machine() {
        ensCard = new EnsCard();
    }

    public void programCard(int cardId, String roomId) {
        ensCard.getCard(cardId).setIdRoom(roomId);
    }

    public void reprogramCard(int cardId, int roomId) {
    }

    public void cancelCard(int cardId) {

    }

    public void looseCard(int cardId) {

    }

    public void unbookRoom(int roomId) {

    }

    public void bookRoom(int roomId, String name) {

    }

}
