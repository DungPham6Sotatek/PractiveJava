package OOP;

public class StudentDetails {
    public static void main(String[] args) {
        Student st1 = new Student("Dung", 30, 0006);
//        System.out.println(st1.name);
//        System.out.println(st1.age);
//        System.out.println(st1.idStudent);
        Student st2 = new Student();
        st2.setName("Eric");
        System.out.println(st2.getName());
        System.out.println(st1.getName());

    }
}
