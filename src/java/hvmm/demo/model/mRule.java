/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.Rule;
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
public class mRule {

    Connection con;

    public mRule() {
        try {
            Connector db = new Connector();
            con = db.getDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mRule.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mRule.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Rule showRule() throws SQLException {
        String sql = "select * from rule";
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        Rule r = new Rule();
        while (rs.next()) {
            r.setIdRule(rs.getInt("idRule"));
            r.setTimeStart(rs.getString("timeStart"));
            r.setTimeEnd(rs.getString("timeEnd"));
            r.setCostume(rs.getString("costume"));
            r.setObject(rs.getString("object"));
            r.setProhibit(rs.getString("prohibit"));
            r.setIntroduce(rs.getString("introduce"));
        }
        return r;
    }

    public void updateRule(Rule r) throws SQLException {
        String sql = "UPDATE rule SET introduce=?,timeStart=?,timeEnd=?,costume=?,prohibit=?,object=? ";

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, r.getIntroduce());
        pstmt.setString(2, r.getTimeStart());
        pstmt.setString(3, r.getTimeEnd());
        pstmt.setString(4, r.getCostume());
        pstmt.setString(5, r.getProhibit());
        pstmt.setString(6, r.getObject());
        pstmt.executeUpdate();

    }

    public String timeStart() {
        try {
            String sql = "select * from rule";
            PreparedStatement pstmt = con.prepareStatement(sql);
            ResultSet rs = pstmt.executeQuery();
            Rule r = new Rule();
            rs.next();

            return rs.getString("timeStart");
        } catch (SQLException ex) {
            Logger.getLogger(mRule.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "";
    }
}
