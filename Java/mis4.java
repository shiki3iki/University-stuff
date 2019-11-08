import java.util.*;


public class mis4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int b, a;
        
        System.out.println("Comprobar si 2 numeros son iguales");
        
        System.out.println("Ingrese el primer numero: ");
        a = sc.nextInt();
         
        System.out.println("Ingrese el segundo numero: ");
        b = sc.nextInt();
        
        if(a == b){
            System.out.println("Son iguales");
        }
        else{
            System.out.println("No son iguales");   
        }      
    }
}
       
   

