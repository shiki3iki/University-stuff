import java.util.*;


public class mis35 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       int a,b=0,c=0;
       
       for(int i = 0; i < 9; i++){
           System.out.println("Ingrese el sueldo: ");
           a = sc.nextInt();
           
           if(a > 1000){
               c = a+c;
               b++;
           }
           else{
           }
       }
       System.out.println("El total de los sueldos es: "+c);
       System.out.println("Existen "+b+" sueldos mayores a 1000");
    }
}
       
   

