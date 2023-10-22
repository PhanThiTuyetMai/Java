/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SanPham;

import Demo.CauHinh;
import bai1.khuyenmai.KhuyenMai;
import bai1.khuyenmai.QuanLyKhuyenMai;
import java.util.ArrayList;

/**
 *
 * @author THIS PC
 */
public class SanPham {

    public static int dem = 1;
    private int ma;
    private String ten;
    private double gia;
    private String danhMucSp;
    public ArrayList<KhuyenMai> list = new ArrayList<>();

    {
        ma = dem++;
    }

    public SanPham() {
    }

    public SanPham(String ten, double gia, String danhMucSp) {
        this.ten = ten;
        this.gia = gia;
        this.danhMucSp = danhMucSp;
    }

    public void nhapSanPham(){
        System.out.printf("Ma san pham: %d\n", this.ma);
        System.out.print("Ten san pham: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.print("Gia san pham: ");
        this.gia = Double.parseDouble(CauHinh.sc.nextLine());
        System.out.print("Danh muc cua san pham: ");
        this.danhMucSp = CauHinh.sc.nextLine();
    }
    
    public void themKhuyenMai(QuanLyKhuyenMai q){
        System.out.println("Vui long nhap thong tin ma khuyen mai cho san pham ");
        System.out.print("Nhap so luong ma khuyen mai: ");
        int m = Integer.parseInt(CauHinh.sc.nextLine());
        for (int j = 0; j < m; j++) {
            System.out.print("Nhap ma khuyen mai: ");
            String key = CauHinh.sc.nextLine();
            list.add(q.traCuu(key));
        }
    }
    
    public void hienThi() {
        System.out.println("Ma san pham: " + this.ma);
        System.out.println("Ten san pham: " + this.ten);
        System.out.println("Gia san pham: " + this.gia);
        System.out.println("Danh muc san pham: " + this.danhMucSp);
        System.out.println("Danh sach ma khuyen mai cua san pham !!");
        this.list.forEach(h->h.hienThi());
    }
    
    public int tinhKMHL(){
        int demSL=0;
        for(KhuyenMai d:this.list){
            if(d.tinhNgayHetHan() < 0){
                    demSL++;
            }
        }
        return demSL;
    }
    
    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the gia
     */
    public double getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(double gia) {
        this.gia = gia;
    }

    /**
     * @return the danhMucSp
     */
    public String getDanhMucSp() {
        return danhMucSp;
    }

    /**
     * @param danhMucSp the danhMucSp to set
     */
    public void setDanhMucSp(String danhMucSp) {
        this.danhMucSp = danhMucSp;
    }

}
