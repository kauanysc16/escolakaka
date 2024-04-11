package webapp.escola_kaka.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import webapp.escola_kaka.Model.Professor;
import webapp.escola_kaka.Repository.ProfessorRepository;

@Controller
public class ProfessorController {

    @Autowired
    private ProfessorRepository professorRepository;

    @GetMapping("/cadastro-professor")
    public String mostrarFormularioCadastro(Model model) {
        model.addAttribute("professor", new Professor());
        return "cadastro-professor";
    }

    @PostMapping("/cadastro-professor")
    public String cadastrarProfessor(@ModelAttribute("professor") Professor professor, Model model) {
        professorRepository.save(professor);
        model.addAttribute("mensagem", "professor cadastrado com sucesso!");
        return "redirect:/cadastro-professor";
    }
}
