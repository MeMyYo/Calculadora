/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.v02;

/**
 *
 * @author Jorge
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Menu.mostrar();
        Menu.comprar(Lector.validar());
        Carro.filtrar();
        
        
        /*testCalculator.resta();
        testCalculator.mult();
        testCalculator.div();*/
        
        //System.out.println(Carro.lista[0][0]);
    }
    
}
