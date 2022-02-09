package machine.variable;

import context.Card;

public class Reservation {

    private long start;
    private long end;
    private BedRoom bedRoom;
    private Card card;

    public Reservation(long start, long end, BedRoom bedRoom, Card card ) {
        this.start = start;
        this.end = end;
        this.bedRoom = bedRoom;
        this.card = card;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getEnd() {
        return end;
    }

    public void setEnd(long end) {
        this.end = end;
    }

    public BedRoom getBedRoom() {
        return bedRoom;
    }

    public void setBedRoom(BedRoom bedRoom) {
        this.bedRoom = bedRoom;
    }


}
