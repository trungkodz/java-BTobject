package bai09;

import bai03.nhanvien;

import java.util.ArrayList;

public class danhsachnhanvien {
    ArrayList<nhanvien> dsnv = new ArrayList<>();

    public void addnv(nhanvien a) {
        System.out.println("da them nv ... ");
        dsnv.add(a);
    }

    public void thongtinnv() {
        nhanvien.xuattieude();
        for (int i = 0; i < dsnv.size(); i++) {
            System.out.println(dsnv.get(i));
        }
    }

    public int tongnv() {
        return dsnv.size();
    }

    public void nvvuotchuan() {
        nhanvien.xuattieude();
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).covuatchuan() == true) {
                System.out.println(dsnv.get(i));
            }
        }
    }

    public int nvkodatchuan() {
        int dem = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).covuatchuan() == false) {
                dem++;
            }
        }
        return dem;
    }

    public double tongluongnvdatchuan() {
        double tong = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).covuatchuan() == true) {
                tong += dsnv.get(i).getluong();
            }
        }
        return tong;
    }

    public nhanvien nvcospmin() {
        nhanvien min = dsnv.get(0);
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getsoSP() < min.getsoSP()) {
                min = dsnv.get(i);
            }
        }
        return min;
    }

    public nhanvien nvluongmax() {
        nhanvien max = dsnv.get(0);
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).getluong() > max.getluong()) {
                max = dsnv.get(i);
            }
        }
        return max;
    }

    public nhanvien nvkodatcoluongmax() {
        ArrayList<nhanvien> dskd = new ArrayList<>();
        for (int i = 0; i < dsnv.size(); i++) {
            if (dsnv.get(i).covuatchuan() == false) {
                dskd.add(dsnv.get(i));
            }
        }
        if (dskd.isEmpty()) {
            return null; // phải thêm dòng này vì có khả năng là ko ai ko đạt. nếu ko có sẽ có thể lỗi vì
                         // mảng trống
        }
        nhanvien luongmax = dskd.get(0);
        for (int j = 0; j < dskd.size(); j++) {
            if (dskd.get(j).getluong() > luongmax.getluong()) {
                luongmax = dskd.get(j);
            }
        }

        return luongmax;
    }

    public double tongluong() {
        double tong = 0;
        for (int i = 0; i < dsnv.size(); i++) {
            tong += dsnv.get(i).getluong();
        }
        return tong;
    }

    public nhanvien timkiem(String manv) {
        nhanvien nv = dsnv.get(0);
        int dem = 0;
        while (dem < dsnv.size()) {
            if (manv == dsnv.get(dem).getMaNV()) {
                nv = dsnv.get(dem);
            }
            dem++;
        }
        return nv;
    }

    public void timkiem2(String manv) {
        int dem = 0;
        while (dem < dsnv.size()) {
            if (manv.equalsIgnoreCase(dsnv.get(dem).getMaNV())) { // so sánh chuỗi phải dùng equalsIgnoreCase hoặc
                                                                  // equals
                System.out.println(dsnv.get(dem));
                return;
            }
            dem++;
        }
        System.out.println("ko tim thay!");

    }

    public void sapxep() {

        for (int i = 0; i < dsnv.size() - 1; i++) {
            for (int j = 0; j < dsnv.size() - 1 - i; j++) {

                nhanvien nv1 = dsnv.get(j);
                nhanvien nv2 = dsnv.get(j + 1);

                if (dsnv.get(j).getsoSP() > dsnv.get(j + 1).getsoSP()) {
                    dsnv.set(j, nv2);
                    dsnv.set(j + 1, nv1);
                }
            }
        }
        for (int i = 0; i < dsnv.size(); i++) {
            System.out.println(dsnv.get(i));
        }
    }

    public void xoa(String manv) {
        int dem = 0;
        while (dem < dsnv.size()) {
            if (manv.equalsIgnoreCase(dsnv.get(dem).getMaNV())) { // so sánh chuỗi phải dùng equalsIgnoreCase hoặc
                                                                  // (equals)

                dsnv.remove(dem);
                System.out.println("da xoa thanh cong!");
                return;
            }
            dem++;
        }
        System.out.println("ko tim thay de xoa!");

    }
}
