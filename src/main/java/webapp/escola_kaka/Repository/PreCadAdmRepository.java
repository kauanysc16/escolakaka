package webapp.escola_kaka.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_kaka.Model.PreCadAdm;

public interface PreCadAdmRepository extends CrudRepository<PreCadAdm, String>{
    
    PreCadAdm findByCpf (String cpf);

}