/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Employee;
import hvmm.demo.dto.Room;
import hvmm.demo.model.Encryption;
import hvmm.demo.model.mEmployee;
import hvmm.demo.model.mRoom;
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
public class EmployeeController {

    mRoom mr = new mRoom();
    mEmployee me = new mEmployee();
    Encryption ec = new Encryption();

    @RequestMapping("/addEmployee")
    public String addEmployee(Model model) throws SQLException {
        Employee e = new Employee();
        model.addAttribute("e", e);
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        return "AddEmployee";
    }

    @RequestMapping("/saveAddEmployee")
    public String saveAddEmployee(Model model, @RequestParam("gender") String gender, @RequestParam("quyen") String quyen, @ModelAttribute("e") Employee e, @RequestParam("idRoom") int idRoom
    ) throws SQLException, ParseException {
         if (me.checkRFID(e.getIdRFID()) == true) {
            model.addAttribute("e", e);
            List<Room> lr = mr.showKhoa_PhongBan();
            model.addAttribute("lr", lr);
            model.addAttribute("warn", "Thẻ đã tồn tại");
            return "AddEmployee";
        }
        if (me.checkEmail(e.getEmail()) == true) {
            model.addAttribute("e", e);
            List<Room> lr = mr.showKhoa_PhongBan();
            model.addAttribute("lr", lr);
            model.addAttribute("warn", "email đã tồn tại");
            return "AddEmployee";
        }

        String keyAES = ec.random(ec.ranomKey());
        e.setKeyAES(keyAES);
        e.setPass(ec.encrypt(e.getPass(), keyAES));
        e.setGender(gender);
        e.setIdRoom(idRoom);
        e.setPowerful(quyen);
        me.Add(e);
        model.addAttribute("inform", "Thêm Thành Công");
        model.addAttribute("e", new Employee());
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);
        return "AddEmployee";
    }

    @RequestMapping("/Employee")
    public String Employee(Model model) throws SQLException {
        List<Employee> le = me.show();
        model.addAttribute("lep", le);
        return "Employee";
    }

    @RequestMapping("/updateEmployee")
    public String updateEmployee(Model model, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        Employee e = me.showIDE(idRFID, idFingerprint);
        
        model.addAttribute("e", e);
        List<Room> lr = mr.showKhoa_PhongBan();
        model.addAttribute("lr", lr);

        return "updateEmployee";

    }

    @RequestMapping("/deleteEmployee")
    public String deleteEmployee(Model model, @RequestParam("idRFID") String idRFID, @RequestParam("idFingerprint") String idFingerprint) throws SQLException {
        me.delete(idRFID, idFingerprint);
        List<Employee> le = me.show();
        model.addAttribute("lep", le);
        model.addAttribute("inform", "Xóa Thành Công");
        return "Employee";

    }

    @RequestMapping("/saveUpdateEmployee")
    public String saveUpdateEmployee(Model model, @RequestParam("gender") String gender, @RequestParam("quyen") String quyen, @ModelAttribute("e") Employee e, @RequestParam("idRoom") int idRoom, @RequestParam("oldImage") String image) throws SQLException, ParseException {
        
        System.out.println("1");
        String keyAES = ec.random(ec.ranomKey());
        e.setKeyAES(keyAES);
        e.setPass(ec.encrypt(e.getPass(), keyAES));
        e.setGender(gender);
        e.setIdRoom(idRoom);
        e.setPowerful(quyen);

        
        if (e.getImage().equals("")) {
            e.setImage(image);
        }
       System.out.println("2");
        me.update(e);
        System.out.println("3");
        List<Employee> le = me.show();
        model.addAttribute("lep", le);
        model.addAttribute("inform", "Cập Nhật Thành Công");
        
        return "Employee";
    }
}
