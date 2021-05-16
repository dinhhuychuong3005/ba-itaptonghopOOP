package bt2;

public class TaiLieu {
    private int id,number;
    private String nameNxb;
    public TaiLieu(){}
    public TaiLieu(int id,int number,String nameNxb){
        this.id = id;
        this.number = number;
        this.nameNxb = nameNxb;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNameNxb() {
        return nameNxb;
    }

    public void setNameNxb(String nameNxb) {
        this.nameNxb = nameNxb;
    }
}
