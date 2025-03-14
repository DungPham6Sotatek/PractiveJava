package chapter5;

public class Student {
    // tạo 1 class student với thuộc tính name, id
    // tạo hàm main, tạo 5 students với tenn khác nhau
    // yêu cầu tim và xuất ra các student có tên Dung
    private String name;
    private int id;
    // khởi tao
    public Student() {

    }
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // getter and setter
    public String getName() {
        return this.name;
    }
    public int getId() {
        return this.id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
