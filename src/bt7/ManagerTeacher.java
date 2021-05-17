package bt7;

import bt5.Hotel;
import bt5.Person;

import java.util.Scanner;

public class ManagerTeacher {
    Teacher [] arr = new Teacher[20];
    int size = 0;

    public ManagerTeacher(Teacher[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public ManagerTeacher() {
    }

    public Teacher[] getArr() {
        return arr;
    }

    public void setArr(Teacher[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public void add(Teacher teacher){
        arr[size] = teacher;
        size++;
    }
    public void delete(Teacher[]arr){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số chứng minh thư của khách cần xóa");
        String id = sc.nextLine();
        Teacher[] arr1 = new Teacher[size - 1];
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (id.equals(arr[i].getId())) {
                for (int j = 0; j < i; j++) {
                    arr[j] = arr1[j];
                }
                for (int k = i + 1; k < size; k++) {
                    arr1[k - 1] = arr[k];
                }
                check = true;
                break;
            }
            break;
        }
        if (check == true) {
            System.out.println("sau khi xóa:");
            for (int i = 0; i < arr1.length; i++) {
                System.out.println(arr1[i] + ",");
            }
        } else {
            System.out.println("không có khách có số chứng minh thư như trên");
        }
    }
    public double getSalary(Teacher []arr){
Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã giáo viên cần tính lương");
        String id = sc.nextLine();
        for (int i = 0;i<size;i++){
            if (arr[i].getId().equals(id)){
                return ((arr[i].getSalary() + arr[i].getBonus()) - arr[i].getPenaty());
            }
        }
        return -1;
    }
}
