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
    
    private int codPlayer;
    private int codQuestion;
    private String answer;
    
    public QuestionPlayer(){
        
    }

    /**
     * @return the codPlayer
     */
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
