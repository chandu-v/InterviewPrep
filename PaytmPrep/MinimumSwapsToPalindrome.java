package PaytmPrep;

import java.util.*;

public class MinimumSwapsToPalindrome {
     public static void main(String[] args) {
         String str = "abcbac";
         Scanner sc = new Scanner(System.in);
         String input = sc.next();
         while(input != "0"){

                int minSwap = minimumSwapsToPalindrome(input);
                System.out.println(minSwap == -1 ? "Impossible" : minSwap);
                input = sc.next();
         }
         String [] testCases = new String[]{"mamad",
            "asflkj",
            "aabb"};
         
     }

    private static int minimumSwapsToPalindrome(String str) {
        boolean canStringBePalindrome = canStringBePalindrome(str);
        // System.out.println(String.format("str: %s, canStringBePalindrome: %s", str, canStringBePalindrome));
        if(canStringBePalindrome) {
            int left = 0;
            int right = str.length()-1;
            int count = 0;
            while(left < right) {
                if(str.charAt(left) == str.charAt(right)) {
                    left++;
                    right--;
                }else {
                    int ptr = right-1;
                    while(ptr > left) {
                        if(str.charAt(ptr) == str.charAt(left)){
                            while(ptr < right){
                                count++;
                                System.out.println("Str Before Swap: "+str);
                                char temp = str.charAt(ptr);
                                char [] charArr = str.toCharArray();
                                charArr[ptr] = charArr[ptr+1];
                                charArr[ptr+1] = temp;
                                str = new String(charArr);
                                System.out.println("Str After Swap: "+str);
                                ptr++;
                            }
                            left++;
                            right--;
                            break;
                        } else {
                            ptr--;
                        }
                    }
                }
            }
            return count;
        }
        return -1;
    }

    private static boolean canStringBePalindrome(String str) {
        Map<Character,Integer> m = new HashMap<>();
        for(char c : str.toCharArray()) {
            if(m.containsKey(c)) m.put(c, m.get(c)+1);
            else m.put(c, 1);
        }
        if(str.length() % 2 == 0) {
            for (int entry : m.values()) {
                if(entry % 2 != 0) return false;
            }
        }else {
            int oddCount = 0;
            for(int entry : m.values()) {
                if(entry % 2 != 0) {
                    oddCount++;
                    if(oddCount > 1) return false;
                }
            }
        }
        return true;
    }
}
