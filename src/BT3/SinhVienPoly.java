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
public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    public abstract double getDiem();
    public String getHocLuc() {     
        if(getDiem() >= 9) {
            return "Xuất sắc";
        }
        
        else if((getDiem() >= 7.5) && (getDiem() < 9)) {
            return "Giỏi";
        }
        
        else if((getDiem() >= 6.5) && (getDiem() < 7.5)) {
            return "Khá";
        }
        
        else if((getDiem() >= 5) && (getDiem() < 6.5)) {
            return "Trung bình";
        }

        return "Yếu";
    }

    public SinhVienPoly(){        
    }
    public SinhVienPoly(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }  
    public void XuatDS() {       
        System.out.println("Họ và tên sinh viên: "+ hoTen + "\n" + "Ngành học: " + nganh);
    }
}
