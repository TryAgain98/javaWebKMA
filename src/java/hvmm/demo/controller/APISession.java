/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Employee;
import hvmm.demo.model.mEmployee;
import java.sql.SQLException;
import javax.servlet.http.HttpSession;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Huy Toan
 */
@RestController
public class APISession {

    mEmployee me = new mEmployee();

    @RequestMapping("/EmployeeSession")
    public String login(Model model, @RequestParam("pass") String pass, @RequestParam("email") String email, HttpSession session) throws SQLException {

        Employee e=new Employee();
        e.setEmail(email);
        e.setPass(pass);
        Employee e1 = me.login(e);
        
        session.setAttribute("employee", e1);
        return "Admin";
    }
}
