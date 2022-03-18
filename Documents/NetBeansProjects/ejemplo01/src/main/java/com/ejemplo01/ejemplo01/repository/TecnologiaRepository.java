
package com.ejemplo01.ejemplo01.repository;

import com.ejemplo01.ejemplo01.model.Tecnologia;
import java.util.List;
import org.springframework.data.repository.Repository;



public interface TecnologiaRepository extends Repository <Tecnologia, Integer>{
    List<Tecnologia>findAll();
    Tecnologia findOne(int id);
    Tecnologia save(Tecnologia t);
    void delete(Tecnologia t);          
}
