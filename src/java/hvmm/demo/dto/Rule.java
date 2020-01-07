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
public class Rule {
    private int idRule ;
    
    private String timeStart;
    private String timeEnd;
    private String costume;//trang phuc
    private String prohibit;//cam
    private String object;//doi tg huong den
    private String introduce;//gioi thieu

    public Rule() {
    }

    public int getIdRule() {
        return idRule;
    }

    public void setIdRule(int idRule) {
        this.idRule = idRule;
    }

    
    public String getTimeStart() {
        return timeStart;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

   
    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public String getCostume() {
        return costume;
    }

    public void setCostume(String costume) {
        this.costume = costume;
    }

    public String getProhibit() {
        return prohibit;
    }

    public void setProhibit(String prohibit) {
        this.prohibit = prohibit;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }
    
    
}
