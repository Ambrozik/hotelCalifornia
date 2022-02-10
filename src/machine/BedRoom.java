package machine;

public class BedRoom {
    StateRoom state;
    private final int number;

    public BedRoom(int number) {
        this.number = number;
        this.state = StateRoom.available;

    }

    public void isReserved() {
        this.state = StateRoom.unavailable;
    }

    public int getNumber() {
        return number;
    }

    public StateRoom getState(){
        return this.state;
    }

    public void setState(StateRoom state){
        this.state = state;
    }


}
