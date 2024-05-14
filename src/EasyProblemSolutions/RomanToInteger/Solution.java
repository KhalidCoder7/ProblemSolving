/*Runtime = 2 ms
Beats 86.19% of users with Java
Memory = 44.34 MB*/
package EasyProblemSolutions.RomanToInteger;

public class Solution {
    public static void main(String[] args) {
    String s = "IIIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        char[] chArr = s.toCharArray();
        int output = 0;
        for (int i = 0; i < chArr.length; i++) {
            switch (chArr[i]) {
                case 'I':
                    if (i < chArr.length - 1 && chArr[i + 1] == 'V') {
                        i++;
                        output += 4;
                    } else if (i < chArr.length - 1 && chArr[i + 1] == 'X') {
                        i++;
                        output += 9;
                    } else {
                        output += 1;
                    }
                    break;
                case 'V':
                    output += 5;
                    break;
                case 'X':
                    if (i < chArr.length - 1 && chArr[i + 1] == 'L') {
                        i++;
                        output += 40;
                    } else if (i < chArr.length - 1 && chArr[i + 1] == 'C') {
                        i++;
                        output += 90;
                    } else {
                        output += 10;
                    }
                    break;
                case 'L':
                    output += 50;
                    break;
                case 'C':
                    if (i < chArr.length - 1 && chArr[i + 1] == 'D') {
                        i++;
                        output += 400;
                    } else if (i < chArr.length - 1 && chArr[i + 1] == 'M') {
                        i++;
                        output += 900;
                    } else {
                        output += 100;
                    }
                    break;
                case 'D':
                    output += 500;
                    break;
                case 'M':
                    output += 1000;
                    break;
            }
        }
        return output;
    }
    }
