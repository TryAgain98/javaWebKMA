/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.Room;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class mRoom {

    private Connection con;

    public mRoom() {
        try {
            Connector c = new Connector();
            con = c.getDB();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public List<Room> showPhongBan() throws SQLException {
        String sql = "select * from room where loai = 'Phòng Ban'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Room> lr = new ArrayList<>();
        while (rs.next()) {
            Room r = new Room();
            r.setIdRoom(rs.getInt("idroom"));
            r.setName(rs.getString("name"));
            r.setLoai(rs.getString("loai"));
            r.setIntroduce(rs.getString("introduce"));
            lr.add(r);
        }
        return lr;
    }

    public List<Room> showKhoa() throws SQLException {
        String sql = "select * from room where loai = 'Khoa'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Room> lr = new ArrayList<>();
        while (rs.next()) {
            Room r = new Room();
            r.setIdRoom(rs.getInt("idroom"));
            r.setName(rs.getString("name"));
            r.setLoai(rs.getString("loai"));
            r.setIntroduce(rs.getString("introduce"));
            lr.add(r);
        }

        return lr;
    }

    public List<Room> showKhoa_PhongBan() throws SQLException {
        String sql = "select * from room where loai = 'Khoa'";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<Room> lr = new ArrayList<>();
        while (rs.next()) {
            Room r = new Room();
            r.setIdRoom(rs.getInt("idroom"));
            r.setName(rs.getString("name"));
            r.setLoai(rs.getString("loai"));
            r.setIntroduce(rs.getString("introduce"));
            lr.add(r);
        }
        String sql1 = "select * from room where loai = 'Phòng Ban'";
        PreparedStatement pstmt1 = con.prepareStatement(sql1);
        ResultSet rs1 = pstmt1.executeQuery();

        while (rs1.next()) {
            Room r = new Room();
            r.setIdRoom(rs1.getInt("idroom"));
            r.setName(rs1.getString("name"));
            r.setLoai(rs1.getString("loai"));
            r.setIntroduce(rs1.getString("introduce"));
            lr.add(r);
        }
        return lr;
    }

    public Room showIDPhong(int idRoom) throws SQLException {
        String sql = "select * from room where idRoom =" + idRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Room r = new Room();
        while (rs.next()) {

            r.setIdRoom(rs.getInt("idroom"));
            r.setName(rs.getString("name"));
            r.setLoai(rs.getString("loai"));
            r.setIntroduce(rs.getString("introduce"));

        }
        return r;
    }

    public void Add(Room r) throws SQLException {
        String sql = "insert into room(name,introduce,loai) values (?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, r.getName());
        pstmt.setString(2, r.getIntroduce());
        pstmt.setString(3, r.getLoai());
        pstmt.executeUpdate();
    }

    public void delete(int idRoom) throws SQLException {
        mEmployee me=new mEmployee();
        me.deleteIDRoom(idRoom);
        String sql = "delete  from room where idRoom = " + idRoom;
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.executeUpdate();
    }

    public void update(Room r) throws SQLException {
        String sql = "UPDATE room SET name=?, introduce=?, loai=? WHERE idRoom=" + r.getIdRoom();
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, r.getName());
        pstmt.setString(2, r.getIntroduce());
        pstmt.setString(3, r.getLoai());
        pstmt.executeUpdate();

    }
    

}
