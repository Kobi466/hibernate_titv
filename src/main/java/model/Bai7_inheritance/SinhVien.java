package model.Bai7_inheritance;

import jakarta.persistence.Entity;

import java.sql.Date;
@Entity
public class SinhVien extends ConNguoi {
    private double diemTb;

    public SinhVien() {
    }

    public SinhVien(double diemTb) {
        this.diemTb = diemTb;
    }

    public SinhVien(String ìd, String ten, Date ngaySinh, double diemTb) {
        super(ìd, ten, ngaySinh);
        this.diemTb = diemTb;
    }
    public double getDiemTb() {
        return diemTb;
    }
    public void setDiemTb(double diemTb) {
        this.diemTb = diemTb;
    }

}
