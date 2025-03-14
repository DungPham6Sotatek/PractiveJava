package practiceNew;

public class SinhVienCoKhi extends SinhVien {
    private double scoreCNC;
    private double scorePLC;
    public SinhVienCoKhi(String name, int age, int idStudent, double scoreCNC, double scorePLC) {
        super(name, age, idStudent);
        this.scoreCNC = scoreCNC;
        this.scorePLC = scorePLC;
    }

    public double getScoreCNC() {
        return this.scoreCNC;
    }
    public double getScorePLC() {
        return this.scorePLC;
    }
    public void setScoreCNC(double scoreCNC) {
        this.scoreCNC = scoreCNC;
    }
    public void setScorePLC(double scorePLC) {
        this.scorePLC = scorePLC;
    }

    @Override
    double getDiem() {
        return (scoreCNC + scorePLC);
    }




}
