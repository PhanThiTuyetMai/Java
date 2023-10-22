/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;

/**
 *
 * @author THIS PC
 */
public class SanPhamDiKem {
    private String tenSP;
    private String phanTram;

    public SanPhamDiKem() {
    }
    
    public SanPhamDiKem(String tenDM,String tenSP, String phanTram) {
        this.tenSP = tenSP;
        this.phanTram = phanTram;
    }
    
    public void nhapSPDK(){
        System.out.print("Nhap ten san pham: ");
        this.setTenSP(CauHinh.sc.nextLine());
        System.out.print("Thong tin phan tram giam: ");
        this.phanTram = CauHinh.sc.nextLine();
    }
    
    public void hienThi(){
        System.out.println("Ten san pham: " + this.getTenSP());
        System.out.println("Thong tin phan tram giam: " + this.getPhanTram());
    }
    
    /**
     * @return the phanTram
     */
    public String getPhanTram() {
        return phanTram;
    }

    /**
     * @param phanTram the phanTram to set
     */
    public void setPhanTram(String phanTram) {
        this.phanTram = phanTram;
    }

    /**
     * @return the tenSP
     */
    public String getTenSP() {
        return tenSP;
    }

    /**
     * @param tenSP the tenSP to set
     */
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

}
