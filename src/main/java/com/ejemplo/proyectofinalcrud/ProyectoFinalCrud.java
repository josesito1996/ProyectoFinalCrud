package com.ejemplo.proyectofinalcrud;

import com.ejemplo.proyectofinalcrud.dao.PersonaDao;
import com.ejemplo.proyectofinalcrud.dao.PersonaService;
import com.ejemplo.proyectofinalcrud.entity.PersonaEntity;
import java.util.List;

public class ProyectoFinalCrud {

    public static void main(String[] args) {
        logicaParaPersonas();
    }

    public static void logicaParaPersonas() {
        PersonaService personaService = new PersonaDao();
        List<PersonaEntity> personaEntities = personaService.listar();
        System.out.println("Listado de Personas");
        for (PersonaEntity persona : personaEntities) {
            System.out.println(persona);
        }
        System.out.println("\n\n");
        System.out.println("REgistro de Personas");
        PersonaEntity personaEntity = new PersonaEntity();
        personaEntity.setDocumento("12121515");
        personaEntity.setPrimerNombre("JOSESITO");
        personaEntity.setSegundoNombre("Alexito");
        personaEntity.setApellidoPaterno("Guillermo");
        personaEntity.setApellidoMaterno("Solier");
        personaEntity.setIdPersona(3);
        PersonaEntity personaRegistrada = personaService.registrar(personaEntity);
        System.out.println("Persona registrada :");
        System.out.println(personaRegistrada);
        
        System.out.println("\n\n");
        
        System.out.println("ACtualizacion de Personas");
        PersonaEntity personaModificar = new PersonaEntity();
        personaModificar.setDocumento("12121515");
        personaModificar.setPrimerNombre("JOSESITO");
        personaModificar.setSegundoNombre("Alexito");
        personaModificar.setApellidoPaterno("Guillermo");
        personaModificar.setApellidoMaterno("Solier");
        personaModificar.setIdPersona(3);

        PersonaEntity personaModificada = personaService.modificar(personaModificar);
        System.out.println("\n\n");
        
        System.out.println("Persona Modificada :");
        System.out.println(personaModificada);
        
        System.out.println("\n\n");
        System.out.println("Eliminacion de Personas");
        personaService.eliminar(7);
        

    }
}
