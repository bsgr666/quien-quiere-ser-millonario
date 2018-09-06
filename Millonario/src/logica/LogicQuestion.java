/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Question;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import persistencia.Persistencia;

/**
 *
 * @author Estudiante
 */
public class LogicQuestion {
    // consultar mostrar
    public List<Question> consultar(int level){
        String sentenciaConsulta = "";
        switch(level){
            case 1:
                sentenciaConsulta = "select  * from questions_easy where code_level="+level ;
                break;
            case 2:
                sentenciaConsulta = "select  * from questions_normal where code_level="+level ;
                break;
            case 3:
                sentenciaConsulta = "select  * from questions_hard where code_level="+level ;
                break;
            case 4:
                sentenciaConsulta = "select  * from questions_more_hard where code_level="+level ;
                break;
                
        }
        List<Question> listaquestion = new ArrayList<>();
        
        ResultSet resultadoConsulta = null;
        if(Persistencia.conectar()){
            try {
                Persistencia.areadb = Persistencia.con.createStatement();
                resultadoConsulta = Persistencia.areadb.executeQuery(sentenciaConsulta);
                
                //mientras haya un registro va a seguir guardando por eso un mientras
                while(resultadoConsulta.next()){
                    Question objetoQuestion = new Question();
                    objetoQuestion.setAnswer(resultadoConsulta.getString("answer"));
                    objetoQuestion.setOptionA(resultadoConsulta.getString("optionA"));
                    objetoQuestion.setOptionB(resultadoConsulta.getString("optionB"));
                    objetoQuestion.setOptionC(resultadoConsulta.getString("optionC"));
                    objetoQuestion.setOptionD(resultadoConsulta.getString("optionD"));
                    
                    listaquestion.add(objetoQuestion);
                  
                   
                    
                }
                //siempre se cierra para ahorrar espacio en memoria y no se sature de cosas que ya no necesitamos
                resultadoConsulta.close();
                Persistencia.desconectar();
                
                return listaquestion;
                
                
            } catch (SQLException ex) {
                Logger.getLogger(LogicUser.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }else{
            return null;
        } 
    }
}
