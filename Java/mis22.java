import java.util.*;


public class mis22 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int a, u, d;
        
        System.out.println("Convertir numeros a palabras");
        
        System.out.println("Ingrese el numero: ");
        a = sc.nextInt();
        
        u = a % 10;
        d = a / 10;
        
        switch(d){
            case 0:
            System.out.print("");
            break;
            
            case 1:
            System.out.print("Diez");
            break;
            
            case 2:
            System.out.print("Veinte");
            break;
            
            case 3:
            System.out.print("Treinta");
            break;
            
            case 4:
            System.out.print("Cuarenta");
            break;
            
            case 5:
            System.out.print("Cincuenta");
            break;
            
            case 6:
            System.out.print("Sesenta");
            break;
            
            case 7:
            System.out.print("Setenta");
            break;
            
            case 8:
            System.out.print("Ochenta");
            break;
            
            case 9:
            System.out.print("Noventa");
            break;
        }
            System.out.print(" y ");
            
        switch(u){
            case 0:
            System.out.println("");
            break;
            
            case 1:
            System.out.println("uno");
            break;
            
            case 2:
            System.out.println("dos");
            break;
            
            case 3:
            System.out.println("tres");
            break;
            
            case 4:
            System.out.println("cuatro");
            break;
            
            case 5:
            System.out.println("cinco");
            break;
            
            case 6:
            System.out.println("seis");
            break;
            
            case 7:
            System.out.println("siete");
            break;
            
            case 8:
            System.out.println("ocho");
            break;
            
            case 9:
            System.out.println("nueva");
            break;
        }
    }
}

       
   

