package model.Bai7_inheritance;

import jakarta.persistence.Entity;

import java.sql.Date;
@Entity
public class GiaoVien extends ConNguoi {
    private String monHocPhuTrach;
    public GiaoVien() {}

    public GiaoVien(String monHocPhuTrach) {
        this.monHocPhuTrach = monHocPhuTrach;
    }

    public GiaoVien(String ìd, String ten, Date ngaySinh, String monHocPhuTrach) {
        super(ìd, ten, ngaySinh);
        this.monHocPhuTrach = monHocPhuTrach;
    }

    public String getMonHocPhuTrach() {
        return monHocPhuTrach;
    }

    public void setMonHocPhuTrach(String monHocPhuTrach) {
        this.monHocPhuTrach = monHocPhuTrach;
    }
}
