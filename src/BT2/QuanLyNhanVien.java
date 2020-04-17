/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.Bai1_NhanVien;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author potte
 */
public class QuanLyNhanVien implements IQuanLy{
    List<Bai1_NhanVien> DanhSach_NV = new ArrayList<>();;

    public QuanLyNhanVien() {
        this.DanhSach_NV = new ArrayList<>();
    }

    @Override
    public void them(Bai1_NhanVien nhan_vien) {
        DanhSach_NV.add(nhan_vien);
    }

    @Override
    public void inDS() {
        for(Bai1_NhanVien nhanvien: DanhSach_NV) {
            System.out.println(nhanvien.getThongTin());
        }
    }


    
}
