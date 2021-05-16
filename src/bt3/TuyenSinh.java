package bt3;

public class TuyenSinh {
    private ThiSinh[] arr = new ThiSinh[5];
    private int size = 0;

    public TuyenSinh() {

    }

    public TuyenSinh(ThiSinh[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public ThiSinh[] getArr() {
        return arr;
    }

    public void setArr(ThiSinh[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void them(ThiSinh thiSinh) {
        arr[size] = thiSinh;
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
    }

    public int timkiem(int id) {
        for (int i = 0; i < arr.length; i++) {
            if (id == arr[i].getId()) {
                return i;
            }
        }
        return -1;
    }
}
