
package com.ejemplo.proyectofinalcrud.dao;

import com.ejemplo.proyectofinalcrud.entity.PersonaEntity;
import java.util.List;


public interface PersonaService {
    
    List<PersonaEntity> listar();
    
    PersonaEntity registrar(PersonaEntity personaEntity);
    
    PersonaEntity modificar(PersonaEntity personaEntity);
}
