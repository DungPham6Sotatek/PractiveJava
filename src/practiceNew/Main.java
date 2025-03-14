package practiceNew;

public class Main {
    public static void main(String[] args) {
        SinhVien sck1 = new SinhVienCoKhi("dung", 30, 01, 5,5);
        SinhVien sIt1 = new SinhVienIT("Van Anh", 29, 02, 5,5);

        System.out.println("svck1: " + sck1.getDiem());
        System.out.println("svIT1: " + sIt1.getDiem());
    }
}
