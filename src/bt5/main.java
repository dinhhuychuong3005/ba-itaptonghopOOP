package bt5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Nhập lựa chọn:");
            System.out.println("1.Thêm khách");
            System.out.println("2.Xóa khách");
            System.out.println("3.Hiển thị thông tin của khách");
            System.out.println("4.Tính số tiền của khách theo cmt");
            System.out.println("5.Exit");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a.Room A");
                    System.out.println("b.Room B");
                    System.out.println("c. Room C");
                    String choice = sc.nextLine();
                    switch (choice) {
                        case "a": {
                            System.out.println("Nhập tên khách");
                            String name = sc.next();
                            System.out.println("Nhập tuổi");
                            int age = sc.nextInt();
                            System.out.println("Nhập số chứng minh thư");
                            String passport = sc.next();
                            System.out.println("Nhập số phòng:");
                            int numberRent = sc.nextInt();
                            Room room = new RoomA(500, "A");
                            Person person = new Person(name, age, passport, numberRent, room);
                            hotel.them(person);
                            break;
                        }
                        case "b": {
                            System.out.println("Nhập tên khách");
                            String name = sc.next();
                            System.out.println("Nhập tuổi");
                            int age = sc.nextInt();
                            System.out.println("Nhập số chứng minh thư");
                            String passport = sc.next();
                            System.out.println("Nhập số phòng:");
                            int numberRent = sc.nextInt();
                            Room room = new RoomA(300, "B");
                            Person person1 = new Person(name, age, passport, numberRent, room);
                            hotel.them(person1);
                            break;
                        }
                        case "c": {
                            System.out.println("Nhập tên khách");
                            String name = sc.next();
                            System.out.println("Nhập tuổi");
                            int age = sc.nextInt();
                            System.out.println("Nhập số chứng minh thư");
                            String passport = sc.next();
                            System.out.println("Nhập số phòng:");
                            int numberRent = sc.nextInt();
                            Room room = new RoomA(100, "C");
                            Person person2 = new Person(name, age, passport, numberRent, room);
                            hotel.them(person2);
                            break;
                        }
                        default:
                            System.out.println("none");
                            break;
                    }
                    break;
                }
                case "2": {
                    hotel.xoa(hotel.getArr());
                    break;
                }
                case "3": {
                    hotel.print();
                    break;
                }
                case "4": {
                    System.out.println(hotel.tinh(hotel.getArr()));
                    break;
                }
                default:
                    System.out.println("none");
                    break;
            }
        }
    }
}
