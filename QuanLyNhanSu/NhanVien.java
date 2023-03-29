import java.util.Scanner;

public class NhanVien extends NhanSu {
    private String tenTruongPhong;
    private final double luongNgay = 100;
    private final Scanner sc = new Scanner(System.in);

    public String getTenTruongPhong() {
        return tenTruongPhong;
    }

    public void setTenTruongPhong(String tenTruongPhong) {
        this.tenTruongPhong = tenTruongPhong;
    }

    public void nhapTenTruongPhong() {
        System.out.println("Nhập tên trưởng phòng: ");
        tenTruongPhong = sc.nextLine();
        if (tenTruongPhong == null || tenTruongPhong.isEmpty())
            tenTruongPhong = "null";
    }

    public void xuatTenTruongPhong() {
        System.out.println("Tên trưởng phòng: " + tenTruongPhong);
    }

    @Override
    public void tinhLuong() {
        luongThang = luongNgay * soNgayLamViec;
    }

    @Override
    public void nhapNhanSu() {
        super.nhapNhanSu();
        nhapTenTruongPhong();
        tinhLuong();
    }

    @Override
    public void xuatLuongThang() {
        System.out.println("Lương: " + luongThang);
    }

    @Override
    public void xuatNhanSu() {
        super.xuatNhanSu();
        xuatTenTruongPhong();
        xuatLuongThang();
    }
}
