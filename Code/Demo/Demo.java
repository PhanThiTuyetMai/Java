/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

import SanPham.QuanLySanPham;
import SanPham.SanPham;
import bai1.khuyenmai.QuanLyKhuyenMai;
import java.text.ParseException;

/**
 *
 * @author THIS PC
 */
public class Demo {

    public static void main(String[] args) throws ParseException {
        int chon;
        QuanLySanPham ds = new QuanLySanPham();
        QuanLyKhuyenMai z = ds.danhSachKhuyenMai();
        OUTER:
        do {
            System.out.println("=============MENU==============");
            System.out.println("1. Them san pham vao danh sach");
            System.out.println("2. Hien thi danh sach san pham");
            System.out.println("3. Tim kiem san pham theo ten, khoang gia chi dinh va theo tung loai khuyen mai");
            System.out.println("4. Them khuyen mai vao 1 san pham");
            System.out.println("5. Xoa cac khuyen mai het hieu luc ra khoi san pham");
            System.out.println("6. Xac dinh tat ca khuyen mai con x ngay hieu luc");
            System.out.println("7. Hien thi thong tin khuyen mai cua san pham chi dinh theo ma hoac ten");
            System.out.println("8. Xem danh sach san pham co chua khuyen mai theo tung loai khuyen mai chi dinh");
            System.out.println("9. Sap xep danh sach san pham giam dan theo so luong khuyen mai con hieu luc");
            System.out.println("10. Thoat chuong trinh!!!");
            System.out.print("Vui long chon lenh thuc hien: ");
            chon = Integer.parseInt(CauHinh.sc.nextLine());
            System.out.println("=================================");
            switch (chon) {
                case 1 -> {
                    System.out.print("Vui long nhap so luong san pham ma ban muon them: ");
                    int p = Integer.parseInt(CauHinh.sc.nextLine());
                    for (int i = 0; i < p; i++) {
                        SanPham sp = new SanPham();
                        sp.nhapSanPham();
                        sp.themKhuyenMai(z);
                        ds.themSP(sp);
                    }
                }
                case 2 -> {
                    System.out.println("DANH SACH SAN PHAM CUA CUA HANG!!!");
                    ds.hienThi();
                }
                case 3 -> {
                    System.out.println("1. Tra cuu theo ten");
                    System.out.println("2. Tra cuu theo khoang dinh gia");
                    System.out.println("3. Tra cuu theo tung loai ma khuyen mai");
                    System.out.print("Moi ban chon: ");
                    int m = Integer.parseInt(CauHinh.sc.nextLine());
                    switch (m) {
                        case 1 -> {
                            System.out.print("Nhap ten san pham: ");
                            String key = CauHinh.sc.nextLine();
                            ds.traCuu(key).hienThi();
                        }
                        case 2 -> {
                            System.out.print("Nhap tu gia: ");
                            double a = Double.parseDouble(CauHinh.sc.nextLine());
                            System.out.print("Nhap den gia: ");
                            double b = Double.parseDouble(CauHinh.sc.nextLine());
                            ds.traCuu(a, b).forEach(h -> h.hienThi());
                        }
                        case 3 ->
                            ds.traCuuTheoLoai();
                        default -> {
                        }
                    }
                }
                case 4 -> {
                    ds.themKMSanPham(z);
                    System.out.println("Da them khuyen mai vao san pham thanh cong!!!");
                }
                case 5 -> {
                    System.out.print("Vui long nhap so luong san pham hien co: ");
                    int s = Integer.parseInt(CauHinh.sc.nextLine());
                    for (int i = 0; i < s; i++) {
                        ds.xoaKM();
                    }
                    System.out.println("DA XOA MA HET HIEU LUC THANH CONG!!!!");
                }
                case 6 -> {
                    System.out.println("Danh sach ma khuyen mai con x ngay hieu luc!!!");
                    z.traMaKMTheoNgay();
                }
                case 7 -> {
                    System.out.println("Thong tin khuyen mai cua san pham!!!");
                    ds.traCuuKM();
                }
                case 8 -> {
                    System.out.println("Danh Sach San Pham Khuyen Mai Theo Loai");
                    ds.traCuuTheoLoai();
                }
                case 9 -> {
                    ds.sapXepGiamDan();
                    System.out.println("Danh sach sau khi sap xep giam dan!!!!");
                    ds.hienThi();
                }
                case 10 -> {
                    break OUTER;
                }
                default -> {
                }
            }
        } while (chon != 10);

    }
}
