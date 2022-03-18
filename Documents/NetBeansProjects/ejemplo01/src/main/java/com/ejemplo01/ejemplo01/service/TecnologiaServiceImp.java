
package com.ejemplo01.ejemplo01.service;

import com.ejemplo01.ejemplo01.model.Tecnologia;
import com.ejemplo01.ejemplo01.repository.TecnologiaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologiaServiceImp implements TecnologiaService{
@Autowired
    private TecnologiaRepository tecnoRepository;
    @Override
    public List<Tecnologia> mostrar() {
        return tecnoRepository.findAll();
    }

    @Override
    public Tecnologia mostrarId(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tecnologia agregar(Tecnologia t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tecnologia editar(Tecnologia t) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Tecnologia eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
