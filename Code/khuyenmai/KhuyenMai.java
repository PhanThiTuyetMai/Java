/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author THIS PC
 */
public abstract class KhuyenMai {
    private Date ngayTao;
    private Date ngayHet;
    public String ma;

    public KhuyenMai(Date ngayTao, Date ngayHet) {
        this.ngayTao = ngayTao;
        this.ngayHet = ngayHet;
    }
    
    public KhuyenMai(String ngayTao, String ngayHet) throws ParseException {
        this(CauHinh.t.parse(ngayTao), CauHinh.t.parse(ngayHet));
    }
    
    public void nhapNgayKM() {
        System.out.print("Nhap ngay tao: ");
        String nTao = CauHinh.sc.nextLine();
        System.out.print("Nhap ngay het: ");
        String nHet = CauHinh.sc.nextLine();
    }

    public void hienThi() {
        System.out.printf("Ma: %s\n", this.ma);
        System.out.printf("Ngay Tao: %s\n", CauHinh.t.format(this.ngayTao));
        System.out.printf("Ngay Het: %s\n", CauHinh.t.format(this.ngayHet));
    }
    
    public abstract String layMa();
    
    public abstract String layLoai();
    
    public int tinhNgayHetHan() {
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Date hienTai = new Date();
        c1.setTime(ngayHet);
        c2.setTime(hienTai);
        int n = (int) ((c2.getTime().getTime()-c1.getTime().getTime())/(24*3600*1000));
        return n;
    }
   
    /**
     * @return the ngayTao
     */
    public Date getNgayTao() {
        return ngayTao;
    }

    /**
     * @param ngayTao the ngayTao to set
     */
    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    /**
     * @return the ngayHet
     */
    public Date getNgayHet() {
        return ngayHet;
    }

    /**
     * @param ngayHet the ngayHet to set
     */
    public void setNgayHet(Date ngayHet) {
        this.ngayHet = ngayHet;
    }
    
    /**
     * @return the ma
     */
    public String getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(String ma) {
        this.ma = ma;
    }

}
