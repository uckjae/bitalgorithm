package Won;
import java.util.Scanner;

public class BlackJack {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		int[] card = new int[N];
		int sum = 0;
		int high = 0;
		for(int i = 0; i < N; i++) {
			card[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = i + 1; j < N; j++) {
				for(int k = j + 1; k < N; k++) {
					sum = card[i] + card[j] + card[k];
					if(sum <= M && sum > high) {
						high = sum;
					}
				}
			}
		}
		System.out.println(high);
	}
}
