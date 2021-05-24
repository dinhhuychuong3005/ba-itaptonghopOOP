package bt10;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 chuỗi");
        String st = scanner.nextLine();
        VanBan vanBan = new VanBan();
        System.out.println(vanBan.count(st));
    }
}
