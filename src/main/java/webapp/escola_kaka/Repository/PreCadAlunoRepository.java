package webapp.escola_kaka.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_kaka.Model.Aluno;

public interface PreCadAlunoRepository extends CrudRepository<Aluno, String>{

    Aluno findByMatricula(String matricula);

}