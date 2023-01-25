package com.ejemplo.proyectofinalcrud;

import com.ejemplo.proyectofinalcrud.dao.PersonaDao;
import com.ejemplo.proyectofinalcrud.dao.PersonaService;
import com.ejemplo.proyectofinalcrud.entity.PersonaEntity;

public class ProyectoFinalCrud {

    public static void main(String[] args) {
        PersonaService personaService = new PersonaDao();
        
        System.out.println(personaService.listar());
        
        personaService.eliminar(2);
        
        /*
        
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setDocumento("12121515");
        personaEntity.setPrimerNombre("JOSESITO");
        personaEntity.setSegundoNombre("Alexito");
        personaEntity.setApellidoPaterno("Guillermo");
        personaEntity.setApellidoMaterno("Solier");
        personaEntity.setIdPersona(3);
        
        personaService.modificar(personaEntity);
        */
        
    }
}
