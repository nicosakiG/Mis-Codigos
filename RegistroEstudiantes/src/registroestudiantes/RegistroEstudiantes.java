/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registroestudiantes;
import java.util.Scanner;
/**
 *
 * @author nicol
 */
public class RegistroEstudiantes {

    /**
     * @param args the command line arguments
     */
    public void main(String[] args) {
        // TODO code application logic here
        Scanner teclado=new Scanner(System.in);
        int opcion;
        do{
            System.out.println("1agregar");
            opcion=teclado.nextInt();
            
            switch (opcion){
                case 1:
                
                case 2:
                    Escuela.mostrarDatos();
                            
            }
            
        }while(opcion!=5);
        
     
            
        }
    }
    

