public class Coins {
public static void main(String[] args) {

	int numOfCents = Integer.parseInt(args[0]);
	int quarter = numOfCents / 25 ;
	int cent = (numOfCents - (quarter * 25)) ;

    System.out.println("Use "  + quarter + " quarters and " + cent + " cents");

	}
}
	  	
	

	