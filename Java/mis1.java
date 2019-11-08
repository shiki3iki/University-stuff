import java.util.*;


public class mis1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double a,b,c,x,y,d;
        System.out.println("Resolver ecuacion de 2do grado");  
        
        System.out.println("Ingrese el valor de a: ");
        a = sc.nextInt(); 
        
        System.out.println("Ingrese el valor de b: ");
        b = sc.nextInt(); 
        
        System.out.println("Ingrese el valor de c: ");
        c = sc.nextInt(); 
        
       //Calculo del determinante
       d = ((b*b)-4*a*c);
       
       //Comprobamos si se puede solucionar
       
    if (d<0){
       System.out.println("¡La operacion no tiene solucion!");
    }
    else{
       x = (-b+Math.sqrt(d))/(2*a);
       y = (-b-Math.sqrt(d))/(2*a);
       System.out.println("Respuesta 1: " + x);
       System.out.println("Respuesta 2: " + y);
    }
    }
}

       
   

