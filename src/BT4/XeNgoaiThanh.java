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
public class XeNgoaiThanh extends ChuyenXe{
    private String DiemCuoi;
    private int SoNgayDaDi;
    public XeNgoaiThanh(){
    }
    public XeNgoaiThanh(String DiemCuoi, int SoNgayDaDi, String MaChuyenXe, String HoTenTaiXe, String MaSoXe, double DoanhThu) {
        super(MaChuyenXe, HoTenTaiXe, MaSoXe, DoanhThu);
        this.DiemCuoi = DiemCuoi;
        this.SoNgayDaDi = SoNgayDaDi;
    }
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Điểm cuối của tuyến: " + DiemCuoi + "\n" + "Số ngày mà chuyến xe đã đi được: " + SoNgayDaDi + "\n");
    }   
}
