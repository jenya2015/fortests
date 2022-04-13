import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Введите стороны первого конверта:");
	    if (sc.hasNextInt()) {
	        int a = sc.nextInt();
	        if (sc.hasNextInt()) {
	            System.out.println("Введите стороны второго конверта:");
	            int b = sc.nextInt();
	            if (sc.hasNextInt()) {
	                int c = sc.nextInt();
	                if (sc.hasNextInt()) {
	                    int d = sc.nextInt();
	                    System.out.println("Стороны первого конверта: "+a+" и "+b+" .");
	                    System.out.println("Стороны второго конверта: "+c+" и "+d+" .");
	                    if ((a<c) && (b<d))
	                    {
	                        System.out.println("Результат:");
	                        System.out.println("Первый конверт можно вложить во второй.");
	                    }
	                    else
	                    {
	                        System.out.println("Результат:");
	                        System.out.println("Первый конверт нельзя вложить во второй.");
	                    }
	                }
	                else {System.out.println("Ошибка");}
	            }
	            else {System.out.println("Ошибка");}
	        }
	        else {System.out.println("Ошибка");}
	    }
	    else {System.out.println("Ошибка");}
	    
	}
}
