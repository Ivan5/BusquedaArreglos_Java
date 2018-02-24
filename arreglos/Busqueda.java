/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author conve
 */
public class Busqueda {
    //Busqueda secuencial no ordeana
    
    public int busquedaSecuencialNoOrd(int elemento,int[] a){
        int index = 0;
        boolean encontrado = false;
        while((index<a.length) || (encontrado == false)){
            if(a[index] == elemento){
                encontrado = true;
                return a[index];
            }
            index++;
        }
        return -1;
    }
    //Busqueda binaria
    public int busquedaBinaria(int elemento,int[] a){
        int inferior = 0;
        int superior = a.length-1;
        boolean encontrado = false;
        while((encontrado == false) &&(superior >= inferior)){
            int central = (inferior + superior)/2;
            if(a[central] == elemento){
                encontrado = true;
                return a[central];
            }else if(elemento>a[central]){
                inferior = central+1;
            }else{
                superior = central - 1;
            }
        }
        return -1;
    }
    
}
