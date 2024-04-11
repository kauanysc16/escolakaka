package webapp.escola_kaka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import webapp.escola_kaka.Model.Aluno;
import webapp.escola_kaka.Repository.AlunoRepository;

@Controller
public class AlunoController {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping("/cadastro-aluno")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("aluno", new Aluno());
        return "cadastro-aluno";
    }

    @PostMapping("/cadastro-aluno")
    public String cadastrarAluno(@ModelAttribute("aluno") Aluno aluno, Model model) {
        alunoRepository.save(aluno);
        model.addAttribute("mensagem", "Aluno cadastrado com sucesso!");
        return "redirect:/cadastro-aluno";
    }
}
