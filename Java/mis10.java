import java.util.*;


public class mis10{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       int[] n = new int [3];
      
       System.out.println("Indicar cual es el numero mayor");
       
       System.out.println("Ingrese el primer numero: ");
       n[0] = sc.nextInt();
         
       System.out.println("Ingrese el segundo numero: ");
       n[1] = sc.nextInt();
       
       System.out.println("Ingrese el tercer numero: ");
       n[2] = sc.nextInt();
       
       for(int i = 0; i < 3; i++){
       for(int j = 0; j < 3; j++){
            if (n[j] < n[i]){
		int tmp = n[i];         
		n[i] = n[j];          
		n[j] = tmp;
            }
       }
       }
       for(int i = 0; i < 3; i++)
	{
            System.out.print(n[i]+ " ");
	}
    }
}