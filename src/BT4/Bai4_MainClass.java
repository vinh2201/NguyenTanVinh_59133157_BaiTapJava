/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;

/**
 *
 * @author potte
 */
public class Bai4_MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Khởi tạo
        ChuyenXe chuyen_1 = new XeNoiThanh("001", 90, "001", "Lê Thành Phương", "79-Z1011.10", 3500000);
        ChuyenXe chuyen_2 = new XeNoiThanh("002", 140, "002", "Nguyễn Hoàng Anh Tiến", "56-A2102.34", 8200000);
        ChuyenXe chuyen_3 = new XeNoiThanh("003", 300, "003", "Nguyễn Tấn Vĩnh", "72-C2192.56", 13000000);
        ChuyenXe chuyen_4 = new XeNgoaiThanh("TPHCM", 3, "004", "Hồ Lê Thanh Thiện", "TH1010", 4000000);
        ChuyenXe chuyen_5 = new XeNgoaiThanh("Hà Nội", 4, "005", "Lê Quang Hưởng", "TH33333", 2300000);
        ChuyenXe chuyen_6 = new XeNgoaiThanh("Phú Yên", 1, "006", "", "Ngô Quốc Trung", 7550000);
        
        // Thêm vào DS
        QuanLyChuyenXe quanlychuyenxe = new QuanLyChuyenXe();
        quanlychuyenxe.themChuyenXe(chuyen_1);
        quanlychuyenxe.themChuyenXe(chuyen_2);
        quanlychuyenxe.themChuyenXe(chuyen_3);
        quanlychuyenxe.themChuyenXe(chuyen_4);
        quanlychuyenxe.themChuyenXe(chuyen_5);
        quanlychuyenxe.themChuyenXe(chuyen_6);
        
        // Xuất DS
        quanlychuyenxe.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: "+quanlychuyenxe.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: "+quanlychuyenxe.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: "+(quanlychuyenxe.tinhDoanhThuNoiThanh()+quanlychuyenxe.tinhDoanhThuNgoaiThanh()));
    }
    
}
