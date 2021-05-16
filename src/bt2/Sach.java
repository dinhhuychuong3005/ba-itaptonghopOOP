package bt2;

public class Sach extends TaiLieu {
    private String nameTg;
    private int SoTrang;
    public Sach(){}
    public Sach(int id,int number,String nameNxb,String nameTg,int SoTrang){
        super(id, number, nameNxb);
        this.nameTg = nameTg;
        this.SoTrang = SoTrang;
    }

    public String getNameTg() {
        return nameTg;
    }

    public void setNameTg(String nameTg) {
        this.nameTg = nameTg;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" +
                "nameTg='" + nameTg + '\'' +
                ", SoTrang=" + SoTrang +
                ", id='" + super.getId() + '\'' +
                ", nxb='" + super.getNameNxb() + '\'' +
                ", number='" + super.getNumber() + '\'' +
                '}';
    }
}
