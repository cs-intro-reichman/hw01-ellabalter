


public class GenThree {
public static void main(String[] args) {

	int a = Integer.parseInt(args[0]);
	int b = Integer.parseInt(args[1]);

	if (a > b) {
		int temp = a;
		a = b;
		b = temp;
}
	System.out.println(((int)(Math.random()*(b - a )) + a));
	System.out.println(((int)(Math.random()*(b - a )) + a));
	System.out.println(((int)(Math.random()*(b - a )) + a));
}}
