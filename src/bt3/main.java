package bt3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh tuyenSinh = new TuyenSinh();
        while (true) {
            System.out.println("Tuyển sinh");
            System.out.println("1.Thêm thí sinh");
            System.out.println("2.Hiển thị thông tin thí sinh và khố thi của thí sinh");
            System.out.println("3.Tìm kiếm theo số báo danh");
            System.out.println("4.Exit");
            String type = sc.nextLine();
            switch (type) {
                case "1": {
                    System.out.println("a.Thêm thí sinh khối A:");
                    System.out.println("b.Thêm thí sinh khối B:");
                    System.out.println("c.Thêm thí sinh khối C:");
                    String line = sc.nextLine();
                    switch (line) {
                        case "a": {
                            System.out.println("Nhập số báo danh");
                            int id = sc.nextInt();
                            System.out.println("Nhập tên");
                            String name = sc.next();
                            System.out.println("Nhập địa chỉ");
                            String address = sc.next();
                            System.out.println("Nhập độ ưu tiên:");
                            int priority = sc.nextInt();
                            ThiSinh thisinhkhoa = new ThiSinhKhoiA(id, name, address, priority);
                            tuyenSinh.them(thisinhkhoa);
                            System.out.println(thisinhkhoa.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Nhập số báo danh");
                            int id = sc.nextInt();
                            System.out.print("Nhập tên");
                            String name = sc.nextLine();
                            System.out.print("Nhập địa chỉ");
                            String address = sc.nextLine();
                            System.out.print("Nhập độ ưu tiên:");
                            int priority = sc.nextInt();
                            ThiSinh thiSinhKhoiB = new ThiSinhKhoiB(id, name, address, priority);
                            tuyenSinh.them(thiSinhKhoiB);
                            System.out.println(thiSinhKhoiB.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Nhập số báo danh");
                            int id = sc.nextInt();
                            System.out.print("Nhập tên");
                            String name = sc.nextLine();
                            System.out.print("Nhập địa chỉ");
                            String address = sc.nextLine();
                            System.out.print("Nhập độ ưu tiên:");
                            int priority = sc.nextInt();
                            ThiSinh thiSinhKhoiC = new ThiSinhKhoiC(id, name, address, priority);
                            tuyenSinh.them(thiSinhKhoiC);
                            System.out.println(thiSinhKhoiC.toString());
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "2": {
                    tuyenSinh.print();
                    break;
                }
                case "3": {
                    System.out.println("Nhập số báo danh thí sinh cần tìm:");
                    int id = sc.nextInt();
                    if (tuyenSinh.timkiem(id) == -1) {
                        System.out.println("không có thí sinh nào có số báo danh trên");
                    } else {
                        System.out.println(tuyenSinh.timkiem(id));
                    }
                    break;
                }
                case "4" : {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
