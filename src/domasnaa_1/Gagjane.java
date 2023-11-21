package domasnaa_1;
import java.util.Scanner;
public class Gagjane {

	public static void main(String[] args) {
		double max=0,  pogodoci=0,procent=0;
		Scanner tastatura=new Scanner(System.in);
		System.out.println("Vnesete go maksimumot pogodoci na pitomecot");
		max=tastatura.nextDouble();
		System.out.println("Vnesete go brojot na pogodoci koi gi postignal pitomecot");
		pogodoci=tastatura.nextDouble();
		procent=pogodoci/max*10;
		if(pogodoci>max) {
			System.out.println("Pitomecot gi nadminal standardite,no za zal ne postoi takvo nesto");
			System.exit(0);}	
		procent=pogodoci/max*10;
		if(procent<5) {
		System.out.println("Pitomecot padnal");}
			  else if (procent>=5 && procent<=6) {
		System.out.println("Pitomecot pominal");}
			  else if (procent>=6 && procent <=10) {
		System.out.println("Pitomecot nadminal standart");
			  }
		}

}
