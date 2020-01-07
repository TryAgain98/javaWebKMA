/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Contact;
import hvmm.demo.dto.Employee;
import hvmm.demo.dto.Room;
import hvmm.demo.dto.Rule;
import hvmm.demo.dto.Statistical;
import hvmm.demo.model.Encryption;
import hvmm.demo.model.mCN;
import hvmm.demo.model.mContact;
import hvmm.demo.model.mEmployee;
import hvmm.demo.model.mRoom;
import hvmm.demo.model.mRule;
import hvmm.demo.model.mStatistical;
import hvmm.demo.model.mTN;
import java.sql.SQLException;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Huy Toan
 */
@Controller
public class StatisticalController {

    mRoom mr = new mRoom();
    mEmployee me = new mEmployee();
    Encryption ec = new Encryption();
    mStatistical ms = new mStatistical();
    mTN mtn = new mTN();
    mCN mcn = new mCN();
    mRule mRule = new mRule();
    mContact mc=new mContact();

    @RequestMapping("/statisticalEmployee")
    public String Employee(Model model) throws SQLException {
        List<Employee> le = me.show();
        model.addAttribute("lep", le);

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
          Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);

        return "StatisticalEmployee";
    }

    @RequestMapping("/ShowStatisticalPhong")
    public String ShowStatisticalPhong(Model model) throws SQLException {
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "ShowStatisticalPhong";

    }

    @RequestMapping("/searchStatisticalRoom")
    public String searchStatisticalRoom(Model model, @RequestParam("idRoom") int idRoom) throws SQLException, ParseException {
        // Tính Ngày Hiện Tại
        String monthYearNow = ms.monthNow();
        int dayNow = ms.formatDay(monthYearNow);
        String dateStart = 1 + "-" + monthYearNow;
        String dateEnd = dayNow + "-" + monthYearNow;

        // Tính Ngày Hiện Tại
        int totalDay = ms.CountAboutDay(dateStart, dateEnd);//tổng khoảng ngày 
        int totalDayRoomE = ms.TotalDayRoom(totalDay, idRoom);//tổng khoảng ngày * số nhân viên trong p
        System.out.println("tong ngay = "+totalDayRoomE);
        int dayOnTime = ms.totalRoomDayOnTime(idRoom, dateStart, dateEnd);
        int dayLate = ms.totalRoomDayLate(idRoom, dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDayRoomE);
        List<Statistical> ls = ms.ListDayOnLateTimeEmployeeR(idRoom, dateStart, dateEnd,me.showAdmin(idRoom));
        model.addAttribute("ls", ls);
        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);
        model.addAttribute("dayOff", dayOff);
        model.addAttribute("totalDay", totalDay);
        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDayRoomE);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDayRoomE);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);
        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);

        List<Statistical> lsOnTime = ms.showEmployeeWorkDayOnTime(idRoom, dateStart, dateEnd);
        List<Statistical> lsLate = ms.showEmployeeWorkDayLate(idRoom, dateStart, dateEnd);
        List<Statistical> lsOff = ms.showEmployeeWorkDayOff(idRoom, dateStart, dateEnd);
        model.addAttribute("lsOnTime", lsOnTime);
        model.addAttribute("lsLate", lsLate);
        model.addAttribute("lsOff", lsOff);

        model.addAttribute("idRoom", idRoom);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
         Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);

        return "searchStatisticalRoom";
    }

    @RequestMapping("/searchMonthYearStatisticalR")
    public String searchMonthYearStatisticalR(Model model, @RequestParam("idRoom") int idRoom, @RequestParam("dateStart") String dateStart, @RequestParam("dateEnd") String dateEnd) throws SQLException, ParseException {
        int totalDay = ms.CountAboutDay(dateStart, dateEnd);//tổng khoảng ngày 
        int totalDayRoomE = ms.TotalDayRoom(totalDay, idRoom);//tổng khoảng ngày * số nhân viên trong p
        int dayOnTime = ms.totalRoomDayOnTime(idRoom, dateStart, dateEnd);
        int dayLate = ms.totalRoomDayLate(idRoom, dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDayRoomE);
        List<Statistical> ls = ms.ListDayOnLateTimeEmployeeR(idRoom, dateStart, dateEnd, me.showAdmin(idRoom));
        model.addAttribute("ls", ls);
        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);//ngay lam muon
        model.addAttribute("dayOff", dayOff);
        model.addAttribute("totalDay", totalDay);
        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDayRoomE);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDayRoomE);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);
        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);

        List<Statistical> lsOnTime = ms.showEmployeeWorkDayOnTime(idRoom, dateStart, dateEnd);
        List<Statistical> lsLate = ms.showEmployeeWorkDayLate(idRoom, dateStart, dateEnd);
        List<Statistical> lsOff = ms.showEmployeeWorkDayOff(idRoom, dateStart, dateEnd);
        model.addAttribute("lsOnTime", lsOnTime);
        model.addAttribute("lsLate", lsLate);
        model.addAttribute("lsOff", lsOff);

        model.addAttribute("idRoom", idRoom);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
         Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "searchStatisticalRoom";
    }

    @RequestMapping("/searchStatistical")
    public String searchStatistical(Model model, @RequestParam("idRFID") String idRFID) throws SQLException, ParseException {
        Employee e = me.showIDEFormatDate(idRFID);
        model.addAttribute("e", e);
        // Tính Ngày Hiện Tại
        String monthYearNow = ms.monthNow();
        int dayNow = ms.formatDay(monthYearNow);
        String dateStart = 1 + "-" + monthYearNow;
        String dateEnd = dayNow + "-" + monthYearNow;

        // Tính Ngày Hiện Tại
        int totalDay = ms.CountAboutDay(dateStart, dateEnd);
        int dayOnTime = ms.CountDayOnTime(idRFID, dateStart, dateEnd);
        int dayLate = ms.CountDayLateMonth(idRFID, dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDay);

        //List ngay lam muon va nghi
        List<Statistical> lsDayLate=ms.showDayWorkLate(idRFID, dateStart, dateEnd);
        List<String> lsDayOff=ms.showDayWorkOff(idRFID, dateStart, dateEnd);
        model.addAttribute("lsDayLate", lsDayLate);
       model.addAttribute("lsDayOff", lsDayOff);

        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);
        model.addAttribute("dayOff", dayOff);

        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDay);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDay);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);
        System.out.println(percentDayOnTime + "_" + percentDayLate + "_" + percentDayOff);

        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "searchStatisticalE";
    }

    @RequestMapping("/searchDateStatisticalE")
    public String searchMonthYearStatisticalE(Model model, @RequestParam("idRFID") String idRFID, @RequestParam("dateStart") String dateStart, @RequestParam("dateEnd") String dateEnd) throws SQLException, ParseException {
        Employee e = me.showIDEFormatDate(idRFID);
        model.addAttribute("e", e);

        int totalDay = ms.CountAboutDay(dateStart, dateEnd);
        int dayOnTime = ms.CountDayOnTime(idRFID, dateStart, dateEnd);
        int dayLate = ms.CountDayLateMonth(idRFID, dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDay);

        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);
        model.addAttribute("dayOff", dayOff);

         List<Statistical> lsDayLate=ms.showDayWorkLate(idRFID, dateStart, dateEnd);
        List<String> lsDayOff=ms.showDayWorkOff(idRFID, dateStart, dateEnd);
        model.addAttribute("lsDayLate", lsDayLate);
       model.addAttribute("lsDayOff", lsDayOff);
        
        
        
        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDay);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDay);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);
        System.out.println(percentDayOnTime + "_" + percentDayLate + "_" + percentDayOff);

        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
         Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "searchStatisticalE";
    }

    @RequestMapping("/searchStatisticalSchool")
    public String searchStatisticalSchool(Model model, @RequestParam("dateStart") String dateStart, @RequestParam("dateEnd") String dateEnd) throws SQLException, ParseException {
        int totalDay = ms.CountAboutDay(dateStart, dateEnd);//tổng khoảng ngày 
        int totalDaySchool = ms.totalRoomSchool(totalDay);//tổng khoảng ngày * số nhân viên trong p
        int dayOnTime = ms.totalDayOnTimeSchool(dateStart, dateEnd);
        int dayLate = ms.totalDayLateSchool(dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDaySchool);

        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDaySchool);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDaySchool);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);

        //List phong co nhan vien di lam n nhat
        List<Room> lrOnTime = ms.showListRoomWorkOnTimeSchool(dateStart, dateEnd, totalDay);
        List<Room> lrLate = ms.showListRoomWorkLateSchool(dateStart, dateEnd, totalDay);
        List<Room> lrOff = ms.showListRoomWorkOffSchool(dateStart, dateEnd, totalDay);
        model.addAttribute("lrOnTime", lrOnTime);
        model.addAttribute("lrLate", lrLate);
        model.addAttribute("lrOff", lrOff);

        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);
        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);
        model.addAttribute("dayOff", dayOff);

        List<Room> lrSchool = ms.ListDayOnLateTimeRoomSchool(dateStart, dateEnd, totalDay);
        model.addAttribute("lr", lrSchool);

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
          Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "StatisticalSchool";
    }

    @RequestMapping("/StatisticalSchool")
    public String StatisticalSchool(Model model) throws SQLException, ParseException {
        // Tính Ngày Hiện Tại
        String monthYearNow = ms.monthNow();
        int dayNow = ms.formatDay(monthYearNow);
        String dateStart = 1 + "-" + monthYearNow;
        String dateEnd = dayNow + "-" + monthYearNow;

        // Tính Ngày Hiện Tại
        int totalDay = ms.CountAboutDay(dateStart, dateEnd);//tổng khoảng ngày 
        int totalDaySchool = ms.totalRoomSchool(totalDay);//tổng khoảng ngày * số nhân viên trong p
        int dayOnTime = ms.totalDayOnTimeSchool(dateStart, dateEnd);
        int dayLate = ms.totalDayLateSchool(dateStart, dateEnd);
        int dayOff = ms.CountDayOff(dayOnTime, dayLate, totalDaySchool);

        double percentDayOnTime = ms.percentDayOnTimeNow(dayOnTime, totalDaySchool);
        double percentDayLate = ms.percentDayLateNow(dayLate, totalDaySchool);
        double percentDayOff = ms.percentDayOffNow(percentDayOnTime, percentDayLate);

        //List phong co nhan vien di lam n nhat
        List<Room> lrOnTime = ms.showListRoomWorkOnTimeSchool(dateStart, dateEnd, totalDay);
        List<Room> lrLate = ms.showListRoomWorkLateSchool(dateStart, dateEnd, totalDay);
        List<Room> lrOff = ms.showListRoomWorkOffSchool(dateStart, dateEnd, totalDay);
        model.addAttribute("lrOnTime", lrOnTime);
        model.addAttribute("lrLate", lrLate);
        model.addAttribute("lrOff", lrOff);

        model.addAttribute("percentDayOn", percentDayOnTime);
        model.addAttribute("percentDayLate", percentDayLate);
        model.addAttribute("percentDayOff", percentDayOff);
        model.addAttribute("dateStart", dateStart);
        model.addAttribute("dateEnd", dateEnd);
        model.addAttribute("dayOnTime", dayOnTime);
        model.addAttribute("dayLate", dayLate);
        model.addAttribute("dayOff", dayOff);

        List<Room> lrSchool = ms.ListDayOnLateTimeRoomSchool(dateStart, dateEnd, totalDay);
        model.addAttribute("lr", lrSchool);

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
         Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "StatisticalSchool";
    }

}
