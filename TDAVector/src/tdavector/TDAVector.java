/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdavector;

/**
 *
 * @author invitado
 */
public class TDAVector {

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
    for (int numElem = 0; numElem <tamaño; numElem++) {
   vector[0]= dato; numElem ++;
    vector[1]= dato; numElem ++;
    vector[2]= dato; numElem ++;
    vector[3]= dato; numElem ++; 
    }
   System.out.println("El numero que accediste esta mal");
   return ;
 
}
   
}
