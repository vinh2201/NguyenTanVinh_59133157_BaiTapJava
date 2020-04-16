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
        ChuyenXe chuyen_1 = new XeNoiThanh("02", 72, "001", "Bùi Thanh Thế", "51C-22531", 3500000);
        ChuyenXe chuyen_2 = new XeNoiThanh("05", 210, "002", "Lê Thành Tiến", "78C-83572", 8200000);
        ChuyenXe chuyen_3 = new XeNoiThanh("03", 483, "003", "Trần Công Thành", "54H-62781", 13000000);
        ChuyenXe chuyen_4 = new XeNgoaiThanh("Nha Trang", 3, "004", "Nguyễn thị Lệ Mỹ", "NT2219", 4000000);
        ChuyenXe chuyen_5 = new XeNgoaiThanh("Bình Thuận", 4, "005", "Vũ Thị Mai", "NT7923", 2300000);
        ChuyenXe chuyen_6 = new XeNgoaiThanh("TP.HCM", 1, "006", "Trần Thanh Trọng", "NT0643", 7550000);
        
        // Thêm vào DS
        QuanLyChuyenXe quanly = new QuanLyChuyenXe();
        quanly.themChuyenXe(chuyen_1);
        quanly.themChuyenXe(chuyen_2);
        quanly.themChuyenXe(chuyen_3);
        quanly.themChuyenXe(chuyen_4);
        quanly.themChuyenXe(chuyen_5);
        quanly.themChuyenXe(chuyen_6);
        
        // Xuất DS
        quanly.xuatDS();
        
        // Tính Doanh thu
        System.out.println("Tổng doanh thu xe ngoại thành: " + quanly.tinhDoanhThuNgoaiThanh());
        System.out.println("Tổng doanh thu xe nội thành: " + quanly.tinhDoanhThuNoiThanh());
        System.out.println("Tổng doanh thu cả 2 loại xe: " + (quanly.tinhDoanhThuNoiThanh() + quanly.tinhDoanhThuNgoaiThanh()));
    }
    
}
