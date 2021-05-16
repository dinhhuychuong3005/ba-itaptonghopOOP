package bt3;

public class ThiSinhKhoiA extends ThiSinh{
    public static final String MON_TOAN = "Toan";
    public static final String MON_LY = "Ly";
    public static final String MON_HOA = "Hoa";
    public ThiSinhKhoiA(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ThisinhkhoiA{" +
                "id='" + super.getId() + '\'' +
                ", name='" + super.getName() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", priority=" + super.getPriority() + ", Subject: " + MON_TOAN + " - " + MON_LY + " - " + MON_HOA +
                '}';

    }
}
