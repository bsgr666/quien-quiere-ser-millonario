/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Estudiante
 */
public class User {

    private int CodUser;
    private String Nombre;
    private String Apellido;
    private String Seudonimo;
    private int edad;

    public User() {

    }

    /**
     * @return the CodUser
     */
    public int getCodUser() {
        return CodUser;
    }

    /**
     * @param CodUser the CodUser to set
     */
    public void setCodUser(int CodUser) {
        this.CodUser = CodUser;
    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Apellido
     */
    public String getApellido() {
        return Apellido;
    }

    /**
     * @param Apellido the Apellido to set
     */
    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    /**
     * @return the Seudonimo
     */
    public String getSeudonimo() {
        return Seudonimo;
    }

    /**
     * @param Seudonimo the Seudonimo to set
     */
    public void setSeudonimo(String Seudonimo) {
        this.Seudonimo = Seudonimo;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
