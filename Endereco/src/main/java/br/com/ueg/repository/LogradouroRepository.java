
package br.com.ueg.repository;

import br.com.ueg.model.Logradouro;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogradouroRepository extends CrudRepository<Logradouro, Long>{
    
    Logradouro findById(Long id);
}
