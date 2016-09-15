import java.util.Scanner;

public class CCW2 {
	public static void main(String[] args) {
		// ù° �ٿ� P1�� (x1, y1), ��° �ٿ� P2�� (x2, y2), ��° �ٿ� P3�� (x3, y3)�� �־�����.
		// (-10,000 �� x1, y1, x2, y2, x3, y3 �� 10,000) ��� ��ǥ�� �����̴�.
		// P1, P2, P3�� ��ǥ�� ���� �ٸ���.
		//
		// P1, P2, P3�� ������� ���� ������ �ݽð� ������ ��Ÿ���� 1, �ð� �����̸� -1, �������̸� 0�� ����Ѵ�.

		Scanner scan = new Scanner(System.in);

		int x1 = scan.nextInt();
		int y1 = scan.nextInt();

		int x2 = scan.nextInt();
		int y2 = scan.nextInt();

		int x3 = scan.nextInt();
		int y3 = scan.nextInt();

		int result = (x2 - x1) * (y3 - y1) - (y2 - y1) * (x3 - x1);

		// x2 - x1, y2 - y1
		// x3 - x1, y3 - y1

		// 1 1
		// 3 3
		// 5 5
		
		// 3 - 1, 3 - 1
		// 5 - 1, 5 - 1

		int answer = 0;

		if (result < 0) {
			answer = -1;
		} else if (result > 0) {
			answer = 1;
		}

		System.out.println(answer);

		scan.close();
	}
}
