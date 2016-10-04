/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services;

import br.com.ueg.model.Bairro;
import java.util.Collection;

public interface BairroServices {
    
    Bairro findById(Long id);
    
    Collection<Bairro> findAll();
    
    Bairro create(Bairro bairro);
    
    Bairro upadte(Bairro bairro);
    
    void delete(Bairro bairro);
}
