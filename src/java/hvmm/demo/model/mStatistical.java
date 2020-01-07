/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.Employee;
import hvmm.demo.dto.Room;
import hvmm.demo.dto.Statistical;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class mStatistical {

    mRoom mr = new mRoom();

    Connection con;
//Tháng Hiện Tại trừ 1
    java.util.Date date = new java.util.Date();

    public String monthNow() {
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MM");
        String nowMonth = dateFormatMonth.format(date);
        int monthInt = 0;
        SimpleDateFormat dateFormatYear = new SimpleDateFormat("yyyy");
        String nowYear = dateFormatYear.format(date);
        int yearInt = Integer.parseInt(nowYear);
        System.out.println("month : " + nowMonth);
        if (nowMonth.equals("01")) {
            monthInt = 12;
            yearInt = yearInt - 1;
        } else {
            monthInt = Integer.parseInt(nowMonth) - 1;
        }

        return String.valueOf(monthInt) + "-" + yearInt;

    }

    public String D_M_YFormatY_M_D(String date) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("dd-MM-yyyy");
        Date dateString = formatDate.parse(date);
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("yyyy-MM-dd");
        String nowMonth = dateFormatMonth.format(dateString);
        return nowMonth;
    }

    public String Y_M_DFormatD_M_Y(String date) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        Date dateString = formatDate.parse(date);
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("dd-MM-yyyy");
        String nowMonth = dateFormatMonth.format(dateString);
        return nowMonth;
    }

    public int CountAboutDay(String dateStart, String dateEnd) {
        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date currentDate = new Date();
        Date date1 = null;
        Date date2 = null;
        long getDaysDiff = 0;
        try {

            date1 = simpleDateFormat.parse(dateStart);
            date2 = simpleDateFormat.parse(dateEnd);

            long getDiff = date2.getTime() - date1.getTime();

            getDaysDiff = getDiff / (24 * 60 * 60 * 1000);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return (int) getDaysDiff + 1;
    }

    public int formatMonth(String monthYear) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM");
        Date dateString = formatDate.parse(monthYear);
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("MM");
        String nowMonth = dateFormatMonth.format(dateString);
        System.out.println(nowMonth);

        return Integer.parseInt(nowMonth);

    }

    public int formatYear(String monthYear) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM");
        Date dateString = formatDate.parse(monthYear);
        SimpleDateFormat dateFormatMonth = new SimpleDateFormat("yyyy");
        String nowMonth = dateFormatMonth.format(dateString);
        System.out.println(nowMonth);

        return Integer.parseInt(nowMonth);

    }

    public int yearNow() {
        SimpleDateFormat dateFormatYear = new SimpleDateFormat("yyyy");
        String nowYear = dateFormatYear.format(date);
        int year = Integer.parseInt(nowYear);
        return year;

    }

    public mStatistical() {
        Connector db = new Connector();
        try {
            con = db.getDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mStatistical.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mStatistical.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public String[] monthYear(String my) {
        int month = 0;
        String[] words = my.split("-");

        return words;
    }

    public int formatDay(String monthYear) throws ParseException {
        SimpleDateFormat formatDate = new SimpleDateFormat("MM-yyyy");
        Date d = formatDate.parse(monthYear);
        SimpleDateFormat formatMonth = new SimpleDateFormat("MM");
        SimpleDateFormat formatYear = new SimpleDateFormat("yyyy");
        int month = Integer.parseInt(formatMonth.format(d));
        int year = Integer.parseInt(formatYear.format(d));;
        int day = 0;
        switch (month) {
            // các tháng 1, 3, 5, 7, 8, 10 và 12 có 31 ngày.
            case 1:
                day = 31;
                break;
            case 3:
                day = 31;
                break;
            case 5:
                day = 31;
                break;
            case 7:
                day = 31;
                break;
            case 8:
                day = 31;
                break;
            case 10:
                day = 31;
                break;
            case 12:
                day = 31;
                break;

            // các tháng 4, 6, 9 và 11 có 30 ngày
            case 4:
                day = 30;
                break;
            case 6:
                day = 30;
                break;
            case 9:
                day = 30;
                break;
            case 11:
                day = 30;
                break;

            // Riêng tháng 2 nếu là năm nhuận thì có 29 ngày, còn không thì có 28 ngày.
            case 2:
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    day = 29;
                    break;
                } else {
                    day = 28;
                    break;
                }

        }
        return day;
    }

    public int CountDayOnTime(String idRFID, String dateStart, String dateEnd) throws SQLException, ParseException {

        String sql = "select count(idRFID) as count from statistical where idRFID =? and  datework >= ?  and datework <= ? and checkdate=''";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }

    public int CountDayLateMonth(String idRFID, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select count(idRFID) as count from statistical where idRFID =? and  datework >= ?  and datework <= ? and checkdate='1'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }

    public int CountDayOff(int dateOnTime, int lateDay, int totalDay) {

        return totalDay - dateOnTime - lateDay;
    }

    // List ngay di lam muon
    public List<Statistical> showDayWorkLate(String idRFID, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select * ,DATE_FORMAT(datework, '%d-%m-%Y') as date from statistical where idRFID =? and  datework >= ?  and datework <= ?  and checkDate='1'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        List<Statistical> ls = new ArrayList<Statistical>();
        while (rs.next()) {
            Statistical s = new Statistical();
            s.setDatework(rs.getString("date"));
            s.setTimeWork(rs.getString("timeWork"));
            ls.add(s);

        }
        return ls;
    }

    //List Ngay trong khoang date
    public List<LocalDate> ListDayAbout(String dateStart, String dateEnd) throws ParseException {
        LocalDate start = LocalDate.parse(D_M_YFormatY_M_D(dateStart));
        LocalDate end = LocalDate.parse(this.D_M_YFormatY_M_D(dateEnd));
        List<LocalDate> totalDates = new ArrayList<>();
        while (!start.isAfter(end)) {
            totalDates.add(start);
            start = start.plusDays(1);
        }
        return totalDates;
    }

    //list ngay lam
    public List<Statistical> showDayWork(String idRFID, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select * ,DATE_FORMAT(datework, '%d-%m-%Y') as date from statistical  where idRFID =?  and datework >= ?  and datework <= ?  ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        List<Statistical> ls = new ArrayList<>();
        while (rs.next()) {
            Statistical s = new Statistical();
            s.setIdRFID(rs.getString("idrfid"));
            s.setDatework(rs.getString("date"));
            s.setTimeWork(rs.getString("timework"));
            ls.add(s);
        }
        return ls;
    }
    // List ngay Nghi

    public List<String> showDayWorkOff(String idRFID, String dateStart, String dateEnd) throws SQLException, ParseException {
        List<LocalDate> totalDates = ListDayAbout(dateStart, dateEnd);
        List<Statistical> ls = showDayWork(idRFID, dateStart, dateEnd);
        List<String> lDayOff = new ArrayList<>();
        for (LocalDate ld : totalDates) {
            int check = 0;
            for (Statistical s : ls) {
//                  System.out.println("s.date = "+s.getDatework()+"\t date = "+ld);
                if (Y_M_DFormatD_M_Y(String.valueOf(ld)).equals(s.getDatework())) {
                    System.out.println("s.date = " + s.getDatework() + "\t date = " + ld);
                    check = 1;

                }
            }
            if (check == 0) {
                lDayOff.add(Y_M_DFormatD_M_Y(String.valueOf(ld)));
            }
        }

        return lDayOff;
    }

// Tính Phần Trăm 
    public double percentDayOnTimeNow(int dayOnTime, int totalDay) {

        double precentDay = 0;
        if (totalDay != 0) {

            precentDay = ((double) dayOnTime / (double) totalDay) * 100;

        }

        return (double) Math.round(precentDay * 10) / 10;
    }

    public double percentDayLateNow(int dayLate, int totalDay) {

        double precentDay = 0;
        if (totalDay != 0) {

            precentDay = ((double) dayLate / (double) totalDay) * 100;

        }

        return (double) Math.round(precentDay * 10) / 10;
    }

    public double percentDayOffNow(double percentDO, double percentLate) {

        return (double) Math.round((100 - percentDO - percentLate) * 10) / 10;
    }

    // List nhân viên trong 1 phòng
    public List<String> listIdRFID(int IdRoom) throws SQLException {
        String sql = "select * from employee where idRoom=" + IdRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<String> ls = new ArrayList<>();
        while (rs.next()) {
            String idRFID = rs.getString("idRFID");
            ls.add(idRFID);
        }
        return ls;
    }

    // list Nhân viên đúng h ,late,off theo idroom và list idrfid
    public List<Statistical> ListDayOnLateTimeEmployeeR(int idRoom, String dateStart, String dateEnd, List<Employee> lIdRFID) throws SQLException, ParseException {
        int totalDay = CountAboutDay(dateStart, dateEnd);
        List<Statistical> ls = new ArrayList<>();
        for (Employee e: lIdRFID) {
            String sql = "select  *,e.idRFID as id,count(s.idRFID) as count from employee as e join statistical  as s on s.idRFID = e.idRFiD where idroom=? and checkDate='' and s.idRfid=? and  datework >= ?  and datework <= ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setInt(1, idRoom);
            pstmt.setString(2, e.getIdRFID());
            pstmt.setString(3, D_M_YFormatY_M_D(dateStart));
            pstmt.setString(4, D_M_YFormatY_M_D(dateEnd));
            ResultSet rs = pstmt.executeQuery();
            Statistical s = new Statistical();
            rs.next();
            int dateOntime = rs.getInt("count");
            s.setIdRFID(e.getIdRFID());
            s.setFullName(e.getFullName());
            s.setCountDayOnTime(rs.getInt("count"));

            String sqlDayLate = "select  *,e.idRFID as id,count(s.idRFID) as count from employee as e join statistical  as s on s.idRFID = e.idRFiD where idroom=? and checkDate='1' and s.idRfid=? and datework >= ?  and datework <= ?";
            PreparedStatement pstmtLate = con.prepareStatement(sqlDayLate);
            pstmtLate.setInt(1, idRoom);
            pstmtLate.setString(2, e.getIdRFID());
            pstmtLate.setString(3, D_M_YFormatY_M_D(dateStart));
            pstmtLate.setString(4, D_M_YFormatY_M_D(dateEnd));
            ResultSet rsLate = pstmtLate.executeQuery();
            rsLate.next();
            int dayLate = rsLate.getInt("count");
            s.setCountDayLate(rsLate.getInt("count"));
            s.setCountDayOff(totalDay - dateOntime - dayLate);

            ls.add(s);

        }
        return ls;
    }

    // Tổng ngày làm đúng h theo phòng
    public int totalRoomDayOnTime(int idRoom, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select count(s.idrfid) as count from statistical as s join employee as e on e.idRFID=s.idRFID where idroom=? and checkdate='' and  datework >= ?  and datework <= ? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, idRoom);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }
