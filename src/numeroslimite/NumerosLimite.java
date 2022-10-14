package numeroslimite;

import java.util.Scanner;

public class NumerosLimite {
    
    public static void main(String[] args) {
       
        //tenemos un límite hasta el que tenemos que contar
        //ingresar ese límite
        
        System.out.println("Ingrese el límite hasta el que quiere contar");
        Scanner teclado = new Scanner (System.in);
        int limite = teclado.nextInt();
        int cont = 1;
        
        while (cont <= limite) {
            System.out.println(cont);
            cont = cont + 1;
            
        }
        
        
    }
    
}
