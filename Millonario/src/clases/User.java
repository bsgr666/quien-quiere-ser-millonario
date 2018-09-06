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
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos en tabla "User"
    private int CodUser; // PRIMARY KEY
    private String Nombre;
    private String Apellido;
    private String Seudonimo;
    private int edad;

// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class    
    public User() {

    }

    /**
     * @return the CodUser
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
