package bt4;

import java.util.Arrays;

public class Family {
    private Person [] arr = new Person[5];
    private int size = 0;
    private String address;

    public Family() {
    }

    public Family(Person[] arr, String address) {
        this.arr = arr;
        this.address = address;
    }
    public void thêm(Person person) {
        arr[size] = person;
        size++;
    }
    public Person[] getArr() {
        return arr;
    }

    public void setArr(Person[] arr) {
        this.arr = arr;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Family{" +
                "arr=" + arr +
                ", address='" + address + '\'' +
                '}';
    }
}
