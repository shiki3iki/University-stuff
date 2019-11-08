import java.util.*;

public class mis36 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       double e,a,c=0,d=0,am=0,em=0, m=0, ma=0; 
       
       for(int i = 1; i < 5; i++){
           System.out.println("Ingrese la altura del alumno "+i);
           a = sc.nextDouble();
           System.out.println("Ingrese la edad del alumno "+i);
           e = sc.nextInt();
           
           if(e >= 18){
               m++;
               if(a >= 1.75){
                   ma++;
               }
               else{}
               c = c+e;
               d = d+a;
               am++;
               em++;
           }
           else{
               if(a >= 1.75){
                   ma++;
               }
               else{}
               c = c+e;
               d = d+a;
               am++;
               em++;
           }
       }
       d = d/am;
       c = c/em;
       System.out.println("Hay "+m+" alumnos mayores de 18");
       System.out.println("Hay "+ma+" alumnos mas altos que 1.75");
       System.out.println("La media de edad es: "+c);
       System.out.println("La media de altura es: "+d);
    }
}
       
   

