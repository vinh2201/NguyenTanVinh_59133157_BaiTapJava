/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author potte
 */
public class Bai1_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Bai1_NhanVien nv_1 = new Bai1_NhanVien("Nguyễn Thành An", 43, "Quy Nhơn, Bình Định", 3850000, 315);
        System.out.println (nv_1.getThongTin() + "Tiền thưởng cho số giờ làm của nhân viên: " + nv_1.tinhThuong());
        Bai1_NhanVien nv_2 = new Bai1_NhanVien("Đặng Ngọc Thu Thảo", 28, "Hà Tĩnh, Hà Tĩnh", 2270000, 231);
        System.out.println (nv_2.getThongTin() + "Tiền thưởng cho số giờ làm của nhân viên: " + nv_2.tinhThuong());
    }
    
}
