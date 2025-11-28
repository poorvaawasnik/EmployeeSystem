package com.example.EmployeeSystem.entity;

import jakarta.persistence.*;

@Entity
@Table(name="address")
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name="area")
    private String area;
    @Column(name="city")
    private String city;
    @Column(name="pincode")
    private Integer pincode;

    public AddressEntity(String area, String city, Integer pincode) {
        this.area = area;
        this.city = city;
        this.pincode = pincode;
    }

    public AddressEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "AddressEntity{" +
                "id=" + id +
                ", area='" + area + '\'' +
                ", city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
