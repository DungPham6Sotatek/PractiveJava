package inher;

public class main {
    public static void main(String[] args) {
        ITStudent itStudent = new ITStudent("Java", "Dung", 30, 01);
        SportStudent sportStudent = new SportStudent("Run", "Van Anh", 29, 02);
        itStudent.getInfo();
        sportStudent.getInfo();
    }
}
