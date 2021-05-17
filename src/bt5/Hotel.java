package bt5;

import java.util.Scanner;

public class Hotel {
    private Person[] arr = new Person[10];
    private int size = 0;

    public Hotel() {
    }

    public Hotel(Person[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public Person[] getArr() {
        return arr;
    }

    public void setArr(Person[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void them(Person person) {
        arr[size] = person;
        size++;
    }

    public void xoa(Person[] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số chứng minh thư của khách cần xóa");
        String x = sc.nextLine();
        Person[] arr1 = new Person[size - 1];
        boolean check = false;
        for (int i = 0; i < size; i++) {
            if (x.equals(arr[i].getPassport())) {
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

    public int tinh(Person [] arr) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập số chứng minh thư của khách cần tính");
        String x = sc.nextLine();
        for (int i = 0;i<size;i++){
            if (x.equals(arr[i].getPassport())){
                return arr[i].getRoom().getPrice() * arr[i].getNumberRent();
            }
        }
        return -1;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
