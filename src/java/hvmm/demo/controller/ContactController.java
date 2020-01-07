/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Contact;
import hvmm.demo.model.mContact;
import java.sql.SQLException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Huy Toan
 */
@Controller
public class ContactController {
    mContact mc=new mContact();

    @RequestMapping("/updateContact")
    public String updateContact(Model model) throws SQLException{
        Contact c=mc.showContact();
        model.addAttribute("c", c);
        
        return "updateContact";
        
    }

     @RequestMapping("/saveContact")
    public String saveContact(Model model,@ModelAttribute("c") Contact c) throws SQLException{
       
        mc.updateContact(c);
        
        model.addAttribute("c", c);
               model.addAttribute("inform", "Cập Nhật Thành Công");
        return "updateContact";
        
    }

}
