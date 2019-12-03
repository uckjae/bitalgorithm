package hyeonsFather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	
	public static int blackJack(int[] cards,int m) {
		int maxSum = 0;
		
		for(int i=0; i<=cards.length-3; i++) {
			for(int j=i+1; j<=cards.length-2;j++) {
				for(int k=j+1; k<=cards.length-1;k++) {
					int sum = cards[i] + cards[j] + cards[k];
					maxSum = (sum<=m && sum>maxSum) ? sum : maxSum;
				}
			}
		}
		
		return maxSum;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int[] firstLine = new int[2];
		firstLine = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int[] cards = new int[firstLine[0]];
		
		cards = Arrays.stream(br.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int answer = blackJack(cards, firstLine[1]);
		
		System.out.println(answer);
	}
}
