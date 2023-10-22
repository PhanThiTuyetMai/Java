/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package bai1.khuyenmai;

import Demo.CauHinh;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author THIS PC
 */
public enum LOAI {
    A {
        @Override
        public KhuyenMai taoMaKhuyenMai() {
            try {
                KhuyenMaiA k = new KhuyenMaiA(this.nhapNgayTaoKM(), this.nhapNgayHetKM(), this.nhapThongTinKM());
                return k;
            } catch (ParseException ex) {
                Logger.getLogger(LOAI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }

    },
    B {
        @Override
        public KhuyenMai taoMaKhuyenMai() {
            try {
                KhuyenMaiB k = new KhuyenMaiB(this.nhapNgayTaoKM(), this.nhapNgayHetKM());
                k.nhapDV();
                return k;
            } catch (ParseException ex) {
                Logger.getLogger(LOAI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }

    },
    C {
        @Override
        public KhuyenMai taoMaKhuyenMai() {
            try {
                KhuyenMaiC k = new KhuyenMaiC(this.nhapNgayTaoKM(), this.nhapNgayHetKM());
                System.out.print("Nhap danh muc khuyen mai chi dinh: ");
                String key = CauHinh.sc.nextLine();
                k.ds.add(ql.traCuu(key));
                return k;
            } catch (ParseException ex) {
                Logger.getLogger(LOAI.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }

    };

    public QuanLyKhuyenMaiDiKem ql = new QuanLyKhuyenMaiDiKem();

    public String nhapNgayTaoKM() {
        System.out.print("Nhap ngay tao: ");
        String nTao = CauHinh.sc.nextLine();
        return nTao;
    }

    public String nhapNgayHetKM() {
        System.out.print("Nhap ngay het: ");
        String nHet = CauHinh.sc.nextLine();
        return nHet;
    }

    public String nhapThongTinKM() {
        System.out.print("Nhap thong tin khuyen mai ma: ");
        String thongTin = CauHinh.sc.nextLine();
        return thongTin;
    }
    
    public void nhapSPDK(){
        ql.nhapSanPhamDK();
    }

    public KhuyenMai taoMaKhuyenMai() {
        return null;
    }

}
