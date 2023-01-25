package com.ejemplo.proyectofinalcrud.dao;

import com.ejemplo.proyectofinalcrud.bd.ConexionBd;
import com.ejemplo.proyectofinalcrud.entity.PersonaEntity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PersonaDao extends ConexionBd implements PersonaService {

    @Override
    public List<PersonaEntity> listar() {
        Connection connection = null;
        try {
            connection = getConection();
            PreparedStatement pst = connection.prepareStatement("SELECT * FROM persona");
            ResultSet resultSet = pst.executeQuery();
            List<PersonaEntity> personas = new ArrayList<>();
            while (resultSet.next()) {
                PersonaEntity persona = new PersonaEntity();
                persona.setIdPersona(resultSet.getInt(1));
                persona.setDocumento(resultSet.getString(2));
                persona.setPrimerNombre(resultSet.getString(3));
                personas.add(persona);
            }
            return personas;
        } catch (SQLException e) {
            System.err.println("Error al listar Personas a la BD : " + e.getMessage());
            return new ArrayList<>();
        }

    }

    @Override
    public PersonaEntity registrar(PersonaEntity personaEntity) {
        Connection connection = null;
        try {
            connection = getConection();
            PreparedStatement pst = connection.prepareStatement("INSERT INTO persona ( documento, primerNombre, segundoNombre, apellidoPaterno, apellidoMaterno ) VALUES (?,?,?,?,?)");
            pst.setString(1, personaEntity.getDocumento());
            pst.setString(2, personaEntity.getPrimerNombre());
            pst.setString(3, personaEntity.getSegundoNombre());
            pst.setString(4, personaEntity.getApellidoPaterno());
            pst.setString(5, personaEntity.getApellidoMaterno());
            int result = pst.executeUpdate();
            System.out.println("El resultado es : " + result);
        } catch (SQLException e) {
            System.err.println("Error al registra Persona en la BD : " + e.getMessage());
        }
        return new PersonaEntity();
    }

    @Override
    public PersonaEntity modificar(PersonaEntity personaEntity) {
      Connection connection = null;
        try {
            connection = getConection();
            PreparedStatement pst = connection.prepareStatement("UPDATE persona SET documento = ?, primerNombre = ?, segundoNombre = ?, apellidoPaterno = ?, apellidoMaterno = ? where idPersona = ?");
            pst.setString(1, personaEntity.getDocumento());
            pst.setString(2, personaEntity.getPrimerNombre());
            pst.setString(3, personaEntity.getSegundoNombre());
            pst.setString(4, personaEntity.getApellidoPaterno());
            pst.setString(5, personaEntity.getApellidoMaterno());
            pst.setInt(6, personaEntity.getIdPersona());
            pst.executeUpdate();
            return personaEntity;
        } catch (SQLException e) {
            System.err.println("Error al modificar Persona en la BD : " + e.getMessage());
            return new PersonaEntity();
        }
    };

    @Override
    public void eliminar(Integer id) {
        Connection connection = null;
        try {
            connection = getConection();
            PreparedStatement pst = connection.prepareStatement("delete from persona where idPersona = ?");
            pst.setInt(1, id);
            pst.executeUpdate();
        } catch (SQLException e) {
            System.err.println("Error al eliminar Persona en la BD : " + e.getMessage());
        }
    }
}
