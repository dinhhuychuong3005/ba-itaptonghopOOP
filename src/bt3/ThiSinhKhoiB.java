package bt3;

public class ThiSinhKhoiB extends ThiSinh {
    public static final String MON_TOAN = "Toan";
    public static final String MON_HOA = "Hoa";
    public static final String MON_SINH = "Sinh";

    public ThiSinhKhoiB() {
    }

    public ThiSinhKhoiB(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "ThiSinhKhoiB{" +
                "id='" + super.getName() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() + ", Subject: " + MON_TOAN + " - " + MON_SINH + " - " + MON_HOA +
                '}';

    }
}
