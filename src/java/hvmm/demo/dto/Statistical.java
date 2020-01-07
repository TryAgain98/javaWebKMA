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
public class Statistical extends Employee{
   private String idRFID;
   private String datework;
   private String timeWork;
   private String checkDate;
   private int countDayOnTime;
   private int countDayLate;
   private int countDayOff;
   
    public Statistical() {
    }

    @Override
    public String toString() {
        return "Statistical{" + "idRFID=" + idRFID + ", datework=" + datework + ", timeWork=" + timeWork + ", checkDate=" + checkDate + ", countDayOnTime=" + countDayOnTime + ", countDayLate=" + countDayLate + ", countDayOff=" + countDayOff + '}';
    }

    public int getCountDayOnTime() {
        return countDayOnTime;
    }

    public void setCountDayOnTime(int countDayOnTime) {
        this.countDayOnTime = countDayOnTime;
    }

    public int getCountDayLate() {
        return countDayLate;
    }

    public void setCountDayLate(int countDayLate) {
        this.countDayLate = countDayLate;
    }

    public int getCountDayOff() {
        return countDayOff;
    }

    public void setCountDayOff(int countDayOff) {
        this.countDayOff = countDayOff;
    }

    
    public String getIdRFID() {
        return idRFID;
    }

    public void setIdRFID(String idRFID) {
        this.idRFID = idRFID;
    }

    public String getDatework() {
        return datework;
    }

    public void setDatework(String datework) {
        this.datework = datework;
    }

    public String getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(String timeWork) {
        this.timeWork = timeWork;
    }

    public String getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(String checkDate) {
        this.checkDate = checkDate;
    }
}
