/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.services.implementation;

import br.com.ueg.model.Bairro;
import br.com.ueg.repository.BairroRepository;
import br.com.ueg.services.BairroServices;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BairroServiceImplementation implements BairroServices{
    
    @Autowired
    private BairroRepository repository;

    @Override
    public Bairro findById(Long id) {
        return repository.findOne(id);
    }

    @Override
    public Collection<Bairro> findAll() {
        return (Collection<Bairro>)repository.findAll();
    }

    @Override
    public Bairro create(Bairro bairro) {
        return repository.save(bairro);
    }

    @Override
    public Bairro upadte(Bairro bairro) {
        return repository.save(bairro);
    }

    @Override
    public void delete(Bairro bairro) {
        repository.delete(bairro);
    }
    
}
