
package ud8_proyecto;

import java.util.Scanner;
public class TestEquipo {
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Equipo eq1= new Equipo();
        int contador=0;
            System.out.println("Este es el menú para usar la aplicación");
            System.out.println("Solo necesitaras escribir el número de lo que deseas hacer");
            
        while (contador==0){
            System.out.println(" ");//Comentario de prueba de enlace con GitHub
            System.out.println("---------------------------------------------------");
            System.out.println("1 Añadir Jugador");
            System.out.println("2 Eliminar Jugador");
            System.out.println("3 Mostrar todos los jugadores");
            System.out.println("4 Saber si un jugador se encuentra en un equipo");
            System.out.println("5 Saber cuantos jugadores tiene un equipo");
            System.out.println("6 Elimina todos los jugadores del equipo");
            System.out.println("7 Salir de la aplicación");
            System.out.println("---------------------------------------------------");
            System.out.println(" ");
            
            int menu = sc.nextInt();
            String dorsal;
            String nombre;
            String posicion;
            int x=1;
            switch(menu){
                
                case 1:
                    System.out.println("Escribe su Dorsal");
                    dorsal =sc.nextLine();
                    dorsal =sc.nextLine();
                    System.out.println("Escribe su Nombre");
                    nombre = sc.nextLine();
                    System.out.println("Escribe su demarcación");
                    posicion=sc.nextLine();
                   
                    
                    Futbolista F = new Futbolista(dorsal, nombre, posicion);
                    eq1.aniadirJugador(nombre,F);
                    break;
                    
                case 2:
                    System.out.println("Escrie el nombre del jugador que quieres eliminar");
                    nombre=sc.nextLine();
                    nombre=sc.nextLine();
                  
                    eq1.eliminarJugador(nombre);
                    break;
                case 3:
                    
                    eq1.mostrarEquipo(eq1);
                    break;
                    
                case 4:
                    System.out.println("Dime el nombre del jugador a buscar");
                    nombre=sc.nextLine();
                    nombre=sc.nextLine();
                    
                    eq1.comprobarJugador(nombre);
                    break;
                 
                case 5:
                    eq1.contarJugador(eq1);
                    break;
                
                case 6:
                    eq1.eliminarEquipo();
                    System.out.println("Se han borrado los jugadores satisfactoriamente");
                   break;
                 
                case 7:
                    contador=1;
                    break;
                    
                default:
                    System.out.println("Esa no es una opción válida");
                    
            }
        }
           
    }
}
