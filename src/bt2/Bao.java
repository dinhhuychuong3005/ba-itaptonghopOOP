package bt2;

public class Bao extends TaiLieu {
    private int dayIssue;

    public Bao() {
    }

    public Bao(int id, int number, String nameNxb, int dayIssue) {
        super(id, number, nameNxb);
        this.dayIssue = dayIssue;
    }

    public int getDayIssue() {
        return dayIssue;
    }

    public void setDayIssue(int dayIssue) {
        this.dayIssue = dayIssue;
    }

    @Override
    public String toString() {
        return "Bao{" +
                "dayIssue=" + dayIssue +
                ", id='" + super.getId() + '\'' +
                ", nxb='" + super.getNameNxb() + '\'' +
                ", number='" + super.getNumber() + '\'' +
                '}';
    }
}
