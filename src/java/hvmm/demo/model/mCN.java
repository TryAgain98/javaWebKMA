/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.model;

import hvmm.demo.DB.Connector;
import hvmm.demo.dto.ContentNews;
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
public class mCN {

    private Connection con;

    public mCN() {
        try {
            Connector c = new Connector();
            con = c.getDB();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mCN.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(mCN.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void insert(ContentNews ec) throws SQLException {
        String sql = "insert into contentnews(tittle,content,image,noteImage,idTN)values(?,?,?,?,?)";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, ec.getTittle());
        pstmt.setString(2, ec.getContent());
        pstmt.setString(3, ec.getImage());
        pstmt.setString(4, ec.getNoteImage());
        pstmt.setInt(5, ec.getIdTN());
        pstmt.executeUpdate();
    }

    public List<ContentNews> showCNews(int idTN) throws SQLException {
        String sql = "select * from contentnews where idTN= " + idTN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        List<ContentNews> lcn = new ArrayList<>();
        while (rs.next()) {
            ContentNews cn = new ContentNews();
            cn.setIdCN(rs.getInt("idCN"));
            cn.setIdTN(rs.getInt("idTN"));
            cn.setTittle(rs.getString("tittle"));
            cn.setContent(rs.getString("content"));
            cn.setImage(rs.getString("image"));
            cn.setNoteImage(rs.getString("noteImage"));
            lcn.add(cn);
        }
        return lcn;
    }

    public ContentNews showCNewsIDCN(int idCN) throws SQLException {
        String sql = "select * from contentnews where idCN= " + idCN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        ResultSet rs = pstmt.executeQuery();
        ContentNews cn = new ContentNews();
        while (rs.next()) {

            cn.setIdCN(rs.getInt("idCN"));
            cn.setIdTN(rs.getInt("idTN"));
            cn.setTittle(rs.getString("tittle"));
            cn.setContent(rs.getString("content"));
            cn.setImage(rs.getString("image"));
            cn.setNoteImage(rs.getString("noteImage"));

        }
        return cn;
    }

    public void updateCNews(ContentNews cn) throws SQLException {
        String sql = "UPDATE contentnews SET tittle=?,content=?, image=?, noteImage=? WHERE idcn=" + cn.getIdCN();

        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, cn.getTittle());
        pstmt.setString(2, cn.getContent());
        pstmt.setString(3, cn.getImage());
        pstmt.setString(4, cn.getNoteImage());
        pstmt.executeUpdate();
    }

    public void deleteCNews(int idCN) throws SQLException {
        String sql = "delete from contentnews where idcn = " + idCN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.executeUpdate();
        
        
      
        
    }
    
    public void deleteCNewsIDTN(int idTN) throws SQLException {
        String sql = "delete from contentnews where idTN = " + idTN;
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.executeUpdate();
        
    }
}
