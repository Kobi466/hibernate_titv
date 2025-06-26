package model.Bai4_nvs1;

import jakarta.persistence.*;

import java.sql.Date;
@Entity
public class Author {
    @Id
    private String author_id;
    private String name;
    private Date date;
    public Author() {}
    public Author(String author_id, String name, Date date) {
        this.author_id = author_id;
        this.name = name;
        this.date = date;
    }

    public String getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(String author_id) {
        this.author_id = author_id;
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

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
