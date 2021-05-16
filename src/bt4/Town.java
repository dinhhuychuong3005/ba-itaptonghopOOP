package bt4;

import java.util.Scanner;

public class Town {
    private Family[] arr1 = new Family[5];
    private int size = 0;

    public Town(Family[] arr1) {
        this.arr1 = arr1;
    }

    public Town() {
    }

    public Family[] getArr1() {
        return arr1;
    }

    public void setArr1(Family[] arr1) {
        this.arr1 = arr1;
    }

    public void thêm(Family family) {
        arr1[size] = family;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr1[i].toString());
        }
    }
}
