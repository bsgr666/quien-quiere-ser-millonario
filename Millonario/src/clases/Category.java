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
    private int codCategory;//primary key
    private String nameCategory;
    
    public Category(){//constructor
        
    }

    /**
     * @return the codCategory
     */
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
