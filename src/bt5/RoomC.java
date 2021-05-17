package bt5;

public class RoomC extends Room {
    public RoomC() {
    }

    public RoomC(int price, String category) {
        super(100, "C");
    }
    @Override
    public String toString() {
        return "RoomC={" + "price=" + getPrice()
                + "category=" + getCategory() + "}";
    }
}
