import java.util.Scanner;

public class Ex404 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("당신의 나이가 뭐에요? ");
		int age = s.nextInt();
		System.out.println("\n당신의 키가 몇 CM이에요? ");

		int height = s.nextInt();

		if (age > 15 ) {
			if (height > 140) {
				System.out.println("T 탈 수 있어요");
			} else {
				System.out.println("키 때문에 못타요");
			}
		} else {
			System.out.println("나이 때문에 못타요");
		}

	}
}
