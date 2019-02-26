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
public class ListaLigada<E> {
    private Nodo head;
    private Nodo siguiente;
    private Nodo siguienteEn2;
    
    /**
     * Éste método sirve para la inserción de Objetos en la lista
     *@param dato recibe el Objeto a ingresar en la lista ligada
     */
    public void insert(E dato){
        if(head==null){
            this.head = new Nodo(dato);
        }else{
            siguiente = head;
            while(siguiente.getSiguiente()!=null){
                siguiente = siguiente.getSiguiente();
            }
            siguiente.setSiguiente(new Nodo(dato));
        }
    }
    
    /**
     *Éste método solo imprime los elementos de la lista
     */
    public void imprimir(){
        if(head==null){
            System.out.println("no hay nada");
        }else{
            siguiente = head;
            while(siguiente != null){
                System.out.println(siguiente.toString());
                siguiente = siguiente.getSiguiente();
            }
        }
    }
    
    /**
     *Éste método retorna el Objeto que se encuentra en la mitad del arreglo al primer recorrido
     */
    public E impimirMitad(){
        //Al ser head  null, retorna null pues la lista no contiene nada
         if(head == null){
            return null;
        }else{
             /*En caso que sí se contenga información en la lista, se inicializan los punteros
             tanto de siguiente como siguienteEn2.
             */
            siguiente = head;
            siguienteEn2 = head;
            //al evaluar si siguienteEn2 aún no llega al final (no apunta a null) se recorrerá la lista
            while(siguienteEn2.getSiguiente() != null){
                //el puntero de siguiente avanzará en paso de 1 en 1
                siguiente = siguiente.getSiguiente();
                //el puntero siguienteEn2 avanzará en paso de 2 en 2
                siguienteEn2 = siguienteEn2.getSiguiente().getSiguiente();    
            }
            /*Al terminar el ciclo (siguienteEn2 apunta a null) quiere decir que "siguiente" 
            quien avanzaba en paso 1, se quedó a la mitad de la lista */
            return (E) siguiente.getDato();
        }
    }
    
}
