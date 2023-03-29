import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Comparator;

import static java.util.Collections.sort;

public class Addition {
    private static Scanner sc = new Scanner(System.in);
    public static NhanSu addNewbie(List<NhanSu> dsNhanSu) {
        var nhanSu = userType();
        do {

        } while (isRegist(dsNhanSu, nhanSu.getMaSoNhanVien()));
        nhanSu.nhapNhanSu();
        return nhanSu;
    }

    public static NhanSu userType() {
        System.out.println( "Vị trí trong công ty");
        System.out.println("1. Nhân viên   ");
        System.out.println("2. Trưởng phòng");
        System.out.println("3. Giám đốc    ");
        System.out.println("Chọn 1 trong các phương án trên: ");
        int n = sc.nextInt();
        switch (n) {
            case 1: {
                return new NhanVien();
            }
            case 2: {
                return new TruongPhong();
            }
            case 3: {
                return new GiamDoc();
            }
            default: {
                return new NhanSu();
            }
        }
    }
    public static boolean isRegist(List<NhanSu> dsNhanSu, String maNhanVien) {
        var isSuccess = false;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getMaSoNhanVien().equals(maNhanVien)) {
                System.out.println( "Mã nhân viên đã tồn tại!");
                isSuccess = true;
                break;
            }
        }
        return isSuccess;
    }
    public static void checkTeamLead(List<NhanSu> dsNhanSu) {
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof NhanVien) {
                var nhanVien = (NhanVien) nhanSu;
                var isSuccess = false;
                for (var truongPhong : dsNhanSu) {
                    if (truongPhong instanceof TruongPhong
                            && nhanVien.getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        isSuccess = true;
                        break;
                    }
                }
                if (!isSuccess) {
                    nhanVien.setTenTruongPhong("");
                }
            }
        }
    }
    public static void memberEachTeam(List<NhanSu> dsNhanSu) {
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = ((TruongPhong) nhanSu);
                var count = 0;
                for (var nhanVien : dsNhanSu) {
                    if (nhanVien instanceof NhanVien
                            && ((NhanVien) nhanVien).getTenTruongPhong().equals(truongPhong.getHoTen())) {
                        count++;
                    }
                }
                truongPhong.setSoThanhVien(count);
                truongPhong.tinhLuong();
            }
        }
    }
    public static int findIndexByCode(List<NhanSu> dsNhanSu, String maNhanVien) {
        var index = -1;
        for (var i = 0; i < dsNhanSu.size(); i++) {
            if (dsNhanSu.get(i).getMaSoNhanVien().equals(maNhanVien)) {
                index = i;
                break;
            }
        }
        return index;
    }

    // NhanVien transform to TruongPhong
    public static TruongPhong nhanVienTransToTruongPhong(NhanSu nhanSu) {
        var truongPhong = new TruongPhong();
        truongPhong.setMaSoNhanVien(nhanSu.getMaSoNhanVien());
        truongPhong.setHoTen(nhanSu.getHoTen());
        truongPhong.setSoDT(nhanSu.getSoDT());
        truongPhong.setSoNgayLamViec(nhanSu.getSoNgayLamViec());
        truongPhong.setSoThanhVien(0);
        truongPhong.tinhLuong();
        return truongPhong;
    }

    // Sum Salary
    public static double sumSalary(List<NhanSu> dsNhanSu) {
        var sum = 0d;
        for (var nhanSu : dsNhanSu) {
            sum += nhanSu.getLuongThang();
        }
        return sum;
    }

    // List max salary
    public static List<NhanSu> topSalary(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopSalary = new ArrayList<NhanSu>();
        var maxSalary = dsNhanSu.get(0).getLuongThang();
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getLuongThang() > maxSalary) {
                maxSalary = nhanSu.getLuongThang();
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu.getLuongThang() == maxSalary) {
                dsTopSalary.add(nhanSu);
            }
        }
        return dsTopSalary;
    }

    // List TruongPhong max memberF
    public static List<TruongPhong> topTeam(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopTeam = new ArrayList<TruongPhong>();
        var maxTeam = 0;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = (TruongPhong) nhanSu;
                if (truongPhong.getSoThanhVien() > maxTeam) {
                    maxTeam = truongPhong.getSoThanhVien();
                }
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof TruongPhong) {
                var truongPhong = (TruongPhong) nhanSu;
                if (truongPhong.getSoThanhVien() == maxTeam) {
                    dsTopTeam.add(truongPhong);
                }
            }
        }
        return dsTopTeam;
    }

    // Sort by name
    public static void sortByName(List<NhanSu> dsNhanSu) {
        sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu o1, NhanSu o2) {
                return o1.getHoTen().compareTo(o2.getHoTen());
            }
        });
    }

    // Sort by code
    public static void sortByCode(List<NhanSu> dsNhanSu) {
        sort(dsNhanSu, new Comparator<NhanSu>() {
            @Override
            public int compare(NhanSu o1, NhanSu o2) {
                return o1.getMaSoNhanVien().compareTo(o2.getMaSoNhanVien());
            }
        });
    }

    // List GiamDoc max CoPhan
    public static List<GiamDoc> topShare(List<NhanSu> dsNhanSu) {
        // find max
        var dsTopShare = new ArrayList<GiamDoc>();
        var maxShare = 0d;
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                if (giamDoc.getCoPhan() > maxShare) {
                    maxShare = giamDoc.getCoPhan();
                }
            }
        }
        // add to list
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                if (giamDoc.getCoPhan() == maxShare) {
                    dsTopShare.add(giamDoc);
                }
            }
        }
        return dsTopShare;
    }

    // GiamDoc all in
    public static List<GiamDoc> allInGiamDoc(List<NhanSu> dsNhanSu, double doanhThuThang) {
        var dsAllIn = new ArrayList<GiamDoc>();
        var loiNhuan = doanhThuThang - sumSalary(dsNhanSu);
        for (var nhanSu : dsNhanSu) {
            if (nhanSu instanceof GiamDoc) {
                var giamDoc = (GiamDoc) nhanSu;
                giamDoc.setThuNhap(
                        giamDoc.getLuongThang() + giamDoc.getCoPhan() * loiNhuan / 100);
                dsAllIn.add(giamDoc);
            }
        }
        return dsAllIn;
    }

}
