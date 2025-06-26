package model.Bai1_2_CRUD;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Cat {
    @Id //Khoa chinh
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto value
    private Integer id;
    private String name;
    private Date birthday;
    private boolean sex;
    public Cat() {
    }

    public Cat(String name, Date birthday, boolean sex) {
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public Cat(Integer id, String name, Date birthday, boolean sex) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", sex=" + sex +
                '}';
    }
}
