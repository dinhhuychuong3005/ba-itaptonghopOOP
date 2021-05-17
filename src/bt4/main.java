package bt4;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {

            System.out.println("Enter address:");
            scanner.nextLine();
            String address = scanner.nextLine();

            System.out.println("Enter number person");
            int number = scanner.nextInt();
            Person[] persons = new Person[number];

            System.out.println("nhập thông tin từng người trong gia đình:");
            for (int j = 0; j < number; j++) {
                System.out.println("Nhập tên:");
                String name = scanner.next();
                System.out.print("Nhập tuổi");
                int age = scanner.nextInt();
                System.out.print("công việc:");
                String job = scanner.next();
                System.out.print("Nhập số CMT");
                String passport = scanner.next();
                Person person = new Person(name, age, job, passport);
                persons[j] = person;
            }
            Family family = new Family(persons, address);
            town.thêm(family);
        }
        System.out.println("Khu phố có " + n + " Hộ gia đình là:");
        town.display();
    }
}
