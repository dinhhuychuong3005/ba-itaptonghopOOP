package bt7;

public class main {
    public static void main(String[] args) {
        ManagerTeacher managerTeacher = new ManagerTeacher();
        Teacher teacher = new Teacher(30,33,44,"abc",43,"ND","2");
        Teacher teacher1 = new Teacher(31,33,44,"bcd",23,"LC","3");
        Teacher teacher2 = new Teacher(32,43,55,"bcd",23,"AB","4");
        managerTeacher.add(teacher);
        managerTeacher.add(teacher1);
        managerTeacher.add(teacher2);
        managerTeacher.delete(managerTeacher.getArr());
        System.out.println("Tiền lương thực tế của giáo viên là: " + managerTeacher.getSalary(managerTeacher.getArr()));
    }



}
