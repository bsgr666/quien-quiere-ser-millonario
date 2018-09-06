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
// ATRIBUTOS / METODOS: estos metodos son cada columna de nuestra base de datos en tabla "Question"    
    private int codQuestion; // PRIMARY KEY
    private String answer;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String optionCorrect;
  //get y set de codigo de la tabla categoria
  private int kindCategory; // FOREIGN KEY
  //get y set de codigo de la tabla level
  private int codLevel; // FOREIGN KEY

// CONSTRUCTOR: es para poder crear los GET / SET en nuestro Java.class  
    public Question(){
     
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
     * @return the question
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
    public String getAnswer() {
        return answer;
    }

    /**
     * @param question the question to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return the optionA
     */
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
    // PUBLIC: se utiliza de esta manera para poder ser llamado desde otro JAVA.class por ello es publico
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
}
