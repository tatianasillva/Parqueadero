/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parqueaderoo;

/**
 *
 * @author Estudiantes
 */
public class Propietario {
    
     int nivelalcohol;
      String genero;
       boolean ebrio(){
        
          if (nivelalcohol>1){
              return true;
          } else {
              return false;
          }
          
            boolean persona() {
       

        if (genero == true){
            
            System.out.println("Mujer");
            return true;

        } else {
            
            System.out.println("Hombre");
            return false;
        }

    } 
           
           
      }

