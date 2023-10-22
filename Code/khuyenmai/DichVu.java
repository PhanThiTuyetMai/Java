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
public class DichVu {

    private String dichVu;

    public DichVu() {
    }

    public DichVu(String dichVu) {
        this.dichVu = dichVu;
    }
    
    public void nhapDV(){
        this.dichVu = CauHinh.sc.nextLine();
    }
    
    public void hienThi(){
        System.out.println(this.dichVu);
    }

    /**
     * @return the dichVu
     */
    public String getDichVu() {
        return dichVu;
    }

    /**
     * @param dichVu the dichVu to set
     */
    public void setDichVu(String dichVu) {
        this.dichVu = dichVu;
    }
    
   

}
