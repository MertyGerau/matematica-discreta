/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package entrega;
import static entrega.Entrega.Tema1;
import static entrega.Entrega.Tema2;
import static entrega.Entrega.Tema3;
import static entrega.Entrega.Tema4;

/**
 *
 * @author Usuario
 */
public class MainVerificar {
    public static void main(String[] args) {
            new MainVerificar().verificar();

    }
    
    public static void verificar(){
        System.out.println(Entrega.Tema1.exercici1(3) == 5);
    }
    
}

