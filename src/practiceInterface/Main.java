package practiceInterface;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello");
        Student student1 = new Student("001" , "Dung", 30, 6);
        student1.setGrade();
        System.out.println(student1.getGrade() +"co hang: " + student1.getGrade());

        Person p1 = new Person("123", "Jimmy", 30);

    }
}
