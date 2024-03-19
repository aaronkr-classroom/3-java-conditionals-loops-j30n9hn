import java.util.Scanner;

public class Ex403 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 : ");

		Scanner z = new Scanner(System.in);

		int grade = z.nextInt();

		if (grade >= 90) {
			System.out.println("A 당신 천재");
		} else if (grade >= 80) {
			System.out.println("B ㄱㅊ");
		} else if (grade >= 70) {
			System.out.println("c ㅈㅇ");
		} else if (grade >= 60) {
			System.out.println("D  gg");
		} else {
			System.out.println("F  otl");
		}

	}
}
