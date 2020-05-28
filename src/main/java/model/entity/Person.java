package model.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="people")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person  extends BaseEntity{
    @Column
    private String name;

    @Column(unique = true)
    private String egn;

//    @ManyToOne(cascade = CascadeType.MERGE)
    @ManyToOne
    @JoinColumn(name="address")
    private Address address;

    @Column
    private int age;

    @Column
    private String phone;

    public Person() {
        super();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", egn='" + egn + '\'' +
                ", address=" + address +
                ", age=" + age +
                ", phone='" + phone + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        Person person= (Person) o;
        if(person.getEgn().equals(this.egn))
            return true;
        else
            return false;
    }

}
