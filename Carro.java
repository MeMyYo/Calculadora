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

public class Carro {
    static int total;
    static int lista[][]= {{70000,5000,10000,150000,200000},{0,0,0,0,0}};
    
    public Carro(){
    }
    
    public static void almacenar(int cant, int choose){
       Carro.lista[1][choose-1]= lista[1][choose-1]+cant;
       
    }
    
    public static void almacenarTotal(int a){
        Carro.total=a;
    }
    /*public static void filtrar(){
        CalculadoraV02 test = new CalculadoraV02(0,0);
        int acum=0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 5; j++) {
                test.set1(acum);
                test.set2(lista[i][j]);
                acum= CalculadoraV02.suma();
            }
        }
        
        System.out.println("Monto total en el carro es de: $"+acum);
    } */
    
   public static void filtrar(){
       int acum=0;
        CalculadoraV02 test = new CalculadoraV02(0,0);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < lista[1][i]; j++) {
                test.set1(acum);
                test.set2(lista[0][i]);
                acum= CalculadoraV02.suma();
            }
        }
        almacenarTotal(acum);
        
    } 
}
