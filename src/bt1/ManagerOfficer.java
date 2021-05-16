package bt1;

public class ManagerOfficer {
    private CanBo[] arr1 = new CanBo[5];
    private int size = 0;

    public ManagerOfficer() {
    }

    public CanBo[] getArr1() {
        return arr1;
    }

    public void setArr1(CanBo[] arr1) {
        this.arr1 = arr1;
    }

    public void addOfficer(CanBo officer) {
        arr1[size] = officer;
        size++;
    }

    public void timkiem(String name) {
        boolean check = false;
        int index = 0;
        for (int i = 0; i <= size; i++) {
            if (name.equals(arr1[i].getName())) {
                check = true;
                index = i;
                break;
            }
            }
            if (check == true) {
                System.out.println(index + 1);
            } else {
                System.out.println("không có cán bộ cần tìm");
            }
        }


    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i].toString());
        }
    }
}

