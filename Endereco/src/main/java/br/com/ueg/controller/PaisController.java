package br.com.ueg.controller;

import br.com.ueg.model.Pais;
import br.com.ueg.services.PaisServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/pais",produces = MediaType.APPLICATION_JSON_VALUE)
public class PaisController {
    @Autowired
    private PaisServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)//usar post quando informação é externa
    public Pais get(Long id){//retirar path quando usa post
       return  services.findById(id);
    }
    
}
