package inher;

public class SportStudent extends Student {
    private String skill;
    public SportStudent(String skill, String name, int age, int idStudent) {
        super(name, age, age);
        this.skill = skill;
    }
    public String getSkill() {
        return this.skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    void getInfo() {
        System.out.println("name: " + getName() + ", age: " + getAge() + ", idStudent: " + getIdStudent() + ", skill: " + getSkill());
    }
}
