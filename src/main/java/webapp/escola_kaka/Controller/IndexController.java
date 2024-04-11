package webapp.escola_kaka.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;




@Controller
public class IndexController {

    @GetMapping("/")
    public String acessoHome() {
        return "index";
    }

    @GetMapping("/home")
    public String acessoHome2() {
        return "index";
    }
    
    @GetMapping("/login-adm")
    public String acessoLoginAdm() {
        return "login/login-adm";
    }

    @GetMapping("/cad-adm")
    public String acessoCadastroAdm() {
        return "cadastro/cad-adm";
    }

    @GetMapping("/login-aluno")
    public String acessoLoginAluno() {
        return "login/login-aluno";
    }

    @GetMapping("/cad-aluno")
    public String acessoCadastroAluno() {
        return "cadastro/cad-aluno";
    }

    @GetMapping("/login-prof")
    public String acessoLoginProf() {
        return "login/login-prof";
    }

    @GetMapping("/cad-prof")
    public String acessoCadastroProf() {
        return "cadastro/cad-prof";
    }
    
    
}