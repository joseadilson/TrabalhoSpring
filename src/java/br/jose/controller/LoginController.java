/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jose.controller;

import br.jose.model.Pessoa;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jose
 */
@Controller
public class LoginController {

    @RequestMapping(value = {"/inicio", ""})
    public String index() {
        return "/login";
    }

    @RequestMapping("/validaLogin")
    public String validaLogin(HttpServletRequest r, Pessoa p) {

        if (r.getParameter("login").equals("admin") && r.getParameter("senha").equals("123")) {
            return "/index";
        }
        if (r.getSession().getAttribute("pessoa") == null) {
            return "/login";
        }

        ArrayList ar = (ArrayList) r.getSession().getAttribute("pessoa");

        boolean entro = false;
        for (int x = 0; x < ar.size(); x++ ) {
            Pessoa p1 = (Pessoa) ar.get(x);
            
            System.out.println();
            System.out.println(p1.getSenha());
            
            if (r.getParameter("login").equals(p1.getLogin()) && r.getParameter("senha").equals(p1.getSenha())) {
                entro = true;   
                break;
            } 
        }
        
        if(entro) {
            return "/index";   
        }
        
        return "/login";
    }

}
