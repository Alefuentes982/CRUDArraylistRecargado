/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crudalumnos;

import java.util.ArrayList;

/**
 *
 * @author Laboratorio
 */
public class AlumnoDao {
    private static ArrayList<Alumno> alumnos = new ArrayList<>();
    
    public static boolean agregar (Alumno alumno){
        boolean estado = false; //no agregado
        
        if(alumno != null && buscar(alumno.getRut())==null){
            alumnos.add(alumno);
            estado = true;
        }
        return estado;        
    }
    
    public static ArrayList<Alumno>obtenerDatos(){
        return alumnos;
    }
    
    public static void llenar(){
       alumnos.add(new Alumno("1-1", "Susana", (byte)22));
       alumnos.add(new Alumno("2-2", "Juan", (byte)20));
       alumnos.add(new Alumno("3-3", "David", (byte)21));
    }
    
    public static Alumno buscar(String rut){
        Alumno alumno=null;
        
          for(Alumno obj : alumnos){
              if(obj.getRut().equals(rut)){
                  alumno = obj;
                  break;
              }       
          }
           
     return alumno;   
    }
    
     public static boolean eliminar(String rut) {
        Alumno alumno = buscar(rut);
        if (alumno != null) {
            alumnos.remove(alumno);
            return true; // eliminado con éxito
        }
        return false; // no encontrado o no eliminado
    }
     
     
    public static boolean modificar(String rut, Alumno nuevoAlumno){
        Alumno alumno = buscar(rut);
        if (alumno != null){
            int indice = alumnos.indexOf(alumno);
            alumnos.set(indice, nuevoAlumno);
            return true;
        }
        return false;
    } 
    
}
