import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class bigNumber
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("a: ");
		int a = input.nextInt();
		
		System.out.printf("b: ");
		int b = input.nextInt();
		
		System.out.println("büyük sayı " + Math.max(a, b));
	}
}