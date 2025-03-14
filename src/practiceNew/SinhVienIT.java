package practiceNew;

public class SinhVienIT extends SinhVien {

    private double scoreJava;
    private double scorePython;
    public SinhVienIT(String name, int age, int idStudent, double scoreJava, double scorePython) {
        super(name, age, idStudent);
        this.scoreJava = scoreJava;
        this.scorePython = scorePython;
    }
    @Override
    double getDiem() {
        return (this.scoreJava * 2 + this.scorePython) /3;
    }

}
