/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.Rule;
import hvmm.demo.model.mRule;
import java.sql.SQLException;
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
public class RuleController {

    mRule mr = new mRule();

    @RequestMapping("/updateRule")
    public String rule(Model model) throws SQLException {
        Rule r = mr.showRule();
        model.addAttribute("r", r);

        return "updateRule";
    }
    @RequestMapping("/saveRule")
    public String saveRule(Model model, @ModelAttribute("r") Rule r,@RequestParam("introduce") String introduce,
 @RequestParam("costume") String costume,@RequestParam("prohibit") String prohibit,
 @RequestParam("object") String object) throws SQLException{
        r.setCostume(costume);
        r.setIntroduce(introduce);
        r.setObject(object);
        r.setProhibit(prohibit);
        mr.updateRule(r);
         r=mr.showRule();
        model.addAttribute("r", r);
        model.addAttribute("inform", "Cập Nhật Thành Công");
        return "updateRule";
    }
}
