/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Contact;
import hvmm.demo.dto.ContentNews;
import hvmm.demo.dto.Employee;
import hvmm.demo.dto.Room;
import hvmm.demo.dto.Rule;
import hvmm.demo.dto.TittleNews;
import hvmm.demo.model.Encryption;
import hvmm.demo.model.mCN;
import hvmm.demo.model.mContact;
import hvmm.demo.model.mEmployee;
import hvmm.demo.model.mRoom;
import hvmm.demo.model.mRule;
import hvmm.demo.model.mTN;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.List;
import javax.servlet.http.HttpSession;
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
public class HomePageController {

    mEmployee me = new mEmployee();
    mRoom mr = new mRoom();
    Encryption ec = new Encryption();
    mTN mtn = new mTN();
    mCN mcn = new mCN();
    mRule mRule = new mRule();
    mContact mc = new mContact();

    @RequestMapping("/HomePage")
    public String HomePage(Model model) throws SQLException {

        List<TittleNews> ltn = mtn.listNews("Hiển Thị", 0, 4);
        TittleNews tOne = mtn.listNews("Hiển thị", "Có", 0, 1);
        TittleNews tTwo = mtn.listNews("Hiển thị", "Có", 1, 1);
        TittleNews tThree = mtn.listNews("Hiển thị", "Có", 2, 1);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("tOne", tOne);
        model.addAttribute("tTwo", tTwo);
        model.addAttribute("tThree", tThree);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        model.addAttribute("ltn", ltn);
        model.addAttribute("count", mtn.count());
        model.addAttribute("id", 1);
        Rule r = mRule.showRule();
        model.addAttribute("rule", r);
        return "HomePage";
    }

    @RequestMapping("/HomePageNews")
    public String HomePageNews(Model model, @RequestParam("id") int idTN) throws SQLException {
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        List<TittleNews> ltn = mtn.listNews("Hiển Thị", idTN * 4 - 4, 4);
        TittleNews tOne = mtn.listNews("Hiển thị", "Có", 0, 1);
        TittleNews tTwo = mtn.listNews("Hiển thị", "Có", 1, 1);
        TittleNews tThree = mtn.listNews("Hiển thị", "Có", 2, 1);
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("tOne", tOne);
        model.addAttribute("tTwo", tTwo);
        model.addAttribute("tThree", tThree);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        model.addAttribute("ltn", ltn);
        model.addAttribute("count", mtn.count());
        model.addAttribute("id", idTN);
        Rule r = mRule.showRule();
        model.addAttribute("rule", r);
        return "HomePage";
    }

    @RequestMapping("/increasePage")
    public String increasePage(Model model, @RequestParam("id") int idTN) throws SQLException {
        if (idTN != mtn.count()) {
            idTN++;
        }
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        List<TittleNews> ltn = mtn.listNews("Hiển Thị", idTN * 4 - 4, 4);
        TittleNews tOne = mtn.listNews("Hiển thị", "Có", 0, 1);
        TittleNews tTwo = mtn.listNews("Hiển thị", "Có", 1, 1);
        TittleNews tThree = mtn.listNews("Hiển thị", "Có", 2, 1);
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("tOne", tOne);
        model.addAttribute("tTwo", tTwo);
        model.addAttribute("tThree", tThree);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        model.addAttribute("ltn", ltn);
        model.addAttribute("count", mtn.count());
        model.addAttribute("id", idTN);
        Rule r = mRule.showRule();
        model.addAttribute("rule", r);
        return "HomePage";
    }

    @RequestMapping("/reductionPage")
    public String reductionPage(Model model, @RequestParam("id") int idTN) throws SQLException {
        if (idTN != 1) {
            idTN--;
        }

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        List<TittleNews> ltn = mtn.listNews("Hiển Thị", idTN * 4 - 4, 4);
        TittleNews tOne = mtn.listNews("Hiển thị", "Có", 0, 1);
        TittleNews tTwo = mtn.listNews("Hiển thị", "Có", 1, 1);
        TittleNews tThree = mtn.listNews("Hiển thị", "Có", 2, 1);
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("tOne", tOne);
        model.addAttribute("tTwo", tTwo);
        model.addAttribute("tThree", tThree);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        model.addAttribute("ltn", ltn);
        model.addAttribute("count", mtn.count());
        model.addAttribute("id", idTN);
        Rule r = mRule.showRule();
        model.addAttribute("rule", r);
        return "HomePage";
    }

    @RequestMapping("/showContentNews")
    public String showContentNews(Model model, @RequestParam("id") int idTN) throws SQLException {
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        List<TittleNews> lt = mtn.listNews("Hien Thi", "Co");
        model.addAttribute("ltn", lt);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        TittleNews t = mtn.listNewsIDTN(idTN);
        model.addAttribute("t", t);
        List<ContentNews> lcn = mcn.showCNews(idTN);
        model.addAttribute("lcn", lcn);
        return "ShowContenNews";
    }

    @RequestMapping("/updatePersonalInfo")
    public String updatePersonalInfo(Model model, HttpSession session, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        Employee e = me.showIDE(idRFID, idFingerprint);
        model.addAttribute("e", e);
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        
        return "updatePersonalInfo";
    }

    @RequestMapping("/saveUpdatePersonalInfo")
    public String saveUpdatePersonalInfo(Model model, HttpSession session, @RequestParam("gender") String gender, @ModelAttribute("e") Employee e, @RequestParam("idRoom") int idRoom, @RequestParam("oldImage") String image) throws SQLException, ParseException {
        String keyAES = ec.random(ec.ranomKey());
        e.setKeyAES(keyAES);
        e.setPass(ec.encrypt(e.getPass(), keyAES));
        e.setGender(gender);
        e.setIdRoom(idRoom);

        if (e.getImage().equals("")) {
            e.setImage(image);
        }
        me.updateAdmin(e);
        model.addAttribute("e", me.showIDE(e.getIdRFID(), e.getIdFingerprint()));
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        session.setAttribute("image", e.getImage());

        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        model.addAttribute("inform", "Cập Nhật Thành Công");
        
        session.setAttribute("image", e.getImage());

        session.setAttribute("idFT", e.getIdFingerprint());
        session.setAttribute("name", e.getFullName());

        session.setAttribute("quyen", e.getPowerful());
        return "InfoPersonal";
    }

    @RequestMapping("/employeeRoom")
    public String employeeRoom(Model model, @RequestParam("id") int idRoom) throws SQLException {
        List<Employee> le = me.show(idRoom);
        Room r = mr.showIDPhong(idRoom);
        model.addAttribute("r", r);
        model.addAttribute("lep", le);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "employeeRoom";
    }

    @RequestMapping("/detailEmployee")
    public String detailEmployee(Model model, @RequestParam("idRoom") int idRoom, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        Employee e = me.showIDE(idRFID, idFingerprint);
        model.addAttribute("e", e);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        Room r = mr.showIDPhong(idRoom);
        model.addAttribute("r", r);
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "detailEmployee";
    }

    @RequestMapping("/InfoPersonal")
    public String InfoPersonal(Model model, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        Employee e = me.showIDE(idRFID, idFingerprint);
        model.addAttribute("e", e);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();

        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "InfoPersonal";
    }
}
