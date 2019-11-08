import java.util.*;


public class mis14 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a;
        
        System.out.println("Comprobar la nota de 1 a 10");
        
        System.out.println("Ingrese su nota: ");
        a = sc.nextInt();
       
        if(a <= 0 && a > -1){
            System.out.println("Insuficiente");
        }
        else if(a <= 6 && a > 4){
          System.out.println("Suficiente");  
        }
        else if(a <= 10 && a > 6){
          System.out.println("Bien");  
        }
        else{
          System.out.println("Numero invalido");  
        }
    }
}
       
   

