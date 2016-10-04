package br.com.ueg.repository;

import br.com.ueg.model.Pais;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaisRepository extends CrudRepository<Pais, Long> {
     Pais findById(Long id);  
     
}
