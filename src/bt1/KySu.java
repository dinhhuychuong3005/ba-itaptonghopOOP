package bt1;

import bt1.CanBo;
public class KySu extends CanBo {
    private String branch;
    public KySu(){}
    public KySu(String name, String address, String gender, int age,String branch){
        super(name, address, gender, age);
        this.branch = branch;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "KySu{" +
                "branch='" + branch + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}

