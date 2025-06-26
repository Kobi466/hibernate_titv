package model.Bai3_1vs1;

import jakarta.persistence.*;

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private int id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "relationship_id")
    private Person relationship;

    public Person() {
    }

    public Person(String name, Person relationship) {
        this.name = name;
        this.relationship = relationship;
    }

    public Person(int id, String name, Person relationship) {
        this.id = id;
        this.name = name;
        this.relationship = relationship;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person getRelationship() {
        return relationship;
    }
    public void setRelationship(Person relationship) {
        this.relationship = relationship;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", relationship=" + Person.class.toString() +
                '}';
    }
}
