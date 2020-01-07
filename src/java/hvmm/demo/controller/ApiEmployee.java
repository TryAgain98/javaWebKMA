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
public class ApiEmployee {
    
     mRoom mr = new mRoom();
    mEmployee me = new mEmployee();
    Encryption ec = new Encryption();
    
//     @RequestMapping("/saveAddEmployee")
//    public void saveAddEmployee(Model model, @RequestParam("gender") String gender, @RequestParam("quyen") String quyen, @RequestParam("idRoom") int idRoom
//            ,@RequestParam("idRFID") String idRFID,@RequestParam("idF") String idFingerprint,@RequestParam("email") String email,
//            @RequestParam("pass") String pass,@RequestParam("fullName") String fullName,@RequestParam("phone") String phone,
//            @RequestParam("address") String address,@RequestParam("birthday") String birthday,
//            @RequestParam("image") String image,@RequestParam("cSalary") double cSalary,@RequestParam("positionn") String positionn
//    ) throws SQLException, ParseException {
//         System.out.println(address);
//          System.out.println(image);
//           System.out.println(birthday);
//            System.out.println(cSalary);
//             System.out.println(positionn);
//         System.out.println("lol ma");
//        Employee e=new  Employee(idRFID, idFingerprint, email, pass, fullName, phone, address, birthday, gender, positionn, phone, cSalary, image, email, idRoom);
//          System.out.println("ok "+e);
//        
//        String keyAES = ec.random(ec.ranomKey());
//        e.setKeyAES(keyAES);
//        e.setPass(ec.encrypt(e.getPass(), keyAES));
//        e.setGender(gender);
//        e.setIdRoom(idRoom);
//        e.setPowerful(quyen);
//        
//       
//        me.Add(e);
//        model.addAttribute("inform", "Thêm Thành Công");
//        model.addAttribute("e", new Employee());
//        List<Room> lr = mr.showKhoa_PhongBan();
//        model.addAttribute("lr", lr);
//        
//    }

}
