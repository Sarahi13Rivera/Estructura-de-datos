/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class TDAVector {
    public static void main(String[] args) {
        
    }
private int vector[];
private byte tamaño, numElem;

/* Constructores
-Es un metodo publico 
-Siempre se lllama igual que la clase
-No tiene tipo de valor de retorno
-Su trabajo se encarga de iniacializar los productos 
*/
public TDAVector() {
    tamaño = 5;
    vector = new int [tamaño];
    numElem =0;
}
public TDAVector( byte tamaño){
    this.tamaño=tamaño;
vector = new int [tamaño];
numElem= 0;
}
public void agregarElementoFinal(int dato){  
if(numElem < tamaño){
   vector[numElem]= dato; 
   numElem++;
    }
   
 
}
   
}

