package baiTapArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class BT1 {

    // Nhập danh sách số thực với số lượng tùy ý từ bán phim. Xuất ra danh sách vừa nhập và tính tổng của nó
    // Sử dụng array list để lưu trữ
    // nhập số lượng tùy thích dùng while
    // tính tổng = vòng lặp for
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> list = new ArrayList<>();
        while(true) {
            System.out.println("Nhap vao 1 so bat ky: ");
            double input = sc.nextDouble();
            list.add(input);
            sc.nextLine();
            System.out.println("Ban muon tiep tuc khong Y/N ");
            String option = sc.nextLine();
            if(option.equals("N") || option.equals("n")) {
                break;
            }
        }
        System.out.println(list);
        int sum = 0;
        for (int i = 0 ; i < list.size() ; i++) {
            sum += list.get(i);
        }
        System.out.println(sum + "\n" + list);

        }
}

