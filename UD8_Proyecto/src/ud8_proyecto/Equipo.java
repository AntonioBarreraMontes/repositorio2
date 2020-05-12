
package ud8_proyecto;

import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class Equipo {
    private TreeMap<String, Futbolista> equipo = new TreeMap<>();
    
    
    public void aniadirJugador(String nombre,Futbolista Futbolista){
        equipo.put(nombre, Futbolista);
    }
    
    public void eliminarJugador(String nombre){
        equipo.remove(nombre);
    }
    public void eliminarEquipo(){
        equipo.clear();
    }
    public void mostrarEquipo(Equipo Equipo){
       Iterator itr = equipo.keySet().iterator();
       while(itr.hasNext()){
            Object key = itr.next();
            System.out.println(key);
        }            
    }
    public void contarJugador(Equipo Equipo){
        System.out.println("El equipo tiene esta cantidad de jugadores: "+ equipo.size());
    }
    
    public void comprobarJugador(String nombre){
        if (equipo.containsValue(nombre)==true){
            System.out.println("Ese jugador se encuentra en el equipo.");
        }else{
            System.out.println("Ese jugador no se encuentra en el equipo.");
        }
    
    }  
}
