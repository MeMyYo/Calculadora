/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.v02;


public class CalculadoraV02 {
    static int num1;
    static int num2;
    
    
    /**
     *
     * @param value1
     * @param value2
     */
    public CalculadoraV02(int value1, int value2){
        num1=value1;
        num2=value2;
    }
    
    public void set1(int n){
        this.num1=n;
    }
    
    public void set2(int n){
        this.num2=n;
    }
     
    
    
    public static int suma(){
        //System.out.println("la suma entre "+num1+" y "+num2+" es: "+(num1+num2));
        return num1+num2;
    }
    
    public void resta(){
        System.out.println("la resta entre "+num1+" y "+num2+" es: "+(num1-num2));
    }
    
    public void mult(){
        System.out.println("la multiplicación entre "+num1+" y "+num2+" es: "+(num1*num2));
    }
    
    public void div(){
        if (num2==0){                                                           //Preguntamos a la maquina si la variable es cero para evitar errores
            System.out.println("La división por cero no se encuentra definida");//Entonces si es cero se muestra un "error"
        }else{
            System.out.println("la division entre "+num1+" y "+num2+" es: "+(num1/num2));
        }
        
        
    }

    
}
