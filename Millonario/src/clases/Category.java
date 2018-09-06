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
public class Category {
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos en tabla "Category"    
    private int codCategory;//PRIMARY KEY
    private String nameCategory;
    
// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class    
    public Category(){//constructor
        
    }

    /**
     * @return the codCategory
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCodCategory() {
        return codCategory;
    }

    /**
     * @param codCategory the codCategory to set
     */
    public void setCodCategory(int codCategory) {
        this.codCategory = codCategory;
    }

    /**
     * @return the nameCategory
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public String getNameCategory() {
        return nameCategory;
    }

    /**
     * @param nameCategory the nameCategory to set
     */
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
