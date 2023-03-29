import java.util.Scanner;

public class NhanSu {
    private String maSoNhanVien;
    protected double soNgayLamViec;
    private String soDT;
    private String hoTen;
    protected double luongThang;

//    public NhanSu(String maSoNhanVien, double soNgayLamViec, String soDT, String hoTen, int luongThang) {
//        this.maSoNhanVien = maSoNhanVien;
//        this.soNgayLamViec = soNgayLamViec;
//        this.soDT = soDT;
//        this.hoTen = hoTen;
//        this.luongThang = luongThang;
//    }

    public String getMaSoNhanVien() {
        return maSoNhanVien;
    }

    public void setMaSoNhanVien(String maSoNhanVien) {
        this.maSoNhanVien = maSoNhanVien;
    }

    public double getSoNgayLamViec() {
        return soNgayLamViec;
    }

    public void setSoNgayLamViec(double soNgayLamViec) {
        this.soNgayLamViec = soNgayLamViec;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuongThang() {
        return luongThang;
    }

    public void setLuongThang(double luongThang) {
        this.luongThang = luongThang;
    }

    public void tinhLuong() {
        luongThang = 0;
    }

    //Nhập
    public void nhapMaNhanVien() {
        System.out.println("Nhập mã nhân viên: ");
        maSoNhanVien = sc.nextLine();
    }

    public void nhapHoTen() {
        System.out.println("Nhập họ tên nhân viên: ");
        hoTen = sc.nextLine();
    }

    public void nhapSDT() {
        System.out.println("Nhập SDT nhân viên: ");
        soDT = sc.nextLine();
    }

    public void nhapSoNgayLam() {
        System.out.println("Nhập số ngày làm của nhân viên: ");
        soNgayLamViec = sc.nextDouble();
    }

    public void nhapNhanSu() {
        nhapMaNhanVien();
        nhapHoTen();
        nhapSDT();
        nhapSoNgayLam();
    }

    // Xuất
    public void xuatMaNhanVien() {
        System.out.println("Mã nhân viên: " + maSoNhanVien);

    }

    public void xuatHoTen() {
        System.out.println("Họ tên nhân viên: " + hoTen);

    }

    public void xuatSDT() {
        System.out.println("SĐT nhân viên: " + soDT);

    }

    public void xuatSoNgayLam() {
        System.out.println("Số ngày làm của nhân viên: " + soNgayLamViec);

    }

    public void xuatLuongThang() {
        System.out.println("Lương của nhân viên: " + luongThang);

    }
    public void xuatNhanSu(){
        xuatMaNhanVien();
        xuatHoTen();
        xuatSDT();
        xuatSoNgayLam();
    }
    private final Scanner sc = new Scanner(System.in);
}
