package bt3;

public class ThiSinhKhoiC extends ThiSinh {
    public static final String MON_VAN = "Van";
    public static final String MON_SU = "Su";
    public static final String MON_DIA = "Dia";

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(int id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    @Override
    public String toString() {
        return "CandidateC{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", priority=" + getPriority() + ", Subject: " + MON_VAN + " - " + MON_SU + " - " + MON_DIA +
                '}';
    }
}

