/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.Contact;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Huy Toan
 */
public class mContact {

    Connection con;

    public mContact() {
        try {
            Connector db = new Connector();
            con = db.getDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mEmployee.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Contact showContact() throws SQLException {
        String sql = "select * from contact";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Contact c = new Contact();
        while (rs.next()) {

            c.setIdContact(rs.getInt("idContact"));
            c.setAddress(rs.getString("address"));
            c.setEmail(rs.getString("email"));
            c.setImage(rs.getString("image"));
            c.setManager(rs.getString("manager"));
            c.setNameSchool(rs.getString("nameSchool"));
            c.setPhone(rs.getString("phone"));
        }
        return c;
    }

    public void updateContact(Contact c) throws SQLException {
        String sql = "UPDATE contact SET nameSchool=?, manager=? ,address=?, email=?, phone=?, image=?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, c.getNameSchool());
        pstmt.setString(2, c.getManager());
        pstmt.setString(3, c.getAddress());
        pstmt.setString(4, c.getEmail());
        pstmt.setString(5, c.getPhone());
        pstmt.setString(6, c.getImage());
        pstmt.executeUpdate();

    }
}
