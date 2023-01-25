package com.ejemplo.proyectofinalcrud.entity;

public class PersonaEntity {

    private Integer idPersona;
    private String documento;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public PersonaEntity(){
    }
    
    public PersonaEntity(Integer idPersona, String documento, String primerNombre, String segundoNombre, String apellidoPaterno, String apellidoMaterno) {
        this.idPersona = idPersona;
        this.documento = documento;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    public Integer getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(Integer idPersona) {
        this.idPersona = idPersona;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    @Override
    public String toString() {
        return "PersonaEntity{" + "idPersona=" + idPersona + ", documento=" + documento + ", primerNombre=" + primerNombre + ", segundoNombre=" + segundoNombre + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno + '}';
    }

}
