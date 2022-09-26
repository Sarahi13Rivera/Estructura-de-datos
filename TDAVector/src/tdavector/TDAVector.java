/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tdavector;

/**
 *
 * @author Sarahi Rivera 
 *26 de Septiembre de 2022
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
    vector[0]= dato; numElem ++;
    vector[1]= dato; numElem ++;
    vector[2]= dato; numElem ++;
    vector[3]= dato; numElem ++;
}
}
    
    

