
package com.ejemplo01.ejemplo01.controller;

import com.ejemplo01.ejemplo01.model.Tecnologia;
import com.ejemplo01.ejemplo01.service.TecnologiaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/tecnologias"})
public class TecnologiaController {
    
    @Autowired
    TecnologiaService service;
    
    @GetMapping
    public List<Tecnologia>mostrar(){
        return service.mostrar();
    }
    
}
