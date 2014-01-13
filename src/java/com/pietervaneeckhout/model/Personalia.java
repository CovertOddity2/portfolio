package com.pietervaneeckhout.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author pveeckhout
 */
@Entity
@Table(name = "Personalia")
public class Personalia implements Serializable {

    public static Personalia create(String name, String sirName, String phone, String mobile, String StreetAndNumber, String zip, String city, String country, String email, String jobDescription) {
        return new Personalia(name, sirName, phone, mobile, StreetAndNumber, zip, city, country, email, jobDescription);
    }
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "name", nullable = false, length = 25)
    private String name;
    @Column(name = "sirname", nullable = false, length = 25)
    private String sirName;
    @Column(name = "phone", nullable = false, length = 25)
    private String phone;
    @Column(name = "mobile", nullable = false, length = 25)
    private String mobile;
    @Column(name = "street_and_number", nullable = false, length = 100)
    private String streetAndNumber;
    @Column(name = "zip", nullable = false, length = 10)
    private String zip;
    @Column(name = "city", nullable = false, length = 25)
    private String city;
    @Column(name = "country", nullable = false, length = 25)
    private String country;
    @Column(name = "email", nullable = false, length = 25)
    private String email;
    @Column(name = "job", nullable = false, length = 25)
    private String jobDescription;

    private Personalia(String name, String sirName, String phone, String mobile, String streetAndNumber, String zip, String city, String country, String email, String jobDescription) {
        this.name = name;
        this.sirName = sirName;
        this.phone = phone;
        this.mobile = mobile;
        this.streetAndNumber = streetAndNumber;
        this.zip = zip;
        this.city = city;
        this.country = country;
        this.email = email;
        this.jobDescription = jobDescription;
    }

    public Personalia() {
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

    public String getSirName() {
        return sirName;
    }

    public void setSirName(String sirName) {
        this.sirName = sirName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String StreetAndNumber) {
        this.streetAndNumber = StreetAndNumber;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }    
}
