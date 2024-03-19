import java.util.Scanner;

public class Ex407 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int sum = 0;

		System.out.println("5개의 숫자를 입력하세요 : ");

		int num[] = new int[5];
		

		for (int n = 0; n < 5; n++) {
			num[n] = s.nextInt();
		}

		for (int i:num) {
			sum += i;
		}
		System.out.println("합계 : " + sum);

	}
}
