import java.util.Scanner;

public class Arithmetic{
	public static void main(String[] args){
		int a, b, c, d, e;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number for a:");
		a = input.nextInt();
		System.out.print("Enter a number for b:");
		b = input.nextInt();
		System.out.print("Enter a number for c:");
		c = input.nextInt();
		System.out.print("Enter a number for d:");
		d = input.nextInt();
		System.out.print("Enter a number for e:");
		e = input.nextInt();

	System.out.println("Value of a, "+a+"after adding 9 is: "+(a += 9));
	System.out.println("Value of b, "+b+"after subtracting 4 is: "+(b -= 4));
	System.out.println("Value of c, "+c+"after multiplying by 3 is: "+(c *= 3));
	System.out.println("Value of d, "+d+"after dividing by 2 is: "+(d /= 2));
	System.out.println("Remainder value assigned to e"+e+" after dividing e by 5 is: "+(e %= 5));

	}
}