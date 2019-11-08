import java.util.*;


public class mis34 {
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       double a,c=0,p=0,n=0,mp=0, mn=0, tc=0;
       
       for(int i = 0; i < 9; i++){
           System.out.println("Ingrese un numero: ");
           a = sc.nextInt();
           
           if(a == 0){
               c = c+a;
               tc++;
           }
           else if(a > 0){
               p = p+a;
               mp++;
           }
           else{
               n = n+a;
               mn++;
           }
       }
       p = p/mp;
       n = n/mn;
       System.out.println("Se ingresaron "+tc+" de ceros");
       System.out.println("Se ingresaron "+mp+" positivos y su media es "+p);
       System.out.println("Se ingresaron "+mn+" negativos y su media es "+n);
    }
}
       
   

