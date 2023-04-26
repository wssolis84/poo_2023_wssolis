/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import java.util.Scanner;

/**
 *
 * @author Santy
 */
public class Aplicacion {
    
    static Scanner leer= new Scanner(System.in);
    
    public static void main(String[] args) {
               Aplicacion.metodo3();
        
    }
    
    public static void metodo1(){
        int i=1;
        while(i<=5){
            System.out.println(i);
            i++;
        }
        
    }
    
    public static void metodo2(){
        
        for(int i=1;i<=5;i++){
            System.out.println(i);
        }        
    }
    
    public static void metodo3(){
        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<=5);
    }
}
