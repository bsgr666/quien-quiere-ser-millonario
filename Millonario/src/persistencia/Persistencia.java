package persistencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Persistencia {
    public static Connection con;
    public static Statement areadb;
    
    
    public static boolean conectar()
    {
        //(variable para el control de errores
        try
        {
            //primera linea llama al driver para poderse conectar
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                
                // conectarse a la base de datos------------taller3 es el nombre de la base de datos  root_usuario   root_clave
                con=DriverManager.getConnection("jdbc:mysql://localhost/millonario", "sthefania","sthefania");//esto es lo unico que se cambiiiiiiiia a la hora de trabajar
                //
                areadb = con.createStatement();
                //si todo es perfecto retornara verdadero y se podra conectar
                System.out.println("Conectado");
        }
        //captura los errores cuando hay errores
        catch(ClassNotFoundException se)
        {
               System.out.println("No se ha podido encontrar el driver para MySQL.");
               return false;
        }
        //catch exeption----captura cual quier tipo de errores sin importar que h*-#$% pase
        catch (Exception se)
        {
            System.out.println("No se ha podido conectar a la base de datos ");
            return false;
        }

        return true;
    }

    public static boolean desconectar()
    {
        try
        {
            areadb.close();
            con.close();
            System.out.println("Desconectado");
            return true;
        } catch(SQLException ex )
            {
                //System.out.println("Conexion_Error");
                return false;
            }catch(NullPointerException u){
                System.out.println("No se ha conectado");
                return false;
            }
    }
}