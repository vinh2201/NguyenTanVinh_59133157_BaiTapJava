/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT2;

import BT1.Bai1_NhanVien;

/**
 *
 * @author potte
 */
public class Bai2_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        IQuanLy quanly = new QuanLyNhanVien();
        Bai1_NhanVien nv_1 = new Bai1_NhanVien("Nguyễn Thành An", 43, "Quy Nhơn, Biình ĐDịnh", 3850000, 375);
        Bai1_NhanVien nv_2 = new Bai1_NhanVien("Đặng Ngọc Thu Thảo", 28, "Hà Tĩnh, Hà Tĩnh", 2270000, 231);
        Bai1_NhanVien nv_3 = new Bai1_NhanVien("Trần Nguyễn Tuyết Linh", 31, "Phan Rang - Tháp Chàm, Ninh Thuận", 25020000, 258);
        Bai1_NhanVien nv_4 = new Bai1_NhanVien("Nguyễn Thị Lan Anh", 36, "Nha Trang, Khánh Hoà", 3620000, 351);
        Bai1_NhanVien nv_5 = new Bai1_NhanVien("Nguyễn Trần Tuyết Nhung", 24, "Cam Ranh, Khánh Hoà", 2436000, 240);
        quanly.them(nv_1);
        quanly.them(nv_2);
        quanly.them(nv_3);
        quanly.them(nv_4);
        quanly.them(nv_5);
        quanly.inDS();
    }
    
}
