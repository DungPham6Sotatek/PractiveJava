package inher;

public abstract class Student {
    private String name;
    private int age;
    private int idStudent;
    abstract void getInfo();
    // khoi tao
    public Student(String name, int age, int idStudent) {
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
    public int getIdStudent() {
        return this.idStudent;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setIdStudent(int idStudent) {
        this.idStudent = idStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idStudent=" + idStudent +
                '}';
    }
}
