import java.util.*;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        int n = s.length();
        String t = s + s; 
        
        int left = 0;
        int maxSum = 0;
        int currentSum = 0;
        
        Set<Character> set = new HashSet<>();
        
        for (int right = 0; right < t.length(); right++) {
            
            while (set.contains(t.charAt(right)) || (right - left + 1) > n) {
                char ch = t.charAt(left);
                set.remove(ch);
                currentSum -= (ch - 'a' + 1);
                left++;
            }
            
            char ch = t.charAt(right);
            set.add(ch);
            currentSum += (ch - 'a' + 1);
            
            maxSum = Math.max(maxSum, currentSum);
        }
        
        System.out.println(maxSum);
    }
}
