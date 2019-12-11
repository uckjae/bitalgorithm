package WookDragon;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class BlackJack {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int count = sc.nextInt();
      int twentyone = sc.nextInt();
      int hap =0;
      ArrayList<Integer> temp = new ArrayList<Integer>();
      int[] num = new int[count];
      for(int i=0;i<num.length;i++) {
         num[i]=sc.nextInt();
         hap+=num[i];
      }
      for(int i=0;i<num.length-1;i++) {
         for(int j=i+1;j<num.length;j++) {
            if(hap-(num[i]+num[j])<=twentyone) {
               temp.add(hap-(num[i]+num[j]));
            }
         }
      }
      temp.sort(Comparator.reverseOrder());
      System.out.println(temp.get(0));
   }
}