package model.Bai5_1vsn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Customer {
    @Id
    private String cus_id;

    private String name;
    private String email;

    @OneToMany(mappedBy="customer")
    private List<Oder> oders;


    public Customer() {
    }
    public Customer(String id, String name, String email) {
        this.cus_id = id;
        this.name = name;
        this.email = email;
    }

    public String getCus_id() {
        return cus_id;
    }

    public void setCus_id(String cus_id) {
        this.cus_id = cus_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Oder> getOders() {
        return oders;
    }

    public void setOders(List<Oder> oders) {
        this.oders = oders;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cus_id='" + cus_id + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", oders=" + getOders().size() +
                '}';
    }
    private Oder in(){
        for(Oder o : oders){
            return o;
        }
        return null;
    }
}
