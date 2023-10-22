/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;
import java.util.ArrayList;

/**
 *
 * @author THIS PC
 */
public class QuanLyKhuyenMai {

    private ArrayList<KhuyenMai> ds = new ArrayList<>();

    public void nhapKM(int n) {
        LOAI.C.nhapSPDK();
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap loai ma khuyen mai cua san pham: ");
            String key = CauHinh.sc.nextLine();
            for (LOAI l : LOAI.values()) {
                if (String.valueOf(l).contains(key)){
                    this.getDs().add(l.taoMaKhuyenMai());
                }
            }
        }
    }
   
    public void hienThiDs() {
        this.getDs().forEach(k->k.hienThi());
    }
    
    public KhuyenMai traCuu(String key){
        for(KhuyenMai d:this.getDs())
            if(d.layMa().contains(key))
                return d;
        return null;
    }
    
    public void traMaKMTheoNgay(){
        System.out.print("Nhap x ngay: ");
        int x = Integer.parseInt(CauHinh.sc.nextLine());
        for(KhuyenMai d: this.getDs()){
            if((d.tinhNgayHetHan()-1) == -x){
                d.hienThi();
            }
        }
    }

    /**
     * @return the ds
     */
    public ArrayList<KhuyenMai> getDs() {
        return ds;
    }

    /**
     * @param ds the ds to set
     */
    public void setDs(ArrayList<KhuyenMai> ds) {
        this.ds = ds;
    }

}
