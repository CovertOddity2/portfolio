package com.pietervaneeckhout.model;

/**
 *
 * @author pveeckhout
 */
public class Personalia {

    public static Personalia create(String name, String sirName, String phone, String mobile, String StreetAndNumber, String zip, String city, String country, String email, String jobDescription) {
        return new Personalia(name, sirName, phone, mobile, StreetAndNumber, zip, city, country, email, jobDescription);
    }
    
    private String name;
    private String sirName;
    private String phone;
    private String mobile;
    private String streetAndNumber;
    private String zip;
    private String city;
    private String country;
    private String email;
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
