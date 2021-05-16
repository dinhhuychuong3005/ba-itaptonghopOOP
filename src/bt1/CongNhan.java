package bt1;

import bt1.CanBo;

public class CongNhan extends CanBo {
    private int level;
    public CongNhan(){}
    public CongNhan(String name, String address, String gender, int age,int level){
        super(name, address, gender, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "level=" + level +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }

}
