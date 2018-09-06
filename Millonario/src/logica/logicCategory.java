/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import clases.Category;
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
public class logicCategory {
    
// CREAR METODO QUE RETORNE STRING-------------------------------------------------------------------------------------------
    public String packCategory(Category newCategory){
        
        //INSERTAR DATOS a la tabla
        String sentencia = "INSERT INTO category VALUES(null, '"+newCategory.getNameCategory()+"')";
        
// CONDICION: verificar si se conecta bien con la base de datos 
        if(Persistencia.conectar()){
            // Cuando si entra bien en el sistmea
            try {
                Persistencia.areabd = Persistencia.con.createStatement();
                Persistencia.areabd.execute(sentencia);
                return "¡Registro Correctamente!";
            
                
            // Por si se encuentra un error en el momento de ingresar los datos    
            } catch (SQLException ex) {
                return "¡Ocurrio un ERROR!";
            }
        }else{
            return "No se puede conectar a la Base de Datos";
        }
    }
// ----------------------------------------------------------------------------------------------------------------------------
// CREAR METODO QUE CONSULTE --------------------------------------------------------------------------------------------------
    public List<Category> consult(){
        //LISTA: lista creada para almacenar los datos de las tablas en MYSQL
        List<Category> ListCategory = new ArrayList<>();
        String sentenciaConsulta = "select * from tblcargos";
            ResultSet resultadoConsulta = null;
            if(Persistencia.conectar()){
                try {
                // CONEXION: saber si conecta correctamente
                    Persistencia.areadb = Persistencia.con.createStatement();
                    resultadoConsulta = Persistencia.areadb.executeQuery(sentenciaConsulta);
                    
                // ALMACENAR: mientras ciclo para almacenar los datos en esta lista "ListCategory"
                    Category objetoCategory = new Category();
                    objetoCategory.setCodCategory(resultadoConsulta.getInt("codCategory"));
                    objetoCategory.setNameCategory(resultadoConsulta.getString("nameCategory"));
                    
                    ListCategory.add(objetoCategory);
                    
                resultadoConsulta.close(); // Cerrar proceso del cual estabamos buscando, el cual elimina los datos donde buscamos 
                Persistencia.desconectar();
                return ListCategory;                                 
                    
                }catch (SQLException ex) {
                Logger.getLogger(logicCategory.class.getName()).log(Level.SEVERE, null, ex); // para mostrar error en la consola 
                return null;
                }
                  
                }else{
                    return null;
                }
        //-------------------------------------------------------------------------------------------------          
    }
// ----------------------------------------------------------------------------------------------------------------------------        
}
    
    
    
    

