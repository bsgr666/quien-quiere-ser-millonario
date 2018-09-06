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
public class Question {
  private int codQuestion;
  private String question;
  private String optionA;
  private String optionB;
  private String optionC;
  private String optionD;
  private String optionCorrect;
  //get y set de codigo de la tabla categoria
  private int kindCategory;
  //get y set de codigo de la tabla level
  private int codLevel;
  
 public Question(){
     
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
     * @return the question
     */
    public String getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(String question) {
        this.question = question;
    }

    /**
     * @return the optionA
     */
    public String getOptionA() {
        return optionA;
    }

    /**
     * @param optionA the optionA to set
     */
    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    /**
     * @return the optionB
     */
    public String getOptionB() {
        return optionB;
    }

    /**
     * @param optionB the optionB to set
     */
    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    /**
     * @return the optionC
     */
    public String getOptionC() {
        return optionC;
    }

    /**
     * @param optionC the optionC to set
     */
    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    /**
     * @return the optionD
     */
    public String getOptionD() {
        return optionD;
    }

    /**
     * @param optionD the optionD to set
     */
    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    /**
     * @return the optionCorrect
     */
    public String getOptionCorrect() {
        return optionCorrect;
    }

    /**
     * @param optionCorrect the optionCorrect to set
     */
    public void setOptionCorrect(String optionCorrect) {
        this.optionCorrect = optionCorrect;
    }

    /**
     * @return the kindCategory
     */
    public int getKindCategory() {
        return kindCategory;
    }

    /**
     * @param kindCategory the kindCategory to set
     */
    public void setKindCategory(int kindCategory) {
        this.kindCategory = kindCategory;
    }

    /**
     * @return the codLevel
     */
    public int getCodLevel() {
        return codLevel;
    }

    /**
     * @param codLevel the codLevel to set
     */
    public void setCodLevel(int codLevel) {
        this.codLevel = codLevel;
    }
}
