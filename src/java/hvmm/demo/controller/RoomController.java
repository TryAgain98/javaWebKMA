/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Room;
import hvmm.demo.model.mRoom;
import java.sql.SQLException;
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
public class RoomController {

    mRoom mr = new mRoom();

    @RequestMapping("/addPhongBan")
    public String addPhongBan(Model model) {
        Room r = new Room();
        model.addAttribute("r", r);
        return "AddPhongBan";
    }

    @RequestMapping("/addKhoa")
    public String addKhoa(Model model) {
        Room r = new Room();
        model.addAttribute("r", r);
        return "AddKhoa";
    }

    @RequestMapping("/saveAddPhongBan")
    public String saveAddPhongBan(Model model, @RequestParam("introduce") String introduce, @ModelAttribute("r") Room r) throws SQLException {
        r.setIntroduce(introduce);
        mr.Add(r);
        model.addAttribute("r", new Room());
        model.addAttribute("inform", "Thêm Thành công");
        return "AddPhongBan";
    }
    
    
    @RequestMapping("/saveAddKhoa")
    public String saveAddKhoa(Model model, @RequestParam("introduce") String introduce, @ModelAttribute("r") Room r) throws SQLException {
        r.setIntroduce(introduce);
        mr.Add(r);
        model.addAttribute("r", new Room());
          model.addAttribute("inform", "Thêm Thành công");
        return "AddKhoa";
    }


    @RequestMapping("/PhongBan")
    public String PhongBan(Model model) throws SQLException {
        List<Room> lr = mr.showPhongBan();
        model.addAttribute("lr", lr);
        return "PhongBan";
    }
     @RequestMapping("/Khoa")
    public String Khoa(Model model) throws SQLException {
        List<Room> lr = mr.showKhoa();
        model.addAttribute("lr", lr);
        return "Khoa";
    }
     @RequestMapping("/deletePhongBan")
    public String deletePhongBan(Model model,@RequestParam("id") int idRoom) throws SQLException {
        mr.delete(idRoom);
        List<Room> lr = mr.showPhongBan();
        model.addAttribute("lr", lr);
         model.addAttribute("inform", "Xóa Thành Công");
        return "PhongBan";
    }
    @RequestMapping("/deleteKhoa")
    public String deleteKhoa(Model model,@RequestParam("id") int idRoom) throws SQLException {
        mr.delete(idRoom);
        List<Room> lr = mr.showKhoa();
        model.addAttribute("lr", lr);
         model.addAttribute("inform", "Xóa Thành Công");
        return "Khoa";
    }
     @RequestMapping("/updatePhongBan")
    public String updatePhongBan(Model model,@RequestParam("id") int idRoom) throws SQLException {
        Room r=mr.showIDPhong(idRoom);
        model.addAttribute("r", r);
        return "updatePhongBan";
    }
    
     @RequestMapping("/updateKhoa")
    public String updateKhoa(Model model,@RequestParam("id") int idRoom) throws SQLException {
        Room r=mr.showIDPhong(idRoom);
        model.addAttribute("r", r);
        return "updatePhongBan";
    }
     @RequestMapping("/saveUpdatePB")
    public String saveUpdatePB(Model model,@ModelAttribute("r") Room r) throws SQLException {
        mr.update(r);
        model.addAttribute("inform", "Cập Nhật Thành Công");
        List<Room> lr = mr.showPhongBan();
        model.addAttribute("lr", lr);
        if(r.getLoai().equals("Khoa")){
             lr = mr.showKhoa();
        model.addAttribute("lr", lr);
            return "Khoa";
        }
        return "PhongBan";
    }
}
