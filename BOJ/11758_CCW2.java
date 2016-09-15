import java.util.Scanner;

public class CCW2 {
	public static void main(String[] args) {
		// 첫째 줄에 P1의 (x1, y1), 둘째 줄에 P2의 (x2, y2), 셋째 줄에 P3의 (x3, y3)가 주어진다.
		// (-10,000 ≤ x1, y1, x2, y2, x3, y3 ≤ 10,000) 모든 좌표는 정수이다.
		// P1, P2, P3의 좌표는 서로 다르다.
		//
		// P1, P2, P3를 순서대로 이은 선분이 반시계 방향을 나타내면 1, 시계 방향이면 -1, 일직선이면 0을 출력한다.

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
