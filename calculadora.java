/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class calculadora {
    int num1;
    int num2;
    static Scanner leer = new Scanner (System.in);
    /**
     *
     * @param value1
     * @param value2
     */
    public calculadora(int value1, int value2){
        num1=value1;
        num2=value2;
    }
    
    public void create(){
        
    }
    
    public static String leer(){
        System.out.println("Ingrese un numero entero");
        String ans= leer.nextLine();
        return ans;
    }
    
    public static int validar(){
        boolean i=false;
        int var=0;
        while(i==false){
            try{
            var=Integer.parseInt(leer());
            i=true;
            }catch(Exception e){
                System.out.println("Error, ingrese solo numeros enteros (no espacios, simbolos ni vacio)");
            }
            /*if ((var>=0) || (var<0)) {
                i=true;
                System.out.println("Numero aceptado");
                return var;
            }else{
                System.out.println("Ingrese un NUMERO ENTERO");
            }*/
        }
        return var;
    }
    
    public void suma(){
        System.out.println("la suma entre "+num1+" y "+"num2 es: "+(num1+num2));
    }
    
    public void resta(){
        System.out.println("la resta entre "+num1+" y "+"num2 es: "+(num1-num2));
    }
    
    public void mult(){
        System.out.println("la multiplicación entre "+num1+" y "+num2+" es: "+(num1*num2));
    }
    
    public void div(){
        if (num2==0){
            System.out.println("La división por cero no se encuentra definida");
        }else{
            System.out.println("la division entre "+num1+" y "+num2+" es: "+(num1/num2));
        }
        
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       /* String a = "bg";
        int b= Integer.parseInt(a);*/
        calculadora testCalculator = new calculadora(validar(),validar());
        testCalculator.suma();
        testCalculator.resta();
        testCalculator.mult();
        testCalculator.div();
    }
    
}
