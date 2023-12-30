package trapezoidArea;
import java.util.Scanner;
public class v {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Въведи страна а =" );
		double a= input.nextDouble();
		System.out.println("Въведи страна c =" );
		double c= input.nextDouble();
		System.out.println("Въведи височина h =" );
		double h= input.nextDouble();
		double area=(a+c)*h/2.0;
		System.out.println("Лицето е "+ area+"c㎡");
				

	}

}
