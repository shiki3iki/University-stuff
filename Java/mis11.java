import java.util.*;


public class mis11 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int a;
        System.out.println("Decir las cifras de un numero entre 0 y 9999");  
        
        System.out.println("Ingrese el valor del numero: ");
        a = sc.nextInt();
        
       if (a != 0){
       int l = (int) (Math.log10(a) + 1);
        System.out.println("El numero tiene " + l + " cifras");
       }
       else{
        System.out.println("El numero es 0 y tiene 1 cifra");
       }
    }
}

       
   

