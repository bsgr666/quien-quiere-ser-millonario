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
    private String Name;
    private String LastName;
    private String Aka;
    private int Age;

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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the LastName
     */
    public String getLastName() {
        return LastName;
    }

    /**
     * @param LastName the LastName to set
     */
    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    /**
     * @return the Aka
     */
    public String getAka() {
        return Aka;
    }

    /**
     * @param Aka the Aka to set
     */
    public void setAka(String Aka) {
        this.Aka = Aka;
    }

    /**
     * @return the Age
     */
    public int getAge() {
        return Age;
    }

    /**
     * @param Age the Age to set
     */
    public void setAge(int Age) {
        this.Age = Age;
    }

    
}