// Tổng ngày làm muộn theo phòng

    public int totalRoomDayLate(int idRoom, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select count(s.idrfid) as count from statistical as s join employee as e on e.idRFID=s.idRFID where idroom=? and checkdate='1' and  datework >= ?  and datework <= ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, idRoom);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return rs.getInt("count");
    }
//    Tổng Ngày Tương úng với số nhân viên trong phòng

    public int TotalDayRoom(int TotalDate, int idRoom) throws SQLException {
        String sql = "select count(idrfid) as count from employee where idRoom=" + idRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        return TotalDate * rs.getInt("count");
    }

    // List nhân viên làm đúng h nhất
    public List<Statistical> showEmployeeWorkDayOnTime(int idRoom, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select fullname,e.idrfid as id, count(e.idrfid) as count from statistical as s join employee as e on e.idrfid=s.idrfid  where idRoom=? and checkDate='' and datework >= ?  and datework <= ? group by(s.idrfid)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, idRoom);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        List<Statistical> ls = new ArrayList<>();
        while (rs.next()) {
            Statistical s = new Statistical();
            s.setIdRFID(rs.getString("id"));
            s.setFullName(rs.getString("fullname"));
            s.setCountDayOnTime(rs.getInt("count"));
            ls.add(s);

        }
        int max = 0;
        for (Statistical s : ls) {
            if (s.getCountDayOnTime() > max) {
                max = s.getCountDayOnTime();
            }
        }
        List<Statistical> ls1 = new ArrayList<>();
        for (Statistical s : ls) {
            if (max == s.getCountDayOnTime()) {
                ls1.add(s);
            }
        }
        return ls1;

    }
