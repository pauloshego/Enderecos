package br.com.ueg.repository;

import br.com.ueg.model.Bairro;
import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends CrudRepository<Bairro, Long>{
    
    Bairro findById(Long id);
}
