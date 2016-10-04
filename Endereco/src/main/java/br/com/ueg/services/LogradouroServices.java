/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services;

import br.com.ueg.model.Logradouro;
import java.util.Collection;

/**
 *
 * @author pcshe
 */
public interface LogradouroServices {
    
     Logradouro findById(Long id);
    
    Collection<Logradouro> findAll();
    
    Logradouro create(Logradouro logradouro);
    
    Logradouro upadte(Logradouro logradouro);
    
    void delete(Logradouro logradouro);
}
