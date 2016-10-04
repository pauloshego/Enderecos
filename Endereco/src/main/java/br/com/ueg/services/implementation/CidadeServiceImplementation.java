/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;

import br.com.ueg.model.Cidade;
import br.com.ueg.repository.CidadeRepository;
import br.com.ueg.services.CidadeServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CidadeServiceImplementation implements CidadeServices {
    
    @Autowired
    private CidadeRepository repositorio;

    @Override
    public Cidade findById(Long id) {
       return repositorio.findOne(id);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Collection<Cidade> findAll() {
        return (Collection<Cidade>)repositorio.findAll();
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade create(Cidade cidade) {
        return repositorio.save(cidade);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cidade upadte(Cidade cidade) {
        return repositorio.save(cidade);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Cidade cidade) {
        repositorio.delete(cidade);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