// List nhân viên làm muộn n  nhất

    public List<Statistical> showEmployeeWorkDayLate(int idRoom, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select fullname,e.idrfid as id, count(e.idrfid) as count from statistical as s join employee as e on e.idrfid=s.idrfid  where idRoom=? and checkDate='1' and datework >= ?  and datework <= ? group by(s.idrfid)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, idRoom);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        List<Statistical> ls = new ArrayList<>();
        while (rs.next()) {
            Statistical s = new Statistical();
            s.setIdRFID(rs.getString("id"));
            s.setFullName(rs.getString("fullname"));
            s.setCountDayOnTime(rs.getInt("count"));
            ls.add(s);

        }
        int max = 0;
        for (Statistical s : ls) {
            if (s.getCountDayOnTime() > max) {
                max = s.getCountDayOnTime();
            }
        }
        List<Statistical> ls1 = new ArrayList<>();
        for (Statistical s : ls) {
            if (max == s.getCountDayOnTime()) {
                ls1.add(s);
            }
        }
        return ls1;

    }
// List nhân viên nghỉ nn

    public List<Statistical> showEmployeeWorkDayOff(int idRoom, String dateStart, String dateEnd) throws SQLException, ParseException {
        String sql = "select fullname,e.idrfid as id, count(e.idrfid) as count from statistical as s join employee as e on e.idrfid=s.idrfid  where idRoom=? and datework >= ?  and datework <= ? group by(s.idrfid)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(1, idRoom);
        pstmt.setString(2, D_M_YFormatY_M_D(dateStart));
        pstmt.setString(3, D_M_YFormatY_M_D(dateEnd));
        ResultSet rs = pstmt.executeQuery();
        List<Statistical> ls = new ArrayList<>();
        while (rs.next()) {
            Statistical s = new Statistical();
            s.setIdRFID(rs.getString("id"));
            s.setFullName(rs.getString("fullname"));
            s.setCountDayOnTime(CountAboutDay(dateStart, dateEnd) - rs.getInt("count"));
            ls.add(s);

        }
        int max = 0;
        for (Statistical s : ls) {
            if (s.getCountDayOnTime() > max) {
                max = s.getCountDayOnTime();
            }
        }

        List<Statistical> ls1 = new ArrayList<>();
        for (Statistical s : ls) {
            if (max == s.getCountDayOnTime()) {
                ls1.add(s);
            }
        }

        return ls1;

    }

