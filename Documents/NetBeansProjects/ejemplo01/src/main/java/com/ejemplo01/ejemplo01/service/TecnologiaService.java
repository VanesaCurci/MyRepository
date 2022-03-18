
package com.ejemplo01.ejemplo01.service;

import com.ejemplo01.ejemplo01.model.Tecnologia;
import java.util.List;


public interface TecnologiaService {
    List<Tecnologia>mostrar();
    Tecnologia mostrarId(int id);
    Tecnologia agregar(Tecnologia t);
    Tecnologia editar(Tecnologia t);
    Tecnologia eliminar(int id);
}
