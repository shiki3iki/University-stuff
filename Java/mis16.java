
import java.util.Scanner;

public class mis16 {

    public static void main(String[] args) {
        Scanner calendar=new Scanner (System.in);
        
      int dia,mes,año;
 System.out.print("Introduzca día: ");
 dia=calendar.nextInt();
 System.out.print("Introduzca mes: ");
 mes=calendar.nextInt();
 System.out.print("Introduzca año: ");
 año=calendar.nextInt();

 if(año==0)
 System.out.println("Fecha incorrecta");
 else{
 if(mes==2 && (dia>=1 && dia<=28))
     System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
 else{
 if((mes==4 || mes==6 || mes==9 || mes==11) &&
 (dia>=1 && dia<=30))
 System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
 else{
 if( (mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) &&
 (dia>=1 && dia<=31))
 System.out.println(dia + "/" + mes + "/" + año+": Fecha correcta");
 else
 System.out.println("Fecha incorrecta");
    
    }
    }
 }
    }
}
   
    
    


    
       
    
    
