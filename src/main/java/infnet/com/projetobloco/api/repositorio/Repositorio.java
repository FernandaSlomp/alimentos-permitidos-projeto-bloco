package infnet.com.projetobloco.api.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import infnet.com.projetobloco.api.modelo.Alimento;

@Repository
public interface Repositorio extends CrudRepository<Alimento, Long>{
    
}
