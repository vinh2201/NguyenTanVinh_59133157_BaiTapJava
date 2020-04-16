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
public class XeNoiThanh extends ChuyenXe{
    private String So_tuyen;
    private double So_km;
    public XeNoiThanh(){
    }
    
    public XeNoiThanh(String So_tuyen, double So_km, String MaChuyenXe, String HoTenTaiXe, String MaSoXe, double DoanhThu) {
        super(MaChuyenXe, HoTenTaiXe, MaSoXe, DoanhThu);
        this.So_tuyen = So_tuyen;
        this.So_km = So_km;
    }
    @Override
    public void xuat() {
        super.xuat(); 
        System.out.println("Số tuyến của chuyến xe: " + So_tuyen + "\n" + "Số km đi được: " + So_km + "\n");
    }  
}
