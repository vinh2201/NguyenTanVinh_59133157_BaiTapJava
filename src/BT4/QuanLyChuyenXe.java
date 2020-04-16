/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT4;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author potte
 */
public class QuanLyChuyenXe {
    List<ChuyenXe> DanhSach_Chuyen = new ArrayList<>();
    void themChuyenXe(ChuyenXe chuyen) {
        
        DanhSach_Chuyen.add(chuyen);
    }
    
    void xuatDS() {       
        for(ChuyenXe chuyen: DanhSach_Chuyen) {
            chuyen.xuat();
        }
    }
    
    double tinhDoanhThuNoiThanh() {
        double tong = 0;
        for(ChuyenXe chuyen: DanhSach_Chuyen) {
            if(chuyen instanceof XeNoiThanh) {
                tong = tong + chuyen.getDoanhThu();
            }
        }
        return tong;
    }
    
    double tinhDoanhThuNgoaiThanh() {
        double tong = 0;
        for(ChuyenXe chuyen: DanhSach_Chuyen) {
            if(chuyen instanceof XeNgoaiThanh) {
                tong = tong + chuyen.getDoanhThu();
            }
        }
        return tong;
    }
}
