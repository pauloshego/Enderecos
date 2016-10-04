/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;


import br.com.ueg.model.Pais;
import br.com.ueg.services.PaisServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.ueg.repository.PaisRepository;

@Service
public class PaisServicesImplementation  implements PaisServices{
    @Autowired//faz injeçao de dependencia, sem necessitar estanciar objeto
    private PaisRepository repository ;
    
    @Override
    public Pais findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Pais> findAll() {
       return (Collection<Pais>)repository.findAll();
       //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pais create(Pais pais) {
        
       return repository.save(pais);
     //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Pais update(Pais pais) {
       return repository.save(pais);
      
    }

    @Override
    public void delete(Pais pais) {
        
       repository.delete(pais);
     
    }
    
}
