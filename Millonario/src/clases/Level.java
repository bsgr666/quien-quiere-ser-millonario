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
public class Level {
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos en tabla "Level"
    private int codLevel; // PRIMARY KEY
    private String nameLevel;
    private int scoreLevel;
   
    
// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class
    public Level(){
    
    
    }

    /**
     * @return the codLevel
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCodLevel() {
        return codLevel;
    }

    /**
     * @param codLevel the codLevel to set
     */
    public void setCodLevel(int codLevel) {
        this.codLevel = codLevel;
    }

    /**
     * @return the nameLevel
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public String getNameLevel() {
        return nameLevel;
    }

    /**
     * @param nameLevel the nameLevel to set
     */
    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    /**
     * @return the scoreLevel
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getScoreLevel() {
        return scoreLevel;
    }

    /**
     * @param scoreLevel the scoreLevel to set
     */
    public void setScoreLevel(int scoreLevel) {
        this.scoreLevel = scoreLevel;
    }
    
    
}
