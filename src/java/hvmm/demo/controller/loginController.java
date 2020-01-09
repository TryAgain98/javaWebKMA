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
public class loginController {

    mEmployee me = new mEmployee();
    mRoom mr = new mRoom();
    Encryption ec = new Encryption();
    mTN mtn = new mTN();
    mCN mcn = new mCN();
    mRule mRule = new mRule();
    mContact mc = new mContact();

    @RequestMapping("/")
    public String home(Model model) {
        Employee e = new Employee();
        model.addAttribute("e", e);
        return "index";
    }

    @RequestMapping("/admin")
    public String admin() {
        return "Admin";
    }

    @RequestMapping("/contact")
    public String contact(Model model) throws SQLException {
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "Contact";
    }

    @RequestMapping("/showRules")
    public String showRules(Model model) throws SQLException {

        Rule r = mRule.showRule();
        model.addAttribute("rule", r);
        List<Room> lp = mr.showPhongBan();
        List<Room> lk = mr.showKhoa();
        Contact rl = mc.showContact();
        model.addAttribute("rl", rl);
        model.addAttribute("lp", lp);
        model.addAttribute("lk", lk);
        return "ShowRules";
    }

    @RequestMapping("/login")
    public String login(Model model, HttpSession session, @ModelAttribute("e") Employee e) throws SQLException {
        Employee e1 = me.login(e);

        if (e1 == null) {
            model.addAttribute("inform", "Đăng Nhập Thất Bại");
            model.addAttribute("tittle", "Email hoặc mật khẩu không đúng");
            return "index";
        } else if (e1.getPowerful().toLowerCase().equals("Nhân Sự".toLowerCase())) {
            session.setAttribute("idRFID", e1.getIdRFID());
            session.setAttribute("idFT", e1.getIdFingerprint());
            session.setAttribute("name", e1.getName());
            session.setAttribute("image", e1.getImage());
            session.setAttribute("quyen", e1.getPowerful());

            List<Room> lp = mr.showPhongBan();
            List<Room> lk = mr.showKhoa();
            List<TittleNews> ltn = mtn.listNews("Hiển Thị", 0, 4);
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
            model.addAttribute("id", 1);
            Rule r = mRule.showRule();
            model.addAttribute("rule", r);
            return "HomePage";
        }

        model.addAttribute("e", new Employee());
        model.addAttribute("inform", "Đăng Nhập Thành Công");
        session.setAttribute("idRFID", e1.getIdRFID());
        session.setAttribute("idFT", e1.getIdFingerprint());
        session.setAttribute("name", e1.getFullName());
        session.setAttribute("image", e1.getImage());
        session.setAttribute("quyen", e1.getPowerful());
        return "Admin";
    }

    @RequestMapping("/updateAdmin")
    public String updateAdmin(Model model, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        Employee e = me.showIDE(idRFID, idFingerprint);
        System.out.println(e);
        model.addAttribute("e", e);
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        return "updateAdmin";
    }

    @RequestMapping("/saveUpdateAdmin")
    public String saveUpdateAdmin(Model model, HttpSession session, @RequestParam("gender") String gender, @ModelAttribute("e") Employee e, @RequestParam("idRoom") int idRoom, @RequestParam("oldImage") String image) throws SQLException, ParseException {
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
        
        session.setAttribute("idFT", e.getIdFingerprint());
        session.setAttribute("name", e.getFullName());
       
        session.setAttribute("quyen", e.getPowerful());
        
        
        model.addAttribute("inform", "Cập Nhật Thành Công");
        return "updateAdmin";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession session, Model model) {
        session.removeAttribute("idE");
        session.removeAttribute("image");
        session.removeAttribute("quyen");
        Employee e = new Employee();
        model.addAttribute("e", e);
        return "index";
    }
}
