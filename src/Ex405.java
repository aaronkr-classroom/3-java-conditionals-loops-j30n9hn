import java.util.Scanner;

public class Ex405 {
	public static void main(String[] args) {
		System.out.println("점수를 입력하세요 : ");

		Scanner z = new Scanner(System.in);

		int grade = z.nextInt();
		
		switch (grade / 10) {
			case 10 : 
			case 9 : 
				System.out.println("A 당신 천재");
				break;
			case 8 : 
				System.out.println("B ㄱㅊ");
				break;
			case 7 : 
				System.out.println("c ㅈㅇ");
				break;
			case 6 : 
				System.out.println("D  gg");
				break;
			default : 
				System.out.println("F  otl");
		}

	}
}
