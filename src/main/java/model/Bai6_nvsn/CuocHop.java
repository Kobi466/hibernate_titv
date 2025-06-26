package model.Bai6_nvsn;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class CuocHop {
    @Id
    private String id;
    private String tenCuocHop;
    private String diaChi;
    private Date date;
    @ManyToMany
    @JoinTable(name = "cuocHop_nhanVien",
            joinColumns ={@JoinColumn(name = "cuocHop_id")},
            inverseJoinColumns = {@JoinColumn(name = "nhanVien_id")})
    private Set<NhanVien> danhSachNhanVien = new HashSet<>();
    public CuocHop() {}
    public CuocHop(String tenCuocHop, String diaChi, Date date) {
        this.tenCuocHop = tenCuocHop;
        this.diaChi = diaChi;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenCuocHop() {
        return tenCuocHop;
    }

    public void setTenCuocHop(String tenCuocHop) {
        this.tenCuocHop = tenCuocHop;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<NhanVien> getDanhSachNhanVien() {
        return danhSachNhanVien;
    }

    public void setDanhSachNhanVien(Set<NhanVien> danhSachNhanVien) {
        this.danhSachNhanVien = danhSachNhanVien;
    }
    public void addNhanVien(NhanVien nv1) {
        this.danhSachNhanVien.add(nv1);
    }

    @Override
    public String toString() {
        return "CuocHop{" +
                "id='" + id + '\'' +
                ", tenCuocHop='" + tenCuocHop + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", date=" + date +
                ", danhSachNhanVien=" + danhSachNhanVien +
                '}';
    }
}
