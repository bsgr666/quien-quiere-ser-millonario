/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Level;
import java.sql.SQLException;
import persistencia.Persistencia;

/**
 *
 * @author Equipo
 */
public class LogicLevel {
    
    public String registrarLevel(Level nuevoLevel){
        
        String sentencia = "insert into level values(null,'"+nuevoLevel.getNameLevel()+"',"+nuevoLevel.getScoreLevel()+")";//armar la sentencia sql
        System.out.println(sentencia);
        
        if(Persistencia.conectar()){
            try {
                Persistencia.areadb = Persistencia.con.createStatement();
                Persistencia.areadb.execute(sentencia);
                return "Level registrado correctamente";
            } catch (SQLException ex) {
                return "Ha ocurrido un error";
            }
         }else{
            return "No se pudo conectar a la base de datos";
        }
    }
    
}
