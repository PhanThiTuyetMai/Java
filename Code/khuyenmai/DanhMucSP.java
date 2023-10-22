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
public class DanhMucSP {

    private String ten;
    private ArrayList<SanPhamDiKem> list = new ArrayList<>();

    public DanhMucSP() {
    }

    public DanhMucSP(String ten) {
        this.ten = ten;
    }
    
    public void nhapSanPhamDK() {
        System.out.print("Danh Muc San Pham: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.print("Nhap so luong san pham dinh kem thuoc danh muc: ");
        int n = Integer.parseInt(CauHinh.sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap san pham thu %d\n", i+1);
            SanPhamDiKem s = new SanPhamDiKem();
            s.nhapSPDK();
            this.list.add(s);
        }
    }

    public void hienThi() {
        this.list.forEach(h -> h.hienThi());
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
     * @return the list
     */
    public ArrayList<SanPhamDiKem> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(ArrayList<SanPhamDiKem> list) {
        this.list = list;
    }

}
