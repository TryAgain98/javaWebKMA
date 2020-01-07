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
public class Room {
    private int idRoom;
    private String name;
    private String introduce;
    private String loai;
   private double percentWorkOnTime;
   private double percentWorkLate;
private double percentWorkOff;

    public double getPercentWorkOnTime() {
        return percentWorkOnTime;
    }

    public void setPercentWorkOnTime(double percentWorkOnTime) {
        this.percentWorkOnTime = percentWorkOnTime;
    }

    public double getPercentWorkLate() {
        return percentWorkLate;
    }

    public void setPercentWorkLate(double percentWorkLate) {
        this.percentWorkLate = percentWorkLate;
    }

    public double getPercentWorkOff() {
        return percentWorkOff;
    }

    public void setPercentWorkOff(double percentWorkOff) {
        this.percentWorkOff = percentWorkOff;
    }
   

    public Room() {
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }
    
    
}
