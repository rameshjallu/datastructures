package chapter1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Solution {

   private static final Scanner scanner = new Scanner(System.in);
    static List<Integer> list = new ArrayList<>();
    
   

    public static void main(String[] args) {

        int tests = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int testsItr = 0; testsItr < tests; testsItr++) {
            int llistCount = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < llistCount; i++) {
                int llistItem = scanner.nextInt();
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                list.add(llistItem);

            }

            printDups(list);
        }

        scanner.close();
    }

    public static void printDups(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list1 = new ArrayList<>();
        boolean b=true;
        
        for(int k:list){
            if (map.containsKey(k)) {

                list1.add(k);
                b=false;

            } else {
                map.put(k, 1);
            }
        }
        
        for(int j:list1){
            System.out.println(j);
        }
        
        
        if(b){
            System.out.println("-1");
        }
    }
    
}