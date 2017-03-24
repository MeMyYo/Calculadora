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
public class Menu {
    
    public void menu(){
        
    }
    public static void mostrar(){
        System.out.println("Tenemos estos productos a la venta:");
        System.out.println("1)    Pantalla para computador:                                         $70.000");
        System.out.println("2)    Mouse:                                                            $5.000");
        System.out.println("3)    Teclado mecanico:                                                 $10.000");
        System.out.println("4)    Cpu basica:                                                       $150.000");
        System.out.println("5)    Set Pc (Pantalla, mouse, teclado, Cpu Basica, silla y escritorio  $200.000");
        
        System.out.println("Ingrese una opcion 1-5, cualquier otra opcion será denegada");
    }
    
    public static void cantidad(int choose){
        System.out.println("");
        System.out.println("Escriba la cantidad que desea del producto N°"+choose);
    }
    public static void pagar(){
        System.out.println("El monto total actual es de: $"+Carro.total);
        Carro.filtrar();
        System.out.println("");
        System.out.println("Ingrese el monto con el que desea cancelar el costo");
        int monto= Lector.validar();
        if (monto<=Carro.total){
            System.out.println("Error, monto ingresado: $"+monto+" monto requerido: $"+Carro.total);
            pagar();
        }else{System.out.println("Correcto, su vuelto es de: $"+(monto-Carro.total));
        }
    }
    public static void comprar(int choise){
        
        cantidad(choise);
        int cant=Lector.validar();
        Carro.almacenar(cant,choise);
        Carro.filtrar();
        System.out.println("El monto total actual es de: $"+Carro.total);        
        System.out.println("¿Desea seguir comprando?");
        System.out.println("1)      Si");
        System.out.println("Cualquier otro número)      Iniciar el pago");
        if (Lector.validar()==1) {
            mostrar();
            comprar(Lector.validar());
        }else{pagar();}
                            
        
            
    }
}
