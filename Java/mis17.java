
import java.util.Scanner;

public class mis17 {

    public static void main(String[] args) {
               Scanner calendar=new Scanner (System.in);
int dia,mes,año;
 System.out.print("Introduzca día: ");
 dia=calendar.nextInt();
 System.out.print("Introduzca mes: ");
 mes=calendar.nextInt();
 System.out.print("Introduzca año: ");
 año=calendar.nextInt();

 dia ++;
 if (dia >= 30)
 {
 dia = 1;
 mes ++;
 if (mes >= 12)
 {
 mes = 1;
 año ++;
 }
 }
 if (año == 0)
 año = 1;
 
 System.out.println (dia + "/"+ mes + "/" + año);
    }  
}
