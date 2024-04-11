package webapp.escola_kaka.Repository;

import org.springframework.data.repository.CrudRepository;

import webapp.escola_kaka.Controller.AdministradorController;
import webapp.escola_kaka.Model.Administrador;

public interface AdministradorRepository extends CrudRepository<Administrador, String> {
    
    AdministradorController findByCpf (String cpf);
    
}