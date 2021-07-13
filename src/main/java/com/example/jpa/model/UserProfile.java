package com.example.jpa.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "user_profiles")
public class UserProfile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "dob")
    private String dateOfBirth;
    private String address1;
    private String address2;
    private String country;

    @Column(name="zip_code")
    private String zipCode;

    @OneToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name="user_id", nullable = false)
    private User user;

    public UserProfile() {

    }

    public UserProfile(String phoneNumber, Gender gender,String dateOfBirth,String address1,String address2,
                       String country,String zipCode) {
        this.phoneNumber = phoneNumber;
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.address1=address1;
        this.address2=address1;
        this.country=country;
        this.zipCode=zipCode;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
