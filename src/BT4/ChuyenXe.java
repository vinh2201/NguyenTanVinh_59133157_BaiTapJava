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
public class ChuyenXe {
    private String MaChuyenXe;
    private String HoTenTaiXe;
    private String MaSoXe;
    private double DoanhThu;
    public ChuyenXe(){
    }
    public ChuyenXe(String MaChuyenXe, String HoTenTaiXe, String MaSoXe, double DoanhThu) {
        this.MaChuyenXe = MaChuyenXe;
        this.HoTenTaiXe = HoTenTaiXe;
        this.MaSoXe = MaSoXe;
        this.DoanhThu = DoanhThu;
    }

    public double getDoanhThu() {
        return DoanhThu;
    }

    public void setDoanhThu(double DoanhThu) {
        this.DoanhThu = DoanhThu;
    }
    public void xuat() {
        System.out.println("Mã chuyến xe: " + MaChuyenXe + "\n" + "Họ và tên tài xế: " + HoTenTaiXe + "\n" + "Mã số xe: " + MaSoXe + "\n" + "Doanh thu của chuyến: " + DoanhThu);
    }
}
