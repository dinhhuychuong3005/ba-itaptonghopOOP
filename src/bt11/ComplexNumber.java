package bt11;

import java.util.Scanner;

public class ComplexNumber {
    private  double real,virtual;

    public ComplexNumber() {
    }

    public ComplexNumber(double real, double virtual) {
        this.real = real;
        this.virtual = virtual;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getVirtual() {
        return virtual;
    }

    public void setVirtual(double virtual) {
        this.virtual = virtual;
    }
    public String display(){
        return (""+ real + " + " + virtual + "");
    }
    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào 1 số phức có phần thực là:");
        double real = scanner.nextDouble();
        System.out.println("Nhập vào 1 số phức có phần ảo là:");
        double virtual = scanner.nextDouble();
        ComplexNumber complexNumber = new ComplexNumber(real,virtual);
    }
public double sum(ComplexNumber complexNumber1,ComplexNumber complexNumber){
        return ((complexNumber1.getReal() + complexNumber.getReal()) + (complexNumber1.getVirtual() + complexNumber.getVirtual()));
}
    @Override
    public String toString() {
        return "ComplexNumber{" +
                "real=" + real +
                ", virtual=" + virtual +
                '}';
    }
}
