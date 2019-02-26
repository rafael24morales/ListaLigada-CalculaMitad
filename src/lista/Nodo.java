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
public class Nodo<E> {
    private Nodo siguiente;
    private E dato;
    
    public Nodo getSiguiente(){
        return siguiente;
    }
    
    public Nodo(E dato){
        this.dato = dato;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    public E getDato(){
        return dato;
    }

}
