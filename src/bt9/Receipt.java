package bt9;

public class Receipt extends Customer{
    private int oldIndex;
    private int newIndex;
    private double moneyPay;

    public Receipt() {
    }
    public Receipt(String name, String numberHouse, int codeElectric){
        super(name, numberHouse, codeElectric);
    }
    public Receipt(String name, String numberHouse, int codeElectric, int oldIndex, int newIndex, double moneyPay) {
        super(name, numberHouse, codeElectric);
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.moneyPay = moneyPay;
    }

    public int getOldIndex() {
        return oldIndex;
    }

    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }

    public int getNewIndex() {
        return newIndex;
    }

    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }

    public double getMoneyPay() {
        return moneyPay = (this.newIndex - oldIndex) * 5;
    }

    public void setMoneyPay(double moneyPay) {
        this.moneyPay = moneyPay;
    }

    @Override
    public String toString() {
        return super.toString() + "Receipt{" +
                "oldIndex=" + oldIndex +
                ", newIndex=" + newIndex +
                ", moneyPay=" + moneyPay +
                '}';
    }
}
