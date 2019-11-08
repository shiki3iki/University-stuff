
import java.util.Scanner;

public class mis19 {

    public static void main(String[] args) {
                Scanner calendar=new Scanner (System.in);
        int dia1,mes1,año1;
 int dia2,mes2,año2;
 int total_dias;
 
 System.out.println ("Fecha 1:");
 System.out.print("Introduzca día: ");
 dia1=calendar.nextInt();
 System.out.print("Introduzca mes: ");
 mes1=calendar.nextInt();
 System.out.print("Introduzca año: ");
 año1=calendar.nextInt();
 System.out.println ("Fecha 2:");
 System.out.print("Introduzca día: ");
 dia2=calendar.nextInt();
 System.out.print("Introduzca mes: ");
 mes2=calendar.nextInt();
 System.out.print("Introduzca año: ");
 año2=calendar.nextInt();
 total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
 System.out.println ("Días de diferencia: " + total_dias);
       
    }
    
}
