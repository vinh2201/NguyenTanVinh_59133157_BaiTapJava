/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BT1;

/**
 *
 * @author potte
 */
public class Bai1_NhanVien {
    String HoTen;
    int Tuoi;
    String DiaChi;
    double Luong;
    int SoGioLam;
    public String getThongTin() {
        return "Tên: " + HoTen + "\n" + "Tuổi: " + Tuoi + "\n" + "Địa chỉ: " + DiaChi + "\n" + "Tiền lương: " + Luong + "\n" + "Tổng số giờ làm: " + SoGioLam + "\n";
    }
    public double tinhThuong() {
        if(SoGioLam >= 200) {
            return Luong*0.2;
        }
        else if(SoGioLam >= 100 && SoGioLam < 200){
            return Luong*0.1;
        }
        else if(SoGioLam<100) {
            return 0;
        }
        return 0;
    }
    public Bai1_NhanVien() {
    }
    public Bai1_NhanVien(String HoTen, int Tuoi, String DiaChi, double Luong, int SoGioLam) {
        this.HoTen = HoTen;
        this.Tuoi = Tuoi;
        this.DiaChi = DiaChi;
        this.Luong = Luong;
        this.SoGioLam = SoGioLam;
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public double getTienLuong() {
        return Luong;
    }

    public int getSoGioLam() {
        return SoGioLam;
    }
    
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    
    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public void setTienLuong(double Luong) {
        this.Luong = Luong;
    }

    public void setSoGioLam(int SoGioLam) {
        this.SoGioLam = SoGioLam;
    }    
}
