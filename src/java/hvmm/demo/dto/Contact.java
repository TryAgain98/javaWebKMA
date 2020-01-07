/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.dto;

/**
 *
 * @author Huy Toan
 */
public class Contact {
    private int idContact ;
    private String nameSchool;
    private String manager;
    private String address;
    private String email;
    private String phone;
    private String image;

    public Contact() {
    }

    @Override
    public String toString() {
        return "Contact{" + "idContact=" + idContact + ", nameSchool=" + nameSchool + ", manager=" + manager + ", address=" + address + ", email=" + email + ", phone=" + phone + ", image=" + image + '}';
    }

    public int getIdContact() {
        return idContact;
    }

    public void setIdContact(int idContact) {
        this.idContact = idContact;
    }

    public String getNameSchool() {
        return nameSchool;
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
    
}
