import java.util.Scanner;

public class TruongPhong extends NhanSu {
    private int soThanhVien;
    private final double luongNgay = 200;
    private final Scanner sc = new Scanner(System.in);

    public int getSoThanhVien() {
        return soThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        this.soThanhVien = soThanhVien;
    }

    public double getLuongNgay() {
        return luongNgay;
    }

    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * luongNgay + 100 * soThanhVien;
    }

    @Override
    public void xuatLuongThang() {
        System.out.println("Lương: " + luongThang);
    }

    public void nhapSoLuongThanhVien() {
        System.out.println("Nhập số lượng nhân viên: ");
        soThanhVien = sc.nextInt();
    }

    public void xuatThanhVien() {
        System.out.println("Số lượng nhân viên: " + soThanhVien);
    }


    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapSoLuongThanhVien();
        tinhLuong();
    }

    @Override
    public void xuatNhanSu() {
        super.xuatNhanSu();
        xuatLuongThang();
        xuatThanhVien();
    }
}
