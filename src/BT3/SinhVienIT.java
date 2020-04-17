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
public class SinhVienIT extends SinhVienPoly{
    private double diemJava;
    private double diemCss;
    private double diemHtml;
    public SinhVienIT(double diemJava, double diemCss, double diemHtml, String hoTen) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemCss = diemCss;
        this.diemHtml = diemHtml;
    }


    @Override
    public double getDiem() {
        return (2 * diemJava + diemHtml + diemCss) / 4;
    }
    @Override
    public void XuatDS() {
        super.XuatDS(); 
        System.out.println("Điểm đạt được: " + getDiem() + "\n" + "Xếp loại học lực: " + super.getHocLuc() + "\n");
    }    
    
}
