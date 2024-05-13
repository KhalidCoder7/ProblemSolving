/*Runtime = 6 ms
Beats 39.55% of users with Java
Memory = 44.63 MB
Beats 5.10% of users with Java*/
package EasyProblemSolutions.PalindromeNumber;
public class Solution {
    public static void main(String[] args) {
        int x = 1133111;
        isPalindrome(x);
    }

    public static boolean isPalindrome(int x) {
        boolean v = false;
            String str = String.valueOf(((x)));
            char[] chArr = str.toCharArray();
            for(int i = 0 ; i <chArr.length ;){
                for (int k = chArr.length ; k > 0 ;){
                    if (chArr[i]==chArr[k-1]){
                        v = true;
                        k--;
                        i++;
                    }
                    else {
                        v = false;
                         break;
                    }
                }
                break;
            }
        return v;
    }
}
