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
public class SinhVienBiz extends SinhVienPoly{
    private double diemMarketing;
    private double diemSales;
    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

 
    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
    @Override
    public void XuatDS() {
        super.XuatDS(); 
        System.out.println("Điểm đạt được: " + getDiem() + "\n" + "Xếp loại học lực: " + super.getHocLuc() + "\n");
    }
}
