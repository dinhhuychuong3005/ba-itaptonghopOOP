package bt9;

public class Customer {
    private String name;
    private String numberHouse;
    private int codeElectric;

    public Customer() {
    }

    public Customer(String name, String numberHouse, int codeElectric) {
        this.name = name;
        this.numberHouse = numberHouse;
        this.codeElectric = codeElectric;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public int getCodeElectric() {
        return codeElectric;
    }

    public void setCodeElectric(int codeElectric) {
        this.codeElectric = codeElectric;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", numberHouse='" + numberHouse + '\'' +
                ", codeElectric=" + codeElectric +
                '}';
    }
}
