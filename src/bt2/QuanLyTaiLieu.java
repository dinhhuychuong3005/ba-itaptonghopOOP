package bt2;

import java.util.Scanner;

public class QuanLyTaiLieu {
    private TaiLieu[] arr = new TaiLieu[3];
    private int size = 0;

    public QuanLyTaiLieu() {
    }

    public TaiLieu[] getArr() {
        return arr;
    }

    public void setArr(TaiLieu[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void themTaiLieu(TaiLieu taiLieu) {
        arr[size] = taiLieu;
        size++;
    }

    public void timKiemSach() {
        boolean check = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] instanceof Sach) {
                index = i;
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.println(arr[index]);
        } else System.out.println("không tìm thấy tài liệu cần tìm");
    }
    public void timKiemBao() {
        boolean check = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] instanceof Bao) {
                index = i;
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.println(arr[index]);
        } else System.out.println("không tìm thấy tài liệu cần tìm");
    }
    public void timKiemTapchi() {
        boolean check = false;
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] instanceof TapChi) {
                index = i;
                check = true;
                break;
            }
        }
        if (check == true) {
            System.out.println(arr[index]);
        } else System.out.println("không tìm thấy tài liệu cần tìm");
    }

    public void xoa(TaiLieu[] arr) {
        Scanner sc = new Scanner(System.in);
        int indexOfXoa = -1;
        System.out.println("Nhap ma tai lieu muon xoa");
        int maTaiLieu = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(maTaiLieu==arr[i].getId()){
                indexOfXoa = i;
                break;
            }
        }
        if(indexOfXoa >= 0) {
            arr[indexOfXoa] = null;
            for (int i = indexOfXoa; i < size; i++) {
                arr[i] = arr[i+1];
                arr[i+1] = null;
            }
            this.size = this.size - 1;
        }else {
            System.out.println("Khong tim thay ma tai lieu nay");
        }

            }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i].toString());
        }
    }
}
