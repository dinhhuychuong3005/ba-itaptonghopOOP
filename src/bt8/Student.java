package bt8;

public class Student {
    private String name;
    private int age;
    private String myClass;

    public Student() {
    }

    public Student(String name, int age, String myClass) {
        this.name = name;
        this.age = age;
        this.myClass = myClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMyClass() {
        return myClass;
    }

    public void setMyClass(String myClass) {
        this.myClass = myClass;
    }
}
