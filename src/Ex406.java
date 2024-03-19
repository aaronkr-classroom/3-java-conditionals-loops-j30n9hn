import java.util.Scanner;

public class Ex406 {
	public static void main(String[] args) {
		for (int i = 1; i < 10; i++) {
			System.out.println(i + "구구단 : ");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + "X" + j + "=" + i * j);
			}
		}
	}
}
