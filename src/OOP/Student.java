package OOP;

public class Student {
    private String name;
    private int age;
    private float idStudent;

    // khoi tao
    public Student() {

    }
    public Student(String name, int age, float idStudent) {
        this.name = name;
        this.age = age;
        this.idStudent = idStudent;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }
    public float getIdStudent() {
        return this.idStudent;
    }

    public void setName(String name1) {
        this.name = name1;
    }
    public void setAge(int age1) {
        this.age = age1;
    }
    public void setIdStudent(float idStudent1) {
        this.idStudent = idStudent1;
    }

    public void learJava() {
        System.out.println("I'm learning Java");
    }
}
