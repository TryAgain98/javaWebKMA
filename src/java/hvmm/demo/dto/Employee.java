/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.dto;

import java.sql.Date;



/**
 *
 * @author Huy Toan
 */
public class Employee extends Room{
    private String idRFID;
    private String idFingerprint;
    private String email;
    private String pass;
    private String fullName;
    private String phone;
    private String address;
    private String birthday;
    private String gender;
    private String positionn;
    private String powerful;
    private double cSalary;
    private String image;
    private String keyAES;
    private int idRoom;
   
    public Employee() {
    }

    public Employee(String idRFID, String idFingerprint, String email, String pass, String fullName, String phone, String address, String birthday, String gender, String positionn, String powerful, double cSalary, String image, String keyAES, int idRoom) {
        this.idRFID = idRFID;
        this.idFingerprint = idFingerprint;
        this.email = email;
        this.pass = pass;
        this.fullName = fullName;
        this.phone = phone;
        this.address = address;
        this.birthday = birthday;
        this.gender = gender;
        this.positionn = positionn;
        this.powerful = powerful;
        this.cSalary = cSalary;
        this.image = image;
        this.keyAES = keyAES;
        this.idRoom = idRoom;
    }

    public String getKeyAES() {
        return keyAES;
    }

    public void setKeyAES(String keyAES) {
        this.keyAES = keyAES;
    }

    public String getIdRFID() {
        return idRFID;
    }

    public void setIdRFID(String idRFID) {
        this.idRFID = idRFID;
    }

    public String getIdFingerprint() {
        return idFingerprint;
    }

    public void setIdFingerprint(String idFingerprint) {
        this.idFingerprint = idFingerprint;
    }

    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPositionn() {
        return positionn;
    }

    public void setPositionn(String positionn) {
        this.positionn = positionn;
    }

    public String getPowerful() {
        return powerful;
    }

    public void setPowerful(String powerful) {
        this.powerful = powerful;
    }

    public double getcSalary() {
        return cSalary;
    }

    public void setcSalary(double cSalary) {
        this.cSalary = cSalary;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Employee{" + "idRFID=" + idRFID + ", idFingerprint=" + idFingerprint + ", email=" + email + ", pass=" + pass + ", fullName=" + fullName + ", phone=" + phone + ", address=" + address + ", birthday=" + birthday + ", gender=" + gender + ", positionn=" + positionn + ", powerful=" + powerful + ", cSalary=" + cSalary + ", image=" + image + ", keyAES=" + keyAES + ", idRoom=" + idRoom + '}';
    }

    
    
}
