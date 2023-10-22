/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SanPham;

import Demo.CauHinh;
import bai1.khuyenmai.KhuyenMai;
import bai1.khuyenmai.QuanLyKhuyenMai;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author THIS PC
 */
public class QuanLySanPham {

    private ArrayList<SanPham> ds = new ArrayList<>();
    public QuanLyKhuyenMai ql = new QuanLyKhuyenMai();

    public void themSP(SanPham sp) {
        this.ds.add(sp);
    }

    public void hienThi() {
        this.ds.forEach(h -> h.hienThi());
    }

    public QuanLyKhuyenMai danhSachKhuyenMai() {
        System.out.print("Vui long nhap so luong ma khuyen mai: ");
        int n = Integer.parseInt(CauHinh.sc.nextLine());
        this.ql.nhapKM(n);
        System.out.println("DANH SACH MA KHUYEN MAI!!!!");
        ql.hienThiDs();
        return ql;
    }

    public SanPham traCuu(String key) {
        return this.ds.stream().filter(s -> s.getTen().contains(key)).findFirst().get();
    }

    public List<SanPham> traCuu(double a, double b) {
        return this.ds.stream().filter(s -> s.getGia() >= a && s.getGia() <= b).collect(Collectors.toList());
    }

    public void traCuuTheoLoai() {
        System.out.print("Nhap loai: ");
        String key = CauHinh.sc.nextLine();
        for (SanPham d : this.ds) {
            for (KhuyenMai k : d.list) {
                if (k.layLoai().contains(key)) {
                    d.hienThi();
                }
            }
        }
    }

    public void traCuuKM() {
        System.out.print("Vui long nhap ten hoac ma san pham: ");
        String key = CauHinh.sc.nextLine();
        System.out.println("Danh Sach Ma Khuyen Mai San Pham");
        for (SanPham d : this.ds) {
            if (d.getTen().contains(key)|| String.valueOf(d.getMa()).contains(key)) {
                d.list.forEach(h -> h.hienThi());
            }
        }
    }

    public void themKMSanPham(QuanLyKhuyenMai z) {
        System.out.print("Nhap ten san pham: ");
        String key = CauHinh.sc.nextLine();
        for (SanPham d : this.ds) {
            if (d.getTen().contains(key)) {
                d.themKhuyenMai(z);
            }
        }
    }

    public boolean xoaKM() {
        for (SanPham d : this.ds) {
            for (KhuyenMai k : d.list) {
                if (k.tinhNgayHetHan() > 0) {
                    return d.list.remove(k);
                }
            }
        }
        return false;
    }

    public void sapXepGiamDan() {
        this.ds.sort((h1, h2) -> {
            int t1 = h1.tinhKMHL();
            int t2 = h2.tinhKMHL();
            return t1 < t2 ? 1 : (t1 > t2 ? -1 : 0);
        });
    }

    /**
     * @return the ds
     */
    public ArrayList<SanPham> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<SanPham> ds) {
        this.ds = ds;
    }

}
