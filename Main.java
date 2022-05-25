package Arbol_Binario;

import java.util.Scanner;

public class ejecutor {
    
    static Scanner sc = new Scanner(System.in);
    static ArbolBinario arbol = new ArbolBinario();
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        int eleccion;
        boolean salir = false;
        while(salir != true){
            System.out.println("\nElija lo que desea hacer:"
                    + "\n1. Añadir un nuevo nodo"
                    + "\n2. Mostrar si está vacío"
                    + "\n3. Ordenar en orden"
                    + "\n4. Ordenar en pre orden"
                    + "\n5. Ordenar en post orden"
                    + "\n6. Imprimir en orden vertical"
                    + "\n7. Salir");
            eleccion = sc.nextInt();
        
        switch(eleccion){
            case 1: System.out.println("Ingrese el número que desea añadir");
                    int dato = sc.nextInt();
                    arbol.AñadirNodo(dato);
            break;
            case 2: if(arbol.estaVacia()){
                System.out.println("El árbol está vacía");
                }
            break;
            case 3: if(!arbol.estaVacia()){
                arbol.inOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 4: if(!arbol.estaVacia()){
                arbol.preOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 5: if(!arbol.estaVacia()){
                arbol.postOrden(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            //es este
            case 6: if(!arbol.estaVacia()){
                arbol.printVerticalOrder(arbol.raiz);
            }else{
                System.out.println("El árbol está vacío");
            }
            break;
            case 7: salir = true;
            break;
        }
        }
    }
    
}