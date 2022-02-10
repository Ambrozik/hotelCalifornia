package context;

public class Card {

    private int idCard;
    private String idRoom;

    /**
     * Constructor for class Card
     *
     * @param idCard of card
     * @param idRoom of room associated
     */
    public Card(int idCard, String idRoom) {
        this.idCard = idCard;
        this.idRoom = idRoom;
    }


    public int getIdCard() {
        return idCard;
    }

    public void setIdCard(int idCard) {
        this.idCard = idCard;
    }

    public String getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(String idRoom) {
        this.idRoom = idRoom;
    }

    public void setCard(int idCard, String idRoom) {
        this.idCard = idCard;
        this.idRoom = idRoom;
    }

    @Override
    public String toString() {
        return "Card{" +
                "idCard=" + idCard +
                ", idRoom='" + idRoom + '\'' +
                '}';
    }

}
