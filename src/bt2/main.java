package bt2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
        while (true) {
            System.out.println("Application Manager Document");
            System.out.println("Enter 1: To insert document");
            System.out.println("Enter 2: To search document by category: ");
            System.out.println("Enter 3: To show information documents");
            System.out.println("Enter 4: To remove document by id");
            System.out.println("Enter 5: To exit:");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("Enter a: thêm sách");
                    System.out.println("Enter b: thêm báo");
                    System.out.println("Enter c: thêm tạp chí");
                    String type = sc.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.println("Enter id:");
                            int id = sc.nextInt();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            System.out.println("Enter tên nhà xuất bản:");
                            String nameNxb = sc.next();
                            System.out.println("Enter tên tác giả:");
                            String nameTg = sc.next();
                            System.out.println("Enter số trang:");
                            int sotrang = sc.nextInt();
                            TaiLieu sach = new Sach(id, number, nameNxb, nameTg, sotrang);
                            quanLyTaiLieu.themTaiLieu(sach);
                            System.out.println(sach.toString());
                            break;
                        }
                        case "b": {
                            System.out.println("Enter id:");
                            int id = sc.nextInt();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            System.out.println("Enter tên nhà xuất bản:");
                            String nameNxb = sc.next();
                            System.out.println("Enter ngày phát hành");
                            int dayIssue = sc.nextInt();
                            TaiLieu bao = new Bao(id, number, nameNxb, dayIssue);
                            quanLyTaiLieu.themTaiLieu(bao);
                            System.out.println(bao.toString());
                            break;
                        }
                        case "c": {
                            System.out.println("Enter id:");
                            int id = sc.nextInt();
                            System.out.println("Enter number:");
                            int number = sc.nextInt();
                            System.out.println("Enter tên nhà xuất bản:");
                            String nameNxb = sc.nextLine();
                            System.out.println("Enter số phát hành");
                            int numberIssue = sc.nextInt();
                            System.out.println("Enter tháng phát hành");
                            int monthIssue = sc.nextInt();
                            TaiLieu tapchi = new TapChi(id, number, nameNxb, numberIssue, monthIssue);
                            quanLyTaiLieu.themTaiLieu(tapchi);
                            System.out.println(tapchi.toString());
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("Bạn muốn tìm kiếm theo loại nào :");
                    System.out.println("1.Sách");
                    System.out.println("2.Tạp chí");
                    System.out.println("3.Báo");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1: {
                            quanLyTaiLieu.timKiemSach();
                            break;
                        }
                        case 2: {
                            quanLyTaiLieu.timKiemTapchi();
                            break;
                        }
                        case 3: {
                            quanLyTaiLieu.timKiemBao();
                            break;
                        }
                        default:
                            System.out.println("Invalid");
                            break;
                    }
                    break;
                }
                case "4": {
                    quanLyTaiLieu.xoa(quanLyTaiLieu.getArr());
                }
                case "3": {
                    quanLyTaiLieu.print();
                    break;
                }
                case "5" : {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
