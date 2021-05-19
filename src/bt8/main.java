package bt8;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ManagerCard managerCard = new ManagerCard();
        managerCard.add(new Card("abc",3,"ND","3",20,25,30));
        managerCard.add(new Card("bcd",4,"bc","4",20,25,30));
        managerCard.add(new Card("dce",5,"ab","5",20,25,30));
//        if (managerCard.delete("3")){
//            managerCard.print();
//        }else {
//            managerCard.print();
//        }
        if (managerCard.delete("6")){
            managerCard.print();
        }else {
            managerCard.print();
        }

    }
}
