import java.util.Scanner;

public class SquareRoot {
	public static double sqr(int num) {
		if(num < 0) {
			throw new IllegalArgumentException("Nan");
		}
		double tmp = 0;
		double s = num/2;
		while((tmp-s) != 0) {
			tmp = s;
			s = (tmp+(num/tmp))/2;
		}
		return s;
	}
	public static void main(String[] args) {
		System.out.format("Enter number:");
		Scanner input = new Scanner(System.in);
		int in = input.nextInt();
		System.out.format("Result: %.2f\n", sqr(in));
		System.out.format("Result: %.2f\n", Math.sqrt(in));
		input.close();
	}
}
