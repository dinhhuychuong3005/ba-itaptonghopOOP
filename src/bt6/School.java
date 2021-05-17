package bt6;

public class School {
    Student [] arr = new Student[10];
    private int size = 0;

    public School(Student[] arr, int size) {
        this.arr = arr;
        this.size = size;
    }

    public School() {
    }

    public Student[] getArr() {
        return arr;
    }

    public void setArr(Student[] arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Student student){
        arr[size] = student;
        size++;
    }
    public void showStudent20YearOld(Student []arr){
        for (int i = 0;i<size;i++){
            if (arr[i].getAge() == 20){
                System.out.println(arr[i]);
            }
        }
    }
    public int countStudent23YearOld(Student []arr ){
        int count = 0;
        for (int i = 0;i<size;i++){
            if (arr[i].getAge() == 23 && arr[i].getAddress().equals("DN")){
                count++;
            }
        }
        return count;
    }
}
