/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hvmm.demo.controller;

import hvmm.demo.dto.ContentNews;
import hvmm.demo.model.mCN;
import java.sql.SQLException;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Huy Toan
 */
@RestController
public class NewsAPI {

    @RequestMapping("/addContentNews")
    public void addCard(@RequestParam("content") String content, Model model, @RequestParam("tittle") String tittle,
            @RequestParam("image") String image,@RequestParam("idTN") int idTN, @RequestParam("noteImage") String noteImage) throws SQLException {
        mCN mcn=new mCN();
        String fixImage="";
        for(int i=image.length()-1;i>=0;i--){
            
            if(image.charAt(i)=='\\'){
                fixImage=image.substring(i+1);
                break;
            }
        }
        ContentNews ec=new ContentNews( tittle, content, fixImage, noteImage, idTN);
        mcn.insert(ec);
        model.addAttribute("informNews", "Thêm Thành công");
    }
}
