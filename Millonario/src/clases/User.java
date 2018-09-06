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
    private int codUser;
    private String nameUser;
    private String lastNameUSer;
    private String akaUser;
    private int ageUser;
    
    public User(){
        
    }

    /**
     * @return the codUser
     */
    public int getCodUser() {
        return codUser;
    }

    /**
     * @param codUser the codUser to set
     */
    public void setCodUser(int codUser) {
        this.codUser = codUser;
    }

    /**
     * @return the nameUser
     */
    public String getNameUser() {
        return nameUser;
    }

    /**
     * @param nameUser the nameUser to set
     */
    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    /**
     * @return the lastNameUSer
     */
    public String getLastNameUSer() {
        return lastNameUSer;
    }

    /**
     * @param lastNameUSer the lastNameUSer to set
     */
    public void setLastNameUSer(String lastNameUSer) {
        this.lastNameUSer = lastNameUSer;
    }

    /**
     * @return the akaUser
     */
    public String getAkaUser() {
        return akaUser;
    }

    /**
     * @param akaUser the akaUser to set
     */
    public void setAkaUser(String akaUser) {
        this.akaUser = akaUser;
    }

    /**
     * @return the ageUser
     */
    public int getAgeUser() {
        return ageUser;
    }

    /**
     * @param ageUser the ageUser to set
     */
    public void setAgeUser(int ageUser) {
        this.ageUser = ageUser;
    }
}
