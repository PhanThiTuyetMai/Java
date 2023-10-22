/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.khuyenmai;

import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author THIS PC
 */
public class KhuyenMaiC extends KhuyenMai {
    
    public static int dem = 1;
    public ArrayList<SanPhamDiKem> ds = new ArrayList<>();
    
    {
        ma = String.format("C%04d", dem++);
    }
    
    public KhuyenMaiC(String ngayTao, String ngayHet) throws ParseException {
        super(ngayTao, ngayHet);
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Danh sach san pham khuyen mai di kem: ");
        this.ds.forEach(h->h.hienThi());
    }

    @Override
    public String layMa() {
        return this.ma;
    }

    @Override
    public String layLoai() {
        return "C";
    }

    @Override
    public int tinhNgayHetHan() {
        return super.tinhNgayHetHan(); 
    }

}
