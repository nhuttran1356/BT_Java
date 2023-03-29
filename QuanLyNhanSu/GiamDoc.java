import java.util.Scanner;

public class GiamDoc extends NhanSu {
    private double coPhan;
    private double thuNhap;

    public double getThuNhap() {
        return thuNhap;
    }

    public void setThuNhap(double thuNhap) {
        this.thuNhap = thuNhap;
    }

    private final double luongNgay = 300;
    private final Scanner sc = new Scanner(System.in);

    public double getCoPhan() {
        return coPhan;
    }

    public void setCoPhan(double coPhan) {
        this.coPhan = coPhan;
    }

    public double getLuongNgay() {
        return luongNgay;
    }

    public  void xuatThuNhap() {
        System.out.println("Thu nhập " + thuNhap);
    }


    @Override
    public void tinhLuong() {
        luongThang = soNgayLamViec * luongNgay;
    }

    public void nhapCoPhan() {
        System.out.println("Nhập cổ phần:");
        coPhan = sc.nextDouble();
    }

    public void xuatCoPhan() {
        System.out.println("Số lượng cổ phần: " + coPhan + "%");
    }

    @Override
    public void xuatLuongThang() {
        System.out.println("Lương: " + luongThang);
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapCoPhan();
        tinhLuong();
    }

    @Override
    public void xuatNhanSu() {
        super.xuatNhanSu();
        xuatCoPhan();
        xuatLuongThang();
    }
}
