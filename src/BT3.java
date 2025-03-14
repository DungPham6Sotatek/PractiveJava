import java.util.Arrays;
import java.util.Scanner;

public class BT3 {
    // nhập số lượng 1 mảng
    // nhập vào phần tử của mảng
    // Sắp xếp thứ tự của mảng
    // Tìm giá trị lớn nhất, nho nhất của mảng

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so phan tu của mang");
        int size = sc.nextInt();

        int [] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap cac phan tu của mang: ");

            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println(max + " là số lớn nhất");
        System.out.println(min + " là số nhỏ nhất");
        }
//        System.out.println("Max của arr: " +Math.max(arr[0], arr.length));
    }

