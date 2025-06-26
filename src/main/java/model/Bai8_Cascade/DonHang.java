package model.Bai8_Cascade;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
@Entity
public class DonHang {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String tenKhachHang;
    private Date ngayMuaHang;
    @OneToMany(mappedBy = "donHang", cascade = CascadeType.ALL)
    private List<ChiTietDonHang> danhSachChiTietDonHang = new ArrayList<>();

    public DonHang() {
    }

    public DonHang(int id, String tenKhachHang, Date ngayMuaHang, List<ChiTietDonHang> danhSachChiTietDonHang) {
        this.id = id;
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
        this.danhSachChiTietDonHang = danhSachChiTietDonHang;
    }

    public DonHang(String tenKhachHang, Date ngayMuaHang) {
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
    }

    public DonHang(String tenKhachHang, Date ngayMuaHang, List<ChiTietDonHang> danhSachChiTietDonHang) {
        this.tenKhachHang = tenKhachHang;
        this.ngayMuaHang = ngayMuaHang;
        this.danhSachChiTietDonHang = danhSachChiTietDonHang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public Date getNgayMuaHang() {
        return ngayMuaHang;
    }

    public void setNgayMuaHang(Date ngayMuaHang) {
        this.ngayMuaHang = ngayMuaHang;
    }

    public List<ChiTietDonHang> getDanhSachChiTietDonHang() {
        return danhSachChiTietDonHang;
    }

    public void setDanhSachChiTietDonHang(List<ChiTietDonHang> danhSachChiTietDonHang) {
        this.danhSachChiTietDonHang = danhSachChiTietDonHang;
    }
    public void addChiTietDonHang(ChiTietDonHang donHang) {
        this.danhSachChiTietDonHang.add(donHang);
    }

    @Override
    public String toString() {
        return "DonHang{" +
                "id=" + id +
                ", tenKhachHang='" + tenKhachHang + '\'' +
                ", ngayMuaHang=" + ngayMuaHang +
                ", danhSachChiTietDonHang=" + danhSachChiTietDonHang +
                '}';
    }
}
