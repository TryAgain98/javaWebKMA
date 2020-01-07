/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.TittleNews;
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
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class mTN {

    private Connection con;

    public mTN() {
        try {
            Connector db = new Connector();
            con = db.getDB();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void insert(TittleNews et) throws SQLException, ParseException {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);

        String sql = "insert into tittlenews(tittle,image,dateStart,trangThai,tinHot) values(?,?,?,?,?) ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, et.getTittle());
        pstmt.setString(2, et.getImage());
        pstmt.setDate(3, date);
        pstmt.setString(4, et.getTrangThai());
        pstmt.setString(5, et.getTinHot());
        pstmt.executeUpdate();

    }

    public int IDTN() throws SQLException {
        String sql = "select max(idtn) as idtn from tittlenews ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        while (rs.next()) {
            System.out.println("idTN : " + rs.getInt("idtn"));
            return rs.getInt("idTN");
        }
        return 0;
    }

    public List<TittleNews> listNews() throws SQLException {
        String sql = "SELECT * FROM tittlenews; ";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<TittleNews> ln = new ArrayList<>();
        while (rs.next()) {
            TittleNews tn = new TittleNews();
            tn.setIdTN(rs.getInt("idtn"));
            tn.setImage(rs.getString("image"));
            tn.setTrangThai(rs.getString("trangThai"));
            tn.setTinHot(rs.getString("tinhot"));
            tn.setTittle(rs.getString("tittle"));
            tn.setDateStart(rs.getString("dateStart"));
            tn.setDateUpdate(rs.getString("dateUpdate"));
            tn.setView(rs.getInt("view"));
            ln.add(tn);
        }
        return ln;
    }

    public int count() throws SQLException {
        String sql = "select count(tittle) as count from tittleNews";
        CallableStatement pstmt = con.prepareCall(sql);
        ResultSet rs = pstmt.executeQuery();
        rs.next();
        int count = rs.getInt("count") / 4;
        if (rs.getInt("count") % 4 != 0) {

            count++;
        }
        return count;
    }

    public List<TittleNews> listNews(String trangThai, String tinHot) throws SQLException {
        String sql = "SELECT *,DATE_FORMAT(dateStart, '%d-%m-%Y') as date FROM tittlenews where trangthai =? and tinhot= ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, trangThai);
        pstmt.setString(2, tinHot);
        ResultSet rs = pstmt.executeQuery();
        List<TittleNews> ln = new ArrayList<>();
        while (rs.next()) {
            TittleNews tn = new TittleNews();
            tn.setIdTN(rs.getInt("idtn"));
            tn.setImage(rs.getString("image"));
            tn.setTrangThai(rs.getString("trangThai"));
            tn.setTinHot(rs.getString("tinhot"));
            tn.setTittle(rs.getString("tittle"));
            tn.setDateStart(rs.getString("date"));
            tn.setDateUpdate(rs.getString("dateUpdate"));
            tn.setView(rs.getInt("view"));
            ln.add(tn);
        }
        return ln;
    }

    public List<TittleNews> listNews(String trangThai, int start, int limit) throws SQLException {
        String sql = "SELECT *,DATE_FORMAT(dateStart, '%d-%m-%Y') as date FROM tittlenews  where trangthai =?  LIMIT ?, ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(2, start);
        pstmt.setInt(3, limit);
        pstmt.setString(1, trangThai);

        ResultSet rs = pstmt.executeQuery();
        List<TittleNews> ln = new ArrayList<>();
        while (rs.next()) {
            TittleNews tn = new TittleNews();
            tn.setIdTN(rs.getInt("idtn"));
            tn.setImage(rs.getString("image"));
            tn.setTrangThai(rs.getString("trangThai"));
            tn.setTinHot(rs.getString("tinhot"));
            tn.setTittle(rs.getString("tittle"));
            tn.setDateStart(rs.getString("date"));
            tn.setDateUpdate(rs.getString("dateUpdate"));
            tn.setView(rs.getInt("view"));
            ln.add(tn);
        }
        return ln;
    }

    public TittleNews listNews(String trangThai, String tinHot, int start, int limit) throws SQLException {
        String sql = "SELECT *,DATE_FORMAT(dateStart, '%d-%m-%Y') as date FROM tittlenews  where trangthai =? and tinhot=?  LIMIT ?, ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setInt(3, start);
        pstmt.setInt(4, limit);
        pstmt.setString(1, trangThai);
        pstmt.setString(2, tinHot);
        ResultSet rs = pstmt.executeQuery();
        TittleNews tn = new TittleNews();
        while (rs.next()) {
           
            tn.setIdTN(rs.getInt("idtn"));
            tn.setImage(rs.getString("image"));
            tn.setTrangThai(rs.getString("trangThai"));
            tn.setTinHot(rs.getString("tinhot"));
            tn.setTittle(rs.getString("tittle"));
            tn.setDateStart(rs.getString("date"));
            tn.setDateUpdate(rs.getString("dateUpdate"));
            tn.setView(rs.getInt("view"));
          
        }
        return tn;
    }

    public TittleNews listNewsIDTN(int idTN) throws SQLException {
        String sql = "SELECT *,DATE_FORMAT(dateStart, '%d-%m-%Y') as date FROM tittlenews where idtn=" + idTN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        TittleNews tn = new TittleNews();
        while (rs.next()) {

            tn.setIdTN(rs.getInt("idtn"));
            tn.setImage(rs.getString("image"));
            tn.setTrangThai(rs.getString("trangThai"));
            tn.setTinHot(rs.getString("tinhot"));
            tn.setTittle(rs.getString("tittle"));
            tn.setDateStart(rs.getString("date"));
            tn.setDateUpdate(rs.getString("date"));
            tn.setView(rs.getInt("view"));

        }
        return tn;
    }

    public void updateTNews(TittleNews tn) throws SQLException {
        String sql = "UPDATE tittlenews SET tittle=?, image=?, trangthai=?, tinHot=? WHERE idtn=" + tn.getIdTN();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, tn.getTittle());
        pstmt.setString(2, tn.getImage());
        pstmt.setString(3, tn.getTrangThai());
        pstmt.setString(4, tn.getTinHot());
        pstmt.executeUpdate();

    }

    public void deleteTNews(int idTN) throws SQLException {
        String sql = "delete from tittlenews where idtn = " + idTN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.executeUpdate();

    }
}
