package inher;

public class ITStudent extends Student{
    private String language;

    public ITStudent(String language, String name, int age, int idStudent) {
        super(name, age, idStudent);
        this.language = language;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    void getInfo(){
        System.out.println("name: " + getName() + ", age: " + getAge() + ", idStudent: " + getIdStudent() + ", language: " + getLanguage());
    }
}
