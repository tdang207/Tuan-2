package QLSV;
import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);

        SinhVien sv1 = new SinhVien(1001, "Nguyen Van A", 8.5, 9.0);

        System.out.println("Nhap thong tin sinh vien sv2:");

        System.out.print("Ma sinh vien: ");
        int maSV = sc.nextInt();
        sc.nextLine();

        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();

        System.out.print("Diem LT: ");
        double diemLT = sc.nextDouble();

        System.out.print("Diem TH: ");
        double diemTH = sc.nextDouble();

        SinhVien sv2 = new SinhVien(maSV, hoTen, diemLT, diemTH);

        SinhVien sv3 = new SinhVien();

        System.out.println("\nNhap thong tin sinh vien sv3:");

        System.out.print("Ma sinh vien: ");
        sv3.setMaSinhVien(sc.nextInt());
        sc.nextLine();

        System.out.print("Ho ten: ");
        sv3.setHoTen(sc.nextLine());

        System.out.print("Diem LT: ");
        sv3.setDiemLT(sc.nextDouble());

        System.out.print("Diem TH: ");
        sv3.setDiemTH(sc.nextDouble());

        System.out.println("\nDANH SACH SINH VIEN");
        System.out.printf("%-15s%-25s%10s%10s%10s%n",
                "Ma SV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");
        System.out.println("----------------------------------------------------------------");
        System.out.println(sv1 + String.format("%10.2f", sv1.tinhDiemTrungBinh()));
        System.out.println(sv2 + String.format("%10.2f", sv2.tinhDiemTrungBinh()));
        System.out.println(sv3 + String.format("%10.2f", sv3.tinhDiemTrungBinh()));
        sv3 = new SinhVien(1003, "Tran Van C", 7.5, 8.0);

        System.out.println("\nSau khi thay doi cach gan du lieu cho sv3:");
        System.out.printf("%-15s%-25s%10s%10s%10s%n",
                "Ma SV", "Ho ten", "Diem LT", "Diem TH", "Diem TB");

        System.out.println("----------------------------------------------------------------");
        System.out.println(sv3 + String.format("%10.2f", sv3.tinhDiemTrungBinh()));

        sc.close();
    }
}
