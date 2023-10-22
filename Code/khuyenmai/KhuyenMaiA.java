/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;
import java.text.ParseException;
/**
 *
 * @author THIS PC
 */
public class KhuyenMaiA extends KhuyenMai {

    public static int dem = 1;
    private String thongTinKM;
    
    {
        ma = String.format("A%02d", dem++);
    }

    public KhuyenMaiA(String ngayTao, String ngayHet, String thongTinKM) throws ParseException {
        super(ngayTao, ngayHet);
        this.thongTinKM = thongTinKM;
    }
    
     public void nhapThongTinKM() {
        System.out.print("Nhap thong tin khuyen mai ma " + this.ma + ": ");
        setThongTinKM(CauHinh.sc.nextLine());
    }

    @Override
    public void nhapNgayKM() {
        super.nhapNgayKM(); 
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.printf("Thong tin khuyen mai: %s\n", this.thongTinKM);
    }

    @Override
    public String layMa() {
        return this.ma;
    }

    @Override
    public String layLoai() {
        return "A";
    }

    @Override
    public int tinhNgayHetHan() {
        return super.tinhNgayHetHan(); 
    }

    /**
     * @return the thongTinKM
     */
    public String getThongTinKM() {
        return thongTinKM;
    }

    /**
     * @param thongTinKM the thongTinKM to set
     */
    public void setThongTinKM(String thongTinKM) {
        this.thongTinKM = thongTinKM;
    }

}
