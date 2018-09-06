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
public class ScorePlayer {
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos eb tabla "ScorePlayer"
    private int codScorePlayer;
    private String fechaScorePlayer;
    private int totalScorePlayer;
    private int codUser; // Este atributo es una LLAVE FORANEA de la tabla USER
    private  int canResCorrecta;
    private int canResIncorrecta;

// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class
    public ScorePlayer(){
    
    
    }

    /**
     * @return the codScorePlayer
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCodScorePlayer() {
        return codScorePlayer;
    }

    /**
     * @param codScorePlayer the codScorePlayer to set
     */
    public void setCodScorePlayer(int codScorePlayer) {
        this.codScorePlayer = codScorePlayer;
    }

    /**
     * @return the fechaScorePlayer
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public String getFechaScorePlayer() {
        return fechaScorePlayer;
    }

    /**
     * @param fechaScorePlayer the fechaScorePlayer to set
     */
    public void setFechaScorePlayer(String fechaScorePlayer) {
        this.fechaScorePlayer = fechaScorePlayer;
    }

    /**
     * @return the totalScorePlayer
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getTotalScorePlayer() {
        return totalScorePlayer;
    }

    /**
     * @param totalScorePlayer the totalScorePlayer to set
     */
    public void setTotalScorePlayer(int totalScorePlayer) {
        this.totalScorePlayer = totalScorePlayer;
    }

    /**
     * @return the codUser
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
     * @return the canResCorrecta
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCanResCorrecta() {
        return canResCorrecta;
    }

    /**
     * @param canResCorrecta the canResCorrecta to set
     */
    public void setCanResCorrecta(int canResCorrecta) {
        this.canResCorrecta = canResCorrecta;
    }

    /**
     * @return the canResIncorrecta
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCanResIncorrecta() {
        return canResIncorrecta;
    }

    /**
     * @param canResIncorrecta the canResIncorrecta to set
     */
    public void setCanResIncorrecta(int canResIncorrecta) {
        this.canResIncorrecta = canResIncorrecta;
    }


    
}
