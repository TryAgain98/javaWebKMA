/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.Employee;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class mEmployee {

    Connection con;
    Encryption ep = new Encryption();
    mStatistical ms=new mStatistical();
    public mEmployee() {
        try {
            Connector db = new Connector();
            con = db.getDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void Add(Employee e) throws SQLException, ParseException {

        SimpleDateFormat dateFormatOfStringInDB = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = dateFormatOfStringInDB.parse(e.getBirthday());
        SimpleDateFormat dateFormatYouWant = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormatYouWant.format(d1);
        String sql = "insert into employee(email,pass,fullname,phone,address,birthday,gender,positionn,powerful,csalary,image,idroom,keyAES,idRFID,idFingerprint) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, e.getEmail());
        pstmt.setString(2, e.getPass());
        pstmt.setString(3, e.getFullName());
        pstmt.setString(4, e.getPhone());
        pstmt.setString(5, e.getAddress());
        pstmt.setString(6, date);
        pstmt.setString(7, e.getGender());
        pstmt.setString(8, e.getPositionn());
        pstmt.setString(9, e.getPowerful());
        pstmt.setDouble(10, e.getcSalary());
        pstmt.setString(11, e.getImage());
        pstmt.setInt(12, e.getIdRoom());
        pstmt.setString(13, e.getKeyAES());
        pstmt.setString(14, e.getIdRFID());
        pstmt.setString(15, e.getIdFingerprint());
        pstmt.executeUpdate();
    }

    public List<Employee> show(int idRoom) throws SQLException {
        String sql = "select * from room as r join employee as e on e.idroom=r.idroom where powerful != 'admin' and r.idRoom =" + idRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Employee> le = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setIdFingerprint(rs.getString("idFingerprint"));
            e.setIdRFID(rs.getString("idRFID"));
            e.setEmail(rs.getString("email"));
            e.setPass(rs.getString("pass"));
            e.setFullName(rs.getString("fullname"));
            e.setPhone(rs.getString("phone"));
            e.setAddress(rs.getString("address"));
            e.setBirthday(rs.getString("birthday"));
            e.setGender(rs.getString("gender"));
            e.setPositionn(rs.getString("positionn"));
            e.setPowerful(rs.getString("powerful"));
            e.setName(rs.getString("name"));
            e.setcSalary(rs.getDouble("csalary"));
            e.setImage(rs.getString("image"));
            le.add(e);
        }
        return le;
    }
public List<Employee> showAdmin(int idRoom) throws SQLException {
        String sql = "select * from room as r join employee as e on e.idroom=r.idroom where r.idRoom =" + idRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Employee> le = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setIdFingerprint(rs.getString("idFingerprint"));
            e.setIdRFID(rs.getString("idRFID"));
            e.setEmail(rs.getString("email"));
            e.setPass(rs.getString("pass"));
            e.setFullName(rs.getString("fullname"));
            e.setPhone(rs.getString("phone"));
            e.setAddress(rs.getString("address"));
            e.setBirthday(rs.getString("birthday"));
            e.setGender(rs.getString("gender"));
            e.setPositionn(rs.getString("positionn"));
            e.setPowerful(rs.getString("powerful"));
            e.setName(rs.getString("name"));
            e.setcSalary(rs.getDouble("csalary"));
            e.setImage(rs.getString("image"));
            le.add(e);
        }
        return le;
    }
    public List<Employee> show() throws SQLException {
        String sql = "select *,DATE_FORMAT(birthday, '%d-%m-%Y') as date from employee as e join room as r on r.idroom=e.idroom where powerful != 'admin'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Employee> le = new ArrayList<>();
        while (rs.next()) {
            Employee e = new Employee();
            e.setIdFingerprint(rs.getString("idFingerprint"));
            e.setIdRFID(rs.getString("idRFID"));
            e.setEmail(rs.getString("email"));
            e.setPass(rs.getString("pass"));
            e.setFullName(rs.getString("fullname"));
            e.setPhone(rs.getString("phone"));
            e.setAddress(rs.getString("address"));
            e.setBirthday(rs.getString("date"));
            e.setGender(rs.getString("gender"));
            e.setPositionn(rs.getString("positionn"));
            e.setPowerful(rs.getString("powerful"));
            e.setName(rs.getString("name"));
            e.setcSalary(rs.getDouble("csalary"));
            e.setImage(rs.getString("image"));
            le.add(e);
        }
        return le;
    }

    public Employee showIDE(String idRFID, String idFingerprint) throws SQLException {
        String sql = "select *,DATE_FORMAT(birthday, '%d-%m-%Y') as date from employee as e join room as r on r.idroom=e.idroom where idRFID = ? and idFingerprint =?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);
        pstmt.setString(2, idFingerprint);
        ResultSet rs = pstmt.executeQuery();
        Employee e = new Employee();
        while (rs.next()) {

            e.setIdFingerprint(rs.getString("idFingerprint"));
            e.setIdRFID(rs.getString("idRFID"));
            e.setEmail(rs.getString("email"));

            e.setFullName(rs.getString("fullname"));
            e.setPhone(rs.getString("phone"));
            e.setAddress(rs.getString("address"));
            e.setBirthday(rs.getString("date"));
            e.setGender(rs.getString("gender"));
            e.setPositionn(rs.getString("positionn"));
            e.setPowerful(rs.getString("powerful"));
            e.setName(rs.getString("name"));
            e.setcSalary(rs.getDouble("csalary"));
            e.setImage(rs.getString("image"));

            String pass = ep.decrypt(rs.getString("pass"), rs.getString("keyAES"));
            e.setPass(pass);

        }
        return e;
    }

    public Employee showIDEFormatDate(String idRFID) throws SQLException {
        String sql = "select *,DATE_FORMAT(birthday, '%d-%m-%Y') as date from employee as e join room as r on r.idroom=e.idroom where idRFID = ? ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, idRFID);

        ResultSet rs = pstmt.executeQuery();
        Employee e = new Employee();
        while (rs.next()) {

            e.setIdFingerprint(rs.getString("idFingerprint"));
            e.setIdRFID(rs.getString("idRFID"));
            e.setEmail(rs.getString("email"));

            e.setFullName(rs.getString("fullname"));
            e.setPhone(rs.getString("phone"));
            e.setAddress(rs.getString("address"));
            e.setBirthday(rs.getString("date"));
            e.setGender(rs.getString("gender"));
            e.setPositionn(rs.getString("positionn"));
            e.setPowerful(rs.getString("powerful"));
            e.setName(rs.getString("name"));
            e.setcSalary(rs.getDouble("csalary"));
            e.setImage(rs.getString("image"));

            String pass = ep.decrypt(rs.getString("pass"), rs.getString("keyAES"));
            e.setPass(pass);

        }
        return e;
    }

    public void delete(String idRFID, String idFingerprint) {

        ms.deleteStatistical(idRFID);
        String sql = "delete from employee where idRFID = ? and idFingerprint =?";

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, idRFID);
            pstmt.setString(2, idFingerprint);
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void deleteIDRoom(int idRoom) throws SQLException {

        ms.deleteStatisticalIDRoom(idRoom);
        String sql = "delete from employee where idRoom = "+idRoom;

        try {
            PreparedStatement pstmt = con.prepareStatement(sql);
           
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void update(Employee e) throws SQLException, ParseException {
        
        
        
        SimpleDateFormat dateFormatOfStringInDB = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = dateFormatOfStringInDB.parse(e.getBirthday());
        SimpleDateFormat dateFormatYouWant = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormatYouWant.format(d1);
        String sql = "UPDATE employee SET email=?, pass=?, fullname=?,phone=?,address=?,birthday=?,gender=?,positionn=?,powerful=?,csalary=?,image=?,idroom=?,keyAES=? where idrfid=?  and idfingerprint =?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, e.getEmail());
        pstmt.setString(2, e.getPass());
        pstmt.setString(3, e.getFullName());
        pstmt.setString(4, e.getPhone());
        pstmt.setString(5, e.getAddress());
        pstmt.setString(6, date);
        pstmt.setString(7, e.getGender());
        pstmt.setString(8, e.getPositionn());
        pstmt.setString(9, e.getPowerful());
        pstmt.setDouble(10, e.getcSalary());
        pstmt.setString(11, e.getImage());
        pstmt.setInt(12, e.getIdRoom());
        pstmt.setString(13, e.getKeyAES());
       
        pstmt.setString(14, e.getIdRFID());
        pstmt.setString(15, e.getIdFingerprint());
     
        pstmt.executeUpdate();

    }

    public void updateAdmin(Employee e) throws SQLException, ParseException {
        SimpleDateFormat dateFormatOfStringInDB = new SimpleDateFormat("dd-MM-yyyy");
        Date d1 = dateFormatOfStringInDB.parse(e.getBirthday());
        SimpleDateFormat dateFormatYouWant = new SimpleDateFormat("yyyy-MM-dd");
        String date = dateFormatYouWant.format(d1);
        String sql = "UPDATE employee SET email=?, pass=?, fullname=?,phone=?,address=?,birthday=?,gender=?,positionn=?,csalary=?,image=?,idroom=?,keyAES=?,idrfid=?,idfingerprint =? WHERE idrfid=? and idfingerprint =?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, e.getEmail());
        pstmt.setString(2, e.getPass());
        pstmt.setString(3, e.getFullName());
        pstmt.setString(4, e.getPhone());
        pstmt.setString(5, e.getAddress());
        pstmt.setString(6, date);
        pstmt.setString(7, e.getGender());
        pstmt.setString(8, e.getPositionn());
        pstmt.setDouble(9, e.getcSalary());
        pstmt.setString(10, e.getImage());
        pstmt.setInt(11, e.getIdRoom());
        pstmt.setString(12, e.getKeyAES());
        pstmt.setString(13, e.getIdRFID());
        pstmt.setString(14, e.getIdFingerprint());
        pstmt.setString(15, e.getIdRFID());
        pstmt.setString(16, e.getIdFingerprint());
        pstmt.executeUpdate();

    }

    public Employee login(Employee e1) throws SQLException {
        String sql = "select * from employee where email = '" + e1.getEmail() + "'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        String passDecrypt = "";

        while (rs.next()) {

            String keyAES = rs.getString("keyAES");
            String pass = rs.getString("pass");
            System.out.println("keyaes " + keyAES);
            if (keyAES == null) {
                if (pass.equals(e1.getPass())) {
                    Employee e = new Employee();
                    e.setIdRFID(rs.getString("idRFID"));
                    e.setIdFingerprint(rs.getString("idFingerprint"));
                    e.setEmail(rs.getString("email"));
                    e.setFullName(rs.getString("fullname"));
                    e.setPhone(rs.getString("phone"));
                    e.setAddress(rs.getString("address"));
                    e.setBirthday(rs.getString("birthday"));
                    e.setGender(rs.getString("gender"));
                    e.setPositionn(rs.getString("positionn"));
                    e.setPowerful(rs.getString("powerful"));
                    e.setName(rs.getString("fullname"));
                    e.setcSalary(rs.getDouble("csalary"));
                    e.setImage(rs.getString("image"));
                    e.setPass(passDecrypt);
                    return e;

                }
                return null;
            }
            passDecrypt = ep.decrypt(pass, keyAES);
            System.out.println("pass " + passDecrypt);
            if (passDecrypt.equals(e1.getPass())) {
                Employee e = new Employee();

                e.setIdRFID(rs.getString("idRFID"));
                e.setIdFingerprint(rs.getString("idFingerprint"));

                e.setEmail(rs.getString("email"));
                e.setFullName(rs.getString("fullname"));
                e.setPhone(rs.getString("phone"));
                e.setAddress(rs.getString("address"));
                e.setBirthday(rs.getString("birthday"));
                e.setGender(rs.getString("gender"));
                e.setPositionn(rs.getString("positionn"));
                e.setPowerful(rs.getString("powerful"));
                e.setName(rs.getString("fullname"));
                e.setcSalary(rs.getDouble("csalary"));
                e.setImage(rs.getString("image"));

                e.setPass(passDecrypt);

                return e;

            }
        }

        return null;

    }

    public boolean checkEmail(String email) throws SQLException {
        String sql = "select * from employee where email = '" + email+"'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while(rs.next()){
            return true;
        }
        return false;

    }
}
