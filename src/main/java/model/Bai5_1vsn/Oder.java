package model.Bai5_1vsn;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Oder {
    @Id
    private String oder_id;
    private String address;
    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customer;

    public Oder() {
    }

    public Oder(String oder_id, String address, Customer customer) {
        this.oder_id = oder_id;
        this.address = address;
        this.customer = customer;
    }

    public String getOder_id() {
        return oder_id;
    }

    public void setOder_id(String oder_id) {
        this.oder_id = oder_id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Oder{" +
                "oder_id='" + oder_id + '\'' +
                ", address='" + address + '\'' +
                ", customer=" + customer.toString() +
                '}';
    }
}
