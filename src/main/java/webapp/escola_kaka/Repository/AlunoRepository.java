package webapp.escola_kaka.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_kaka.Model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, String> {
}
