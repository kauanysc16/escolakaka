package webapp.escola_kaka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import webapp.escola_kaka.Model.Administrador;
import webapp.escola_kaka.Repository.AdministradorRepository;
import webapp.escola_kaka.Repository.PreCadAdmRepository;


@Controller
public class AdministradorController {

    @Autowired
    private AdministradorRepository ar;

    @Autowired
    private PreCadAdmRepository pcar;

    @PostMapping("cadastro-adm")
    public String postCadastroAdm(Administrador adm) {

        String cpfVerificacao = pcar.findByCpf(adm.getCpf()).getCpf();

        if (cpfVerificacao.equals(adm.getCpf())) {
            ar.save(adm);
            // enviar uma mensagem de cadastro realizada com sucesso
            System.out.println("Cadastro realizado com sucesso");
        } else {
            System.out.println("Cadastro não Realizado");
            return "cadastro/cad-adm";
        }
        return "login/login-adm";
    }

    @PostMapping("acesso-adm")
    public String acessoAdm(@RequestParam String nome, @RequestParam String senha) {
        
        return "interna/interna-adm";
    }
    
}
