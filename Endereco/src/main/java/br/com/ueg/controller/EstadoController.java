/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.controller;

import br.com.ueg.model.Estado;
import br.com.ueg.services.EstadoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/estado", produces = MediaType.APPLICATION_JSON_VALUE)
public class EstadoController {
    
    @Autowired
    private EstadoServices services;
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)//usar post quando informação é externa
    public Estado get(Long id){//retirar path quando usa post
       return  services.findById(id);
    }
    
}
