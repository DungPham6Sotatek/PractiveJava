package practiceTryAndCatch;

public class SinhVienNew {
    private int maSV;
    private String hoVaTen;
    private double diem;
    private int age;

    public SinhVienNew(int maSV, String hoVaTen, double diem, int age) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.diem = diem;
        this.age = age;
    }

    public int getMaSV() {
        return this.maSV;
    }
    public String getHoVaTen() {
        return this.hoVaTen;
    }
    public double getDiem() {
        return this.diem;
    }
    public int getAge() {
        return this.age;
    }
    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public void setDiem(double diem) {
        this.diem = diem;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoVaTen='" + hoVaTen + '\'' +
                ", diem=" + diem +
                ", age=" + age +
                '}';
    }
}
