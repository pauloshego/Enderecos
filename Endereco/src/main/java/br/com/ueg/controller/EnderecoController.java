/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ueg.controller;

import br.com.ueg.model.Endereco;
import br.com.ueg.services.EnderecoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (value= "/api/endereco" , produces = MediaType.APPLICATION_JSON_VALUE)
public class EnderecoController {
    @Autowired
    private EnderecoServices services;
    @RequestMapping(value = "/{id}" , method = RequestMethod.GET)
    public Endereco get(Long id){
        return services.findById(id);
    }
}
