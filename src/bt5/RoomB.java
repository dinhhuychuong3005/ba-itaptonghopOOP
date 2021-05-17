package bt5;

public class RoomB extends Room {
    public RoomB() {
    }

    public RoomB(int price, String category) {
        super(300, "B");
    }
    @Override
    public String toString() {
        return "RoomB={" + "price=" + getPrice()
                + "category=" + getCategory() + "}";
    }
}
