package br.com.ueg.services;

import br.com.ueg.model.Cidade;
import java.util.Collection;


public interface CidadeServices {
    
    Cidade findById(Long id);
    
    Collection<Cidade> findAll();
    
    Cidade create(Cidade cidade);
    
    Cidade upadte(Cidade cidade);
    
    void delete(Cidade cidade);
}
