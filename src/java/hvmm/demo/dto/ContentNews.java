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
public class ContentNews {
    private int idCN;
    private String tittle;
    private String content;
    private String image;
    private String noteImage;
    private int idTN;

    public ContentNews() {
    }

    @Override
    public String toString() {
        return "ContentNews{" + "idCN=" + idCN + ", tittle=" + tittle + ", content=" + content + ", image=" + image + ", noteImage=" + noteImage + ", idTN=" + idTN + '}';
    }

    public ContentNews( String tittle, String content, String image, String noteImage, int idTN) {
    
        this.tittle = tittle;
        this.content = content;
        this.image = image;
        this.noteImage = noteImage;
        this.idTN = idTN;
    }

    
    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNoteImage() {
        return noteImage;
    }

    public void setNoteImage(String noteImage) {
        this.noteImage = noteImage;
    }

    public int getIdCN() {
        return idCN;
    }

    public void setIdCN(int idCN) {
        this.idCN = idCN;
    }

    public int getIdTN() {
        return idTN;
    }

    public void setIdTN(int idTN) {
        this.idTN = idTN;
    }

    
    
    
    
}