// Đếm số ngày đi làm theo khoảng thời gian của toàn trg
    public int totalDayOnTimeSchool(String dateStart, String dayEnd) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        int count = 0;
        for (Room r : lr) {
            count += totalRoomDayOnTime(r.getIdRoom(), dateStart, dayEnd);
        }

        return count;
    }

    public int totalDayLateSchool(String dateStart, String dayEnd) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        int count = 0;
        for (Room r : lr) {
            count += totalRoomDayLate(r.getIdRoom(), dateStart, dayEnd);
        }

        return count;
    }

    // Tổng số p trong trường
    public int totalRoomSchool(int totalDay) throws SQLException {
        List<Room> lr = mr.showKhoa_PhongBan();
        int countE = 0;
        for (Room r : lr) {
            String sql = "select count(idrfid) as count from employee where idRoom=" + r.getIdRoom();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            countE += rs.getInt("count");

        }

        return totalDay * countE;
    }

    // List số ngày đi làm theo các phòng
    public List<Room> ListDayOnLateTimeRoomSchool(String dateStart, String dateEnd, int totalDay) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        List<Room> lrSchool = new ArrayList<>();
        for (Room r : lr) {
            String sql = "select * from room where idroom = " + r.getIdRoom();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Room rSchool = new Room();
            rSchool.setName(rs.getString("name"));
            rSchool.setIdRoom(rs.getInt("idroom"));
            int totalDayRoom = TotalDayRoom(totalDay, r.getIdRoom());
            int countOnTime = totalRoomDayOnTime(r.getIdRoom(), dateStart, dateEnd);
            int countLate = totalRoomDayLate(r.getIdRoom(), dateStart, dateEnd);
            int totalDayOff = totalDayRoom - countOnTime - countLate;
            rSchool.setPercentWorkOnTime(percentDayOnTimeNow(countOnTime, totalDayRoom));
            rSchool.setPercentWorkLate(percentDayLateNow(countLate, totalDayRoom));
            rSchool.setPercentWorkOff(percentDayOffNow(rSchool.getPercentWorkOnTime(), rSchool.getPercentWorkLate()));

            lrSchool.add(rSchool);
        }
        return lrSchool;

    }

    // List room co so nhan vien di lam dung h n nhat
    public List<Room> showListRoomWorkOnTimeSchool(String dateStart, String dateEnd, int totalDay) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        double max = 0;
        List<Room> lrOnTime = new ArrayList<>();
        for (Room r : lr) {
            String sql = "select * from room where idroom = " + r.getIdRoom();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Room rSchool = new Room();
            rSchool.setName(rs.getString("name"));
            int totalDayRoom = TotalDayRoom(totalDay, r.getIdRoom());
            int countOnTime = totalRoomDayOnTime(r.getIdRoom(), dateStart, dateEnd);
            rSchool.setPercentWorkOnTime(percentDayOnTimeNow(countOnTime, totalDayRoom));
            if (rSchool.getPercentWorkOnTime() > max) {
                max = rSchool.getPercentWorkOnTime();
            }
        }
        for (Room r : ListDayOnLateTimeRoomSchool(dateStart, dateEnd, totalDay)) {
            if (r.getPercentWorkOnTime() == max) {
                lrOnTime.add(r);
            }
        }
        return lrOnTime;

    }

    // List room co so nhan vien di lam Muon n nhat
    public List<Room> showListRoomWorkLateSchool(String dateStart, String dateEnd, int totalDay) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        double max = 0;
        List<Room> lrLate = new ArrayList<>();
        for (Room r : lr) {
            String sql = "select * from room where idroom = " + r.getIdRoom();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Room rSchool = new Room();
            rSchool.setName(rs.getString("name"));
            int totalDayRoom = TotalDayRoom(totalDay, r.getIdRoom());
            int countLate = totalRoomDayLate(r.getIdRoom(), dateStart, dateEnd);
            rSchool.setPercentWorkLate(percentDayLateNow(countLate, totalDayRoom));
            if (rSchool.getPercentWorkLate() > max) {
                max = rSchool.getPercentWorkLate();
            }
        }
        for (Room r : ListDayOnLateTimeRoomSchool(dateStart, dateEnd, totalDay)) {
            if (r.getPercentWorkLate() == max) {
                lrLate.add(r);
            }
        }
        return lrLate;

    }

    // List room co so nhan vien nghi n nhat
    public List<Room> showListRoomWorkOffSchool(String dateStart, String dateEnd, int totalDay) throws SQLException, ParseException {
        List<Room> lr = mr.showKhoa_PhongBan();
        double max = 0;
        List<Room> lrOff = new ArrayList<>();
        for (Room r : lr) {
            String sql = "select * from room where idroom = " + r.getIdRoom();
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            rs.next();

            Room rSchool = new Room();
            rSchool.setName(rs.getString("name"));
            int totalDayRoom = TotalDayRoom(totalDay, r.getIdRoom());
            int countOnTime = totalRoomDayOnTime(r.getIdRoom(), dateStart, dateEnd);
            int countLate = totalRoomDayLate(r.getIdRoom(), dateStart, dateEnd);
            int totalDayOff = totalDayRoom - countOnTime - countLate;
            rSchool.setPercentWorkOnTime(percentDayOnTimeNow(countOnTime, totalDayRoom));
            rSchool.setPercentWorkLate(percentDayLateNow(countLate, totalDayRoom));
            rSchool.setPercentWorkOff(percentDayOffNow(rSchool.getPercentWorkOnTime(), rSchool.getPercentWorkLate()));

            if (rSchool.getPercentWorkOff() > max) {
                max = rSchool.getPercentWorkOff();
            }
        }
        for (Room r : ListDayOnLateTimeRoomSchool(dateStart, dateEnd, totalDay)) {
            if (r.getPercentWorkOff() == max) {
                lrOff.add(r);
            }
        }
        return lrOff;

    }

    public void deleteStatistical(String idRFID) {

        String sql = "delete from statistical where idRFID = ? ";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, idRFID);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void deleteStatisticalIDRoom(int IDRoom) throws SQLException {

        mEmployee me=new mEmployee();
        for(Employee e:me.show(IDRoom)){
        String sql = "delete from statistical where idRFID = ? ";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, e.getIdRFID());
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }}
        
    }
}
