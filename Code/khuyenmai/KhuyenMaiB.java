/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;
import java.text.ParseException;
import java.util.ArrayList;

/**
 *
 * @author THIS PC
 */
public class KhuyenMaiB extends KhuyenMai {

    private ArrayList<DichVu> ds = new ArrayList<>();
    public static int n = 0;
    
    {
        ma = String.format("B%04d", (int) (Math.random() * ((9999 - 1000) + 1) + 1000));
    }

    public KhuyenMaiB(String ngayTao, String ngayHet) throws ParseException {
        super(ngayTao, ngayHet);
    }

    public void themDV(DichVu h) {
        this.getDs().add(h);
    }

    public void nhapDV() {
        System.out.print("Nhap so dich vu muon tang kem: ");
        n = Integer.parseInt(CauHinh.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap dich vu khuyen mai thu %d: ", i + 1);
            DichVu h = new DichVu();
            h.nhapDV();
            this.getDs().add(h);
        }
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Danh sach dich vu khuyen mai: ");
        this.ds.forEach(h -> h.hienThi());
    }

    @Override
    public String layMa() {
       return this.ma;
    }

    @Override
    public String layLoai() {
        return "B";
    }

    @Override
    public int tinhNgayHetHan() {
        return super.tinhNgayHetHan(); 
    }

    /**
     * @return the ds
     */
    public ArrayList<DichVu> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<DichVu> ds) {
        this.ds = ds;
    }

}
