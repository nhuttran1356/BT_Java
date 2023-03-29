import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.util.Collections.reverse;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static String tenCongTy;
    private static String maSoThue;
    private static double doanhThuThang;

    public static void main(String[] args) {

        danhSachNhanSu = new ArrayList<NhanSu>();
        System.out.println("Nhập số thành viên");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Thành viên thứ " + (i + 1));
            danhSachNhanSu.add(Addition.addNewbie(danhSachNhanSu));
        }
        Addition.checkTeamLead(danhSachNhanSu);
        Addition.memberEachTeam(danhSachNhanSu);

        System.out.println(" 1. Nhập thông tin công ty");
        System.out.println(" 2. Bổ nhiệm nhân viên làm trưởng phòng");
        System.out.println(" 3. Thêm nhân sự                       ");
        System.out.println(" 4. Xóa nhân sự                        ");
        System.out.println(" 5. Xuất thông tin toàn bộ công ty     ");
        System.out.println(" 6. Tính tổng lương toàn công ty       ");
        System.out.println(" 7. Tìm thành viên có lương cao nhất   ");
        System.out.println(" 8. Tìm trưởng phòng quản lý nhiều nhất");
        System.out.println(" 9. Sắp xếp nhân sự theo tên           ");
        System.out.println(" 10. Sắp xếp nhân sự giảm dần           ");
        System.out.println(" 11. Tìm giám đốc có cổ phần nhiều nhất ");
        System.out.println(" 12. Tính tổng thu nhập của mỗi giám đốc");
        System.out.println("Chọn 1 trong các phương án trên: ");
        int option = sc.nextInt();
        sc.nextLine();
        switch (option) {
            case 1: {
                unitA();
                break;
            }
            case 2: {
                unitB();
                break;
            }
            case 3: {
                unitC();
                break;
            }
            case 4: {
                unitD();
                break;
            }
            case 5: {
                unitE();
                break;
            }
            case 6: {
                unitF();
                break;
            }
            case 7: {
                unitG();
                break;
            }
            case 8: {
                unitH();
                break;
            }
            case 9: {
                unitI();
                break;
            }
            case 10: {
                unitJ();
                break;
            }
            case 11: {
                unitK();
                break;
            }
            case 12: {
                unitL();
                break;
            }
        }
    }

    // Nhập thông tin công ty
    private static void unitA() {
        System.out.println("Nhập tên công ty");
        // Đọc dòng trống còn sót lại sau khi nhập option
        sc.nextLine();
        tenCongTy = sc.nextLine();

        System.out.println("Nhập mã số thuế");
        maSoThue = sc.nextLine();

        System.out.println("Nhập doanh thu tháng");
        doanhThuThang = sc.nextDouble();
    }

    //    Phân bổ Nhân viên vào Trưởng phòng
    private static List<NhanSu> danhSachNhanSu;

    private static void unitB() {
        ArrayList<NhanVien> danhSachNhanVien = new ArrayList<NhanVien>();
        for (var nhanSu : danhSachNhanSu) {
            if (nhanSu instanceof NhanVien)
                danhSachNhanVien.add((NhanVien) nhanSu);
        }
        int max = danhSachNhanVien.size();
        if (max > 0) {
            System.out.println("Danh sách nhân viên");
            for (int i = 0; i < max; i++) {
                var nhanVien = danhSachNhanVien.get(i);
                System.out.println((i + 1) + " " + nhanVien.getHoTen() + ": " + nhanVien.getMaSoNhanVien());
            }
            System.out.println("Chọn 1 trong các phương án trên: ");
            var index = Addition.findIndexByCode(danhSachNhanSu, danhSachNhanVien.get(max - 1).getMaSoNhanVien());
            danhSachNhanSu.add(index, Addition.nhanVienTransToTruongPhong(danhSachNhanSu.get(index)));
            danhSachNhanSu.remove(index + 1);
            // finish
            Addition.memberEachTeam(danhSachNhanSu);
            unitE();
        } else {
//            checkIn();
            System.out.println("Công ty không có nhân viên nào!");

        }

    }

    //Thêm nhân viên mới
    public static void unitC() {

        System.out.println("Thêm thành viên mới");
        // main
        danhSachNhanSu.add(Addition.addNewbie(danhSachNhanSu));
        // finish
        Addition.memberEachTeam(danhSachNhanSu);
        unitE();
    }

    // Xóa nhân viên
    public static void unitD() {
        System.out.println("Danh sách nhân viên");
        int max = danhSachNhanSu.size();
        for (int i = 0; i < max; i++) {
            var nhanSu = danhSachNhanSu.get(i);
            System.out.println((i + 1) + nhanSu.getHoTen() + " " + nhanSu.getMaSoNhanVien());
        }
        System.out.println("Chọn 1 trong các phương án trên: ");
        // main
        var index = Addition.findIndexByCode(danhSachNhanSu, danhSachNhanSu.get(max - 1).getMaSoNhanVien());
        danhSachNhanSu.remove(index);
        // finish
        Addition.checkTeamLead(danhSachNhanSu);
        Addition.memberEachTeam(danhSachNhanSu);
        unitE();
    }

    // Xuất nhân viên
    public static void unitE() {
        // cap
        System.out.println("Công ty " + tenCongTy);
        System.out.println("MST " + maSoThue);
        System.out.println("Doanh Thu Tháng " + doanhThuThang);
        // shown
        for (var nhanSu : danhSachNhanSu) {
            nhanSu.xuatNhanSu();
        }
    }

    //Tính tổng lương
    public static void unitF() {
        unitE();
        System.out.println("Tổng lương toàn công ty: " + Addition.sumSalary(danhSachNhanSu));

    }

    // Nhân viên có lương cao nhất
    public static void unitG() {
        System.out.println("Công ty " + tenCongTy);
        System.out.println("MST " + maSoThue);
        System.out.println("Doanh Thu Tháng " + doanhThuThang);

        System.out.println("Thành viên lương cao nhất");

        // main
        var dsTopSalary = Addition.topSalary(danhSachNhanSu);
        // shown
        for (var topNhanSu : dsTopSalary) {
            topNhanSu.xuatHoTen();
            topNhanSu.xuatMaNhanVien();
            topNhanSu.xuatLuongThang();
        }
    }

    // Xuất trưởng phòng có nhân viên nhiều nhất
    public static void unitH() {
        System.out.println("Trưởng phòng quản lý nhiều thành viên nhât");

        // main
        var dsTopTeam = Addition.topTeam(danhSachNhanSu);
        // shown
        for (var topTruongPhong : dsTopTeam) {
            topTruongPhong.xuatHoTen();
            topTruongPhong.xuatThanhVien();
        }
    }

    // Sắp xếp nhân viên toàn công ty theo thứ tự abc
    public static void unitI() {
        System.out.println("Sắp xếp nhân sự theo tên");

        // main
        var dsNhanSu = new ArrayList<NhanSu>(danhSachNhanSu);
        Addition.sortByName(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
        }

    }

    //Sắp xếp nhân viên toàn công ty theo thứ tự lương giảm dần
    public static void unitJ() {
        System.out.println("Sắp xếp nhân sự giảm dần theo lương");
        // main
        var dsNhanSu = new ArrayList<NhanSu>(danhSachNhanSu);
        Addition.sortByCode(dsNhanSu);
        reverse(dsNhanSu);
        // shown
        for (var nhanSu : dsNhanSu) {
            nhanSu.xuatNhanSu();
        }
    }

    //Tìm Giám Đốc có số lượng cổ phần nhiều nhất
    public static void unitK() {
        System.out.println("Giám đốc có nhiều cổ phần nhất");

        // main
        var dsTopShare = Addition.topShare(danhSachNhanSu);
        // shown
        for (var topGiamDoc : dsTopShare) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatCoPhan();

        }
    }

    //Tính và Xuất tổng THU NHẬP của từng Giám Đốc
    public static void unitL() {
        System.out.println("Thu nhập giám đốc");

        // main
        var dsGiamDoc = Addition.allInGiamDoc(danhSachNhanSu, doanhThuThang);
        // shown
        for (var topGiamDoc : dsGiamDoc) {
            topGiamDoc.xuatHoTen();
            topGiamDoc.xuatThuNhap();
        }
    }
}


