package bt4;

import java.util.Scanner;

public class Town {
    private Family[] arr1 = new Family[3];
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

    public void display() {
        for (int i = 0; i < arr1.length; i++) {
            arr1[i].display();
        }
    }
}
