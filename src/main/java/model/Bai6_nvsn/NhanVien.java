package model.Bai6_nvsn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.sql.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class NhanVien {
    @Id
    private String id;
    private String name;
    private Date date;
    @ManyToMany(mappedBy = "danhSachNhanVien")
    private Set<CuocHop> danhSachCuocHop = new HashSet<>();

    public NhanVien() {
    }

    public NhanVien(String id, String name, Date date) {
        this.id = id;
        this.name = name;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Set<CuocHop> getDanhSachCuocHop() {
        return danhSachCuocHop;
    }

    public void setDanhSachCuocHop(Set<CuocHop> danhSachCuocHop) {
        this.danhSachCuocHop = danhSachCuocHop;
    }
    public void addDanhSachCuocHop(CuocHop cuocHop) {
        danhSachCuocHop.add(cuocHop);
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
