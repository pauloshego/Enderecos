package br.com.ueg.repository;

import br.com.ueg.model.Estado;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoRepository extends CrudRepository<Estado, Long> {
    
    Estado findById(Long id);
    
}
