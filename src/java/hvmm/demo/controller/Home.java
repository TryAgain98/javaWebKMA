/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.ContentNews;
import hvmm.demo.dto.TittleNews;
import hvmm.demo.model.mCN;
import hvmm.demo.model.mTN;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Huy Toan
 */
@Controller
public class Home {
    
    mTN mtn = new mTN();
    mCN mcn = new mCN();
    
   
    
    @RequestMapping("/addNews")
    public String AddEventTittle(Model model) throws SQLException, ParseException {
        TittleNews tn = new TittleNews();
        model.addAttribute("tn", tn);
        
        return "AddNews";
    }
    
    @RequestMapping("/saveAddNews")
    public String saveAddNews(Model model, @RequestParam("trangThai") String trangThai, @RequestParam("tinHot") String tinHot, @ModelAttribute("tn") TittleNews tn) throws SQLException, ParseException {
        tn.setTinHot(tinHot);
        tn.setTrangThai(trangThai);
        mTN mtn = new mTN();
        mtn.insert(tn);
        int idTN = mtn.IDTN();
        model.addAttribute("idTN", idTN);
        model.addAttribute("informNews", "Thêm Thành công");
        return "AddContentNews";
    }
    
    @RequestMapping("/fixNews")
    public String fixNews(Model model) throws SQLException, ParseException {
        List<TittleNews> ln = mtn.listNews();
        model.addAttribute("ln", ln);
        return "FixNews";
    }
    
    @RequestMapping("/updateTittleNews")
    public String updateTittleNews(Model model, @RequestParam("id") int inTN) throws SQLException, ParseException {
        TittleNews tn = mtn.listNewsIDTN(inTN);
        
        model.addAttribute("tn", tn);
        return "updateTNews";
    }
    
    @RequestMapping("/saveUpdateTNews")
    public String saveUpdateTNews(Model model, @RequestParam("imageNow") String image, @ModelAttribute("tn") TittleNews tn) throws SQLException, ParseException {
        if (tn.getImage().equals("")) {
            tn.setImage(image);
        }
        System.out.println("1" + image);
        System.out.println(tn);
        mtn.updateTNews(tn);
        model.addAttribute("inform", "Cập Nhật Thành Công"); 
        List<TittleNews> ln = mtn.listNews();
        model.addAttribute("ln", ln);
        return "FixNews";
        
    }

    @RequestMapping("/contentNews")
    public String contentNews(Model model, @RequestParam("id") int idTN) throws SQLException, ParseException {
        List<ContentNews> lcn = mcn.showCNews(idTN);
        model.addAttribute("lcn", lcn);
        model.addAttribute("idTN", idTN);
        return "ContentNews";
    }

    @RequestMapping("/updateCNews")
    public String updateCNews(Model model, @RequestParam("id") int idCN) throws SQLException {
        ContentNews cn = mcn.showCNewsIDCN(idCN);
        model.addAttribute("cn", cn);
        
        return "updateCNews";
    }
    
    @RequestMapping("/saveUpdateCNews")
    public String saveUpdateTNews(Model model, @RequestParam("imageNow") String image, @RequestParam("content") String content, @ModelAttribute("cn") ContentNews cn) throws SQLException, ParseException {
        if (cn.getImage().equals("")) {
            cn.setImage(image);
        }
        cn.setContent(content);
        mcn.updateCNews(cn);
         model.addAttribute("inform", "Cập Nhật Thành Công"); 
        cn = mcn.showCNewsIDCN(cn.getIdCN());
        model.addAttribute("idTN", cn.getIdTN());
        List<ContentNews> lcn = mcn.showCNews(cn.getIdTN());
        model.addAttribute("lcn", lcn);
        return "ContentNews";
        
    }
    
    @RequestMapping("/deleteCNews")
    public String deleteCNews(Model model, @RequestParam("id") int idCN) throws SQLException {
        
       
        ContentNews cn = mcn.showCNewsIDCN(idCN);
         mcn.deleteCNews(idCN);
         model.addAttribute("idTN", cn.getIdTN());
        List<ContentNews> lcn = mcn.showCNews(cn.getIdTN());
        model.addAttribute("lcn", lcn);
        model.addAttribute("inform", "Xóa Thành Công");
        return "ContentNews";
    }
    
    @RequestMapping("/addCNewsID")
    public String saveAddNews(Model model, @RequestParam("id") int idTN) throws SQLException, ParseException {
        model.addAttribute("idTN", idTN);
       model.addAttribute("updateAddContent", "update");
        return "AddContentNews";
    }

    @RequestMapping("/deleteTittleNews")
    public String deleteTittleNews(Model model, @RequestParam("id") int idTN) throws SQLException {
        mcn.deleteCNewsIDTN(idTN);
        mtn.deleteTNews(idTN);
        List<TittleNews> ln = mtn.listNews();
        model.addAttribute("ln", ln);
        model.addAttribute("inform", "Xóa Thành Công");
        return "FixNews";
    }
    
}
