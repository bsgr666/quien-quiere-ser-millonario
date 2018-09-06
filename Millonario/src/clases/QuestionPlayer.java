/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Equipo
 */
public class QuestionPlayer {
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos en tabla "QuestionPlayer"    
    private int codPlayer; // PRIMARY KEY / FOREIGN KEY
    private int codQuestion; // PRIMARY KEY / FOREIGN KEY
    private String answer;
    
// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class    
    public QuestionPlayer(){
        
    }

    /**
     * @return the codPlayer
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCodPlayer() {
        return codPlayer;
    }

    /**
     * @param codPlayer the codPlayer to set
     */
    public void setCodPlayer(int codPlayer) {
        this.codPlayer = codPlayer;
    }

    /**
     * @return the codQuestion
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public int getCodQuestion() {
        return codQuestion;
    }

    /**
     * @param codQuestion the codQuestion to set
     */
    public void setCodQuestion(int codQuestion) {
        this.codQuestion = codQuestion;
    }

    /**
     * @return the answer
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    
}
