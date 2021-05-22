package bt9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCustomer managerCustomer = new ManagerCustomer();

        System.out.print("Nhập tên chủ hộ: ");
        String hoTenChuNha = sc.nextLine();
        System.out.print("Nhập số nhà: ");
        String soNha = sc.nextLine();
        System.out.print("Mã số công tơ: ");
        int maSoCongTo = sc.nextInt();
        int oldIndex;
        int newIndex;
        do {
            System.out.println("Nhập số công tơ cũ:");
            oldIndex = sc.nextInt();
            System.out.println("Nhập số công tơ mới:");
            newIndex = sc.nextInt();
        }while (oldIndex > newIndex);

        System.out.println("số tiền phải trả");
        double moneyPay = managerCustomer.moneyPay(newIndex,oldIndex);
        System.out.println(moneyPay);
        Receipt receipt = new Receipt(hoTenChuNha,soNha,maSoCongTo,oldIndex,newIndex,moneyPay);
        managerCustomer.add(receipt);
        managerCustomer.display();
        managerCustomer.edit(soNha,new Receipt("abc","23",11,200,260,300));
        managerCustomer.display();
        managerCustomer.delete("23");
        System.out.println("sau khi xóa");
        managerCustomer.display();
    }
}
