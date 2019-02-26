package lista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rafaelm
 */
public class Principal {
    
    public static void main(String[] args) {
        ListaLigada<Integer> lista = new ListaLigada<>();
        
        lista.insert(9);
        lista.insert(3);
        lista.insert(4);
        lista.insert(8);
        lista.insert(10);
        lista.insert(21);
        lista.insert(34);
        
        Integer resultado = lista.impimirMitad();
        
        System.out.println("El contenido de la mita de la lista es: " + resultado);
        
    }
    
}
