package bt1;

import bt1.CanBo;
public class NhanVien extends CanBo {
    private String task;
    public NhanVien(){
    }
    public NhanVien(String name, String address, String gender, int age,String task){
        super(name, address, gender, age);
        this.task = task;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "task='" + task + '\'' +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender='" + getGender() + '\'' +
                ", address='" + getAddress() + '\'' +
                '}';
    }
}
