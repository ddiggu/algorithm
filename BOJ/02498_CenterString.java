import java.io.IOException;
import java.util.Scanner;

public class CenterString {

	static char answerString[];

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);

		String A = scan.next();
		String B = scan.next();
		String C = scan.next();

		int A_COUNT = 0;
		int B_COUNT = 0;
		int C_COUNT = 0;

		answerString = new char[100000];

		for (int j = 0; j < A.length(); j++) {

			char a = A.charAt(j);
			char b = B.charAt(j);
			char c = C.charAt(j);

			if (a == b && b == c) {
				// 다 같은 경우
				answerString[j] = A.charAt(j);
			} else if (a == b && a != c) {
				// 일부가 같은 경우 (2개가 같은 경우)
				// A B가 같은 경우
				C_COUNT++;
				answerString[j] = a;
			} else if (b == c && b != a) {
				// B C가 같은 경우
				A_COUNT++;
				answerString[j] = b;
			}

			else if (c == a && c != b) {
				// A C가 같은 경우
				B_COUNT++;
				answerString[j] = c;
			}
		}

		for (int k = 0; k < A.length(); k++) {

			char a = A.charAt(k);
			char b = B.charAt(k);
			char c = C.charAt(k);

			if (a != b && b != c && c != a) {
				if (A_COUNT == max(A_COUNT, B_COUNT, C_COUNT)) {
					answerString[k] = a;
					B_COUNT++;
					C_COUNT++;
				} else if (B_COUNT == max(A_COUNT, B_COUNT, C_COUNT)) {
					answerString[k] = b;
					A_COUNT++;
					C_COUNT++;
				} else {
					answerString[k] = c;
					A_COUNT++;
					B_COUNT++;
				}
			}
		}

		for (int i = 0; i < A.length(); i++) {
			char a = A.charAt(i);
			char b = B.charAt(i);
			char c = C.charAt(i);

			int beforeMax = max(A_COUNT, B_COUNT, C_COUNT);
			int futureMax = -1;

			if (beforeMax == A_COUNT && b == c && c != a) {
				futureMax = max(A_COUNT - 1, B_COUNT + 1, C_COUNT + 1);

				if (futureMax <= beforeMax) {
					answerString[i] = a;
					B_COUNT++;
					C_COUNT++;
					A_COUNT--;
				} else {
					break;
				}
			} else if (beforeMax == B_COUNT && a == c && c != b) {

				futureMax = max(A_COUNT + 1, B_COUNT - 1, C_COUNT + 1);

				if (futureMax <= beforeMax) {
					answerString[i] = b;
					A_COUNT++;
					C_COUNT++;
					B_COUNT--;
				} else {
					break;
				}

			} else if (beforeMax == C_COUNT && a == b && c != b) {

				futureMax = max(A_COUNT + 1, B_COUNT + 1, C_COUNT - 1);

				if (futureMax <= beforeMax) {
					answerString[i] = c;
					A_COUNT++;
					B_COUNT++;
					C_COUNT--;
				} else {
					break;
				}

			}
		}

		String answer = "";
		for (int z = 0; z < A.length(); z++) {
			answer += answerString[z];
		}

		System.out.println(max(A_COUNT, B_COUNT, C_COUNT));
		System.out.print(answer);
	}

	public static int max(int a, int b, int c) {
		int max = a;
		if (max < b) {
			max = b;
		}
		if (max < c) {
			max = c;
		}
		return max;
	}

	public static int min(int a, int b, int c) {
		int min = a;

		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}

}