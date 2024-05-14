package com.tut.entity.EmbeddableExe;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int addressId;
    @Column(length = 50)
    private String street;
    @Column(length = 100)
    private String City;
    @Column(name = "is_open")
    private boolean isOpen;
  //  @Transient
    private double x;
    @Column(name = "added_date")
    @Temporal(TemporalType.DATE)
    private Date addDate;
    @Lob
    private byte[] image;

    public Address(){
        super();
    }

    public Address(int addressId, String street, String City, boolean isOpen,double x, Date addDate, byte[] image){
        this.addressId=addressId;
        this.street=street;
        this.City=City;
        this.x=x;
        this.isOpen=isOpen;
        this.addDate=addDate;
        this.image =image;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", street='" + street + '\'' +
                ", City='" + City + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addDate=" + addDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
