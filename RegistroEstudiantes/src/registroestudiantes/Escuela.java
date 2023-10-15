/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registroestudiantes;
import java.util.ArrayList;
/**
 *
 * @author nicol
 */
public class Escuela {
    private ArrayList<Estudiantes> listaEstudiantes = new ArrayList<Estudiantes>() ;

    public Escuela() {
    }

    public ArrayList<Estudiantes> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public void setListaEstudiantes(ArrayList<Estudiantes> listaEstudiantes) {
        this.listaEstudiantes = listaEstudiantes;
    }
    //MANTENEDOR
    
    //AGREGAR
    public String agregarEstudiante(Estudiantes p){
        try{
            listaEstudiantes.add(p);
            return "Estudiante agregado";
            
        }catch(Exception e){
            return "Error: "+e.toString();
        }
    }
    public String agregarEstudiante(Basica p){
        try{
            listaEstudiantes.add(p);
            return "Estududiante agregado";
        }catch(Exception e){
            return "Error: "+e.toString();
        }
    }
    //MOSTRAR
    public void mostrarDatos(){
        for(Estudiantes temp:listaEstudiantes){
            System.out.println(temp.toString());        
        }
    }
    //ELIMINAR 
    public boolean eliminarEstudiante(String rut){
        for(Estudiantes temp:listaEstudiantes){
            if(temp.getRut().equals(rut)){
                listaEstudiantes.remove(temp);
                return true;
            }
        }return false;
    }
    //BUSCAR
    public Estudiantes buscarEstudiantes(String rut){
        for(Estudiantes temp:listaEstudiantes){
            if(temp.getRut().equals(rut)){
                return temp;
            }
        }
        System.out.println("Estudiante no encontrado");
        return new Media();
        
    }
    
}


