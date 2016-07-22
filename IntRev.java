import java.util.Scanner;

public class IntRev{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter the number:");
		int number = s.nextInt();
		String string = "";
		int[] num = new int[(int) (Math.log10(number) + 1)];
		int one = 0;
		for (int i = 0; i < num.length; i++) {
			while (number > 0) {
				one = number % 10;
				num[i] = one;
				string+=num[i];
				number = number / 10;
				break;
			}
			System.out.println(string);
		}
	}
	

