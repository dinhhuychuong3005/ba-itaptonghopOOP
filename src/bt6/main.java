package bt6;

public class main {
    public static void main(String[] args) {
        School school = new School();
        Student student = new Student("chuong",20,"ND",3);
        school.add(student);
        Student student1 = new Student("abc",20,"a",4);
        school.add(student1);
        Student student2 = new Student("bcd",23,"DN",5);
        school.add(student2);
        school.showStudent20YearOld(school.getArr());
        System.out.println("Số học sinh có tuổi bằng 23 và quê ở 'DN' là: " + school.countStudent23YearOld(school.getArr()));
    }
}
