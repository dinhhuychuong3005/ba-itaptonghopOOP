package bt5;

public class RoomA extends Room {
    public RoomA() {
    }

    public RoomA(int price, String category) {
        super(500, "A");
    }

    @Override
    public String toString() {
        return "RoomA={" + "price=" + getPrice()
                + " ,category=" + getCategory() + "}";
    }
}
