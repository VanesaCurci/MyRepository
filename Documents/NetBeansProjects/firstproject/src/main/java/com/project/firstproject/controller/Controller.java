
package com.project.firstproject.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

  
    @PostMapping("/cliente")
    public void nuevoCliente(@RequestBody Cliente cli){
      System.out.println("Datos cliente... Nombre: " + cli.getNombre()+ 
              " Apellido: "+ cli.getApellido());
    }
}
