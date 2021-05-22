package bt9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerCustomer {
    private List <Receipt> list;

    public ManagerCustomer() {
        this.list = new ArrayList<>();
    }

    public List<Receipt> getList() {
        return list;
    }

    public void setList(List<Receipt> list) {
        this.list = list;
    }
    public void add(Receipt receipt){
        list.add(receipt);
    }
    public void display(){
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
    public int check(String id){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getNumberHouse().equals(id)) {
                return i;
            }
        }
        return -1;
    }
    public void edit(String id,Receipt receipt){
        int index = check(id);
        if (index == -1) {
            System.out.println("không có số nhà này");
        } else {
            list.set(index, receipt);
        }
    }
    public void delete(String id){
        int index = check(id);
        if (index == -1) {
            System.out.println("không có số nhà này");
        } else {
            list.remove(index);
        }
    }
    public double moneyPay(int newIndex,int oldIndex ){
        return (newIndex - oldIndex)*5;
    }
}
