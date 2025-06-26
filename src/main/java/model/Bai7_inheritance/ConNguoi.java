package model.Bai7_inheritance;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import java.sql.Date;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class ConNguoi {
    @Id
    private String ìd;
    private String ten;
    private Date ngaySinh;

    public ConNguoi() {
    }

    public ConNguoi(String ìd, String ten, Date ngaySinh) {
        this.ìd = ìd;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
    }

    public String getÌd() {
        return ìd;
    }

    public void setÌd(String ìd) {
        this.ìd = ìd;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }


}
