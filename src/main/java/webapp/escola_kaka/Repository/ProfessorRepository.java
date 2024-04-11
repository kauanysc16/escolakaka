package webapp.escola_kaka.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_kaka.Model.Professor;

public interface ProfessorRepository extends CrudRepository<Professor, String> {
}
