

public class GenThree {
	public static void main(String[] args) {
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		int min = Math.min(a, b);
		int max = Math.max(a, b);

		int num1 = ((int)(Math.random()*(max -min)) + min);
		int num2 = ((int)(Math.random()*(max - min)) + min);
		int num3 = ((int)(Math.random()*(max - min)) + min);

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);

		System.out.println("The minimal generated number was " +(Math.min(Math.min(num1, num2), num3)));
	}
}
