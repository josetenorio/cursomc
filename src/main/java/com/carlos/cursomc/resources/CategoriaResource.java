/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.carlos.cursomc.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author carlos
 */
@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
    
    @RequestMapping(method=RequestMethod.GET)
    public String listar(){
        return "Rest está funcionando";
    }
    
}
