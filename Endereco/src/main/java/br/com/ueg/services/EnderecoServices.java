/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services;

import br.com.ueg.model.Endereco;
import java.util.Collection;

/**
 *
 * @author pcshe
 */
public interface EnderecoServices {
    
    Endereco findById(Long id);
    
    Collection<Endereco> findAll();
    
    Endereco create(Endereco endereco);
    
    Endereco upadte(Endereco endereco);
    
    void delete(Endereco endereco);
}
