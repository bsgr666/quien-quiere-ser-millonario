/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.User;
import java.sql.SQLException;
import persistencia.Persistencia;

/**
 *
 * @author Estudiante
 */
public class LogicUser {
    
     //registrar usuarios
    public String registrarUser(User nuevoUser){
        String sentencia="insert into user values(null,'"+nuevoUser.getNameUser()+"','"+nuevoUser.getLastNameUSer()+"','"+nuevoUser.getAkaUser()+"',"+nuevoUser.getAgeUser()+")";
        System.out.print(sentencia);
        if(Persistencia.conectar()){
            try {
                Persistencia.areadb=Persistencia.con.createStatement();
                Persistencia.areadb.execute(sentencia);
                return " USER CREATE CORRECTLY";
            } catch (SQLException ex) {
                return "THERE ARE A THREAT";
            }
        }else{
            return "IT DID NOT CONNECT CORRECTLY TO THE DATABASE";
        }
    }
    //MODIFICAR
     public String modificarUser(User nuevoUser){
        String sentencia= "UPDATE user  set nameUser = '"+nuevoUser.getNameUser()+"',lastnameUser='"+nuevoUser.getLastNameUSer()+"',akaUser='"+nuevoUser.getAkaUser()+
                            "',age="+nuevoUser.getAgeUser()+")";
        
        System.out.print(sentencia);
        if(Persistencia.conectar()){
            try {
                Persistencia.areadb=Persistencia.con.createStatement();
                Persistencia.areadb.execute(sentencia);
                return "USER MODIFIED CORRECTLY";
                
            } catch (SQLException ex) {
                return "THERE ARE A THREAT";
            }
        }else{
            return "IT DID NOT CONNECT CORRECTLY TO THE DATABASE";
        }   
    }
    
}
