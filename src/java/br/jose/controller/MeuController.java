/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jose.controller;

import br.jose.model.Pessoa;
import com.sun.net.httpserver.HttpServer;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author jose
 */
@Controller
public class MeuController {
    private ArrayList a;
    //private HttpSession session;

    /*@RequestMapping(value = {"/inicio", ""})
    public String index() {
        return "/index";
    }*/

    @RequestMapping("/cadastroPessoa")
    public String pessoa() {

        return "pessoa/cadastroPessoa";
    }

    @RequestMapping("/cadastroConta")
    public String conta() {
        return "conta/cadastroConta";
    }

    @RequestMapping("/salvarPessoa")
    public String salvarPessoa(HttpServletRequest r, Pessoa p) {
        //System.out.println("Script:" + p.getNome());

        
        if (r.getSession().getAttribute("pessoa") == null) {
            a = new ArrayList();
        } else {
            a = (ArrayList) r.getSession().getAttribute("pessoa");
            
        }

        a.add(p);
        //System.err.println(a.size());
        r.getSession().setAttribute("pessoa", a);
        //m.addAttribute("pessoa", p);

        return "mensagemPessoa";
    }

    @RequestMapping("/salvarConta")
    public String salvarConta() {
        return "salvarConta";
    }

    @RequestMapping("/cadastrarMovimento")
    public String cadastroMovimento() {
        return "movimento/cadastroMovimento";
    }

    @RequestMapping("/buscaMovimento")
    public String buscaMovimento() {
        return "movimento/buscaMovimento";
    }

}
