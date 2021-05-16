package bt2;

public class TapChi extends TaiLieu {
    private int numberIssue;
    private int monthIssue;

    public TapChi() {
    }

    public TapChi(int id, int number, String nameNxb, int numberIssue, int monthIssue) {
        super(id, number, nameNxb);
        this.numberIssue = numberIssue;
        this.monthIssue = monthIssue;
    }

    public int getNumberIssue() {
        return numberIssue;
    }

    public void setNumberIssue(int numberIssue) {
        this.numberIssue = numberIssue;
    }

    public int getMonthIssue() {
        return monthIssue;
    }

    public void setMonthIssue(int monthIssue) {
        this.monthIssue = monthIssue;
    }

    @Override
    public String toString() {
        return "TapChi{" +
                "numberIssue=" + numberIssue +
                ", monthIssue=" + monthIssue +
                ", id='" + super.getId() + '\'' +
                ", nxb='" + super.getNameNxb() + '\'' +
                ", number='" + super.getNumber() + '\'' +
                '}';
    }
}
