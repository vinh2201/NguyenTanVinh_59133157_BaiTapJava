/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT3;

/**
 *
 * @author potte
 */
public class Bai3_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinhVienPoly SV_Poly = new SinhVienIT(9, 5, 8,"Nguyễn Thành Phong");
        SinhVienIT SV_IT = new SinhVienIT(6.25, 7.9, 5.2, "Lê Nhật Trường");
        SinhVienBiz SV_Biz = new SinhVienBiz(7, 6.2, "Nguyễn Tấn Vĩnh");
        SV_Poly.XuatDS();
        SV_IT.XuatDS();
        SV_Biz.XuatDS();
    }
    
}
