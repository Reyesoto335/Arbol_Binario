package Arbol_Binario;

import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Vector;

public class ArbolBinario {
    NodoArbol raiz;

    public ArbolBinario(NodoArbol raiz) {
        this.raiz = raiz;
    }

    public ArbolBinario() {
    }
    
    public void AñadirNodo(int dato){
        NodoArbol nuevo = new NodoArbol(dato);
        if(raiz == null){
            raiz = nuevo;
        }else{
            NodoArbol aux = raiz;
            NodoArbol padre;
            while(true){
                padre=aux;
                if(dato<aux.dato){
                    aux = aux.hijoizquierdo;
                    if(aux==null){
                        padre.hijoizquierdo=nuevo;
                        return;
                    }
                }else{
                    aux = aux.hijoderecho;
                    if(aux==null){
                        padre.hijoderecho=nuevo;
                        return;
                    }
                }
            }
        }
    }
    
    public boolean estaVacia(){
        return this.raiz == null;
    }
    
    public void inOrden(NodoArbol root){
        
        if(root!=null){
            inOrden(root.hijoizquierdo);
            System.out.print(root.dato + ", ");
            inOrden(root.hijoderecho);
        }
    }
    
    public void preOrden(NodoArbol root){
        
        if(root!=null){
            System.out.print(root.dato + ", ");
            preOrden(root.hijoizquierdo);
            preOrden(root.hijoderecho);
        }
    }
     public void postOrden(NodoArbol root){
        
        if(root!=null){
            postOrden(root.hijoizquierdo); 
            postOrden(root.hijoderecho);
            System.out.print(root.dato + ", ");
        }
     }
  public void ImprimirArbolVertical(NodoArbol root, int distancia, TreeMap<Integer,Vector<Integer>> map)
    {
        if(root == null)
        {
            return;
        }
        Vector<Integer> keyValue = map.get(distancia);
        if(keyValue == null)
        {
            keyValue = new Vector<>();
            keyValue.add(root.dato);
        }
        else
            keyValue.add(root.dato);
        map.put(distancia, keyValue);
        ImprimirArbolVertical(root.hijoizquierdo, distancia-1, map);
        ImprimirArbolVertical(root.hijoderecho, distancia+1, map);
    
    }
     
     
    public void printVerticalOrder(NodoArbol root)
    {
        TreeMap<Integer,Vector<Integer>> m = new TreeMap<>();
        int distancia =0;
        ImprimirArbolVertical(root,distancia,m);
        for (Entry<Integer, Vector<Integer>> getentry : m.entrySet())
        {
            System.out.println(getentry.getValue());
        }
    }
}