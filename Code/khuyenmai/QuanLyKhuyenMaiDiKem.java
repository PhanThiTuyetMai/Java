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
public class QuanLyKhuyenMaiDiKem {
    
    private ArrayList<DanhMucSP> danhSachDM = new ArrayList<>();

    public void themSPDK(DanhMucSP s) {
        this.getDanhSachDM().add(s);
    }

    public void nhapSanPhamDK() {
        System.out.print("Nhap so luong danh muc co san pham khuyen mai: ");
        int m = Integer.parseInt(CauHinh.sc.nextLine());
        for (int j = 0; j < m; j++) {
            DanhMucSP d = new DanhMucSP();
            d.nhapSanPhamDK();
            this.getDanhSachDM().add(d);
        }
    }
    
    public SanPhamDiKem traCuu(String key){
        for(DanhMucSP d:this.getDanhSachDM())
            if(d.getTen().contains(key)){
                System.out.print("Nhap ten san pham dinh kem cua ma khuyen mai: ");
                String t = CauHinh.sc.nextLine();
                for(SanPhamDiKem k :d.getList()){
                    if(k.getTenSP().contains(t)){
                        return k;
                    }
                }
            }
        return null;
    }

    public void hienThi() {
        this.getDanhSachDM().forEach(h -> h.hienThi());
    }

    /**
     * @return the danhSachDM
     */
    public ArrayList<DanhMucSP> getDanhSachDM() {
        return danhSachDM;
    }

    /**
     * @param danhSachDM the danhSachDM to set
     */
    public void setDanhSachDM(ArrayList<DanhMucSP> danhSachDM) {
        this.danhSachDM = danhSachDM;
    }
    

}
