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
public class TittleNews {
    private int idTN;
    private String tittle;
    private String image;
    private String dateStart;
    private String dateUpdate;
    private int view;
    private String trangThai;
    private String tinHot;

    public TittleNews() {
    }

    public int getIdTN() {
        return idTN;
    }

    public void setIdTN(int idTN) {
        this.idTN = idTN;
    }

    

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDateStart() {
        return dateStart;
    }

    public void setDateStart(String dateStart) {
        this.dateStart = dateStart;
    }

    public String getDateUpdate() {
        return dateUpdate;
    }

    public void setDateUpdate(String dateUpdate) {
        this.dateUpdate = dateUpdate;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    

   

    public String getTinHot() {
        return tinHot;
    }

    public void setTinHot(String tinHot) {
        this.tinHot = tinHot;
    }  

    @Override
    public String toString() {
        return "TittleNews{" + "idTN=" + idTN + ", tittle=" + tittle + ", image=" + image + ", dateStart=" + dateStart + ", dateUpdate=" + dateUpdate + ", view=" + view + ", trangThai=" + trangThai + ", tinHot=" + tinHot + '}';
    }
    
}
