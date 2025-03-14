package practiceNew;

public abstract class SinhVien {
    // tao 3 class SinhVien(super) + getDiem pt triu tuong
    // Sinh Vien IT (child) scoreJava, scoreHTML -> getDiem = (scoreJava * 2 +scoreHTML) /3
    // sinh vien co khi (child) scoreCNC, scorePLC -> getDiem = (scoreCNC + score PLC) / 2
    private String name;
    private int age;
    private int idStudent;

    public SinhVien(String name, int age, int idStudent) {
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
    abstract double getDiem();

    @Override
    public String toString() {
        return "SinhVien{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", idStudent=" + idStudent +
                '}';
    }


}
