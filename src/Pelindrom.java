package src;

import java.util.Arrays;
import java.util.Scanner;

public class Pelindrom {

    public static boolean isOdd(String str) {
        return str.length() % 2 == 1;
    }

    public static String reverseToString(String str) {

        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("값이 존재하지 않습니다.");
        }


        // += 는 String 객체를 재생성 해야 하므로 내부 배열을 사용하므로 효율적임
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();


    }

    // 개선
    public static boolean isPalindrom2(String input) {
        int left = 0, right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left++) != input.charAt(right--)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrom(String input) {
        int len = input.length();
        String ff = null;
        String ed = null;
        // 홀수
        if (isOdd(input)) {
            // abcde >> len 5  > len /2 >> 2  (0,1,2)
            ff = input.substring(0, len / 2);
            ed = input.substring(len / 2 + 1);
        } else {
            // 짝수
            // aabbccdd  >> len 8 >> len /2 >> 4 (0,1,2,3,4 )
            ff = input.substring(0, len / 2);
            ed = input.substring(len / 2);
            System.out.println(ff);
            System.out.println(ed);
        }

        if (ff.length() == ed.length()) {
            return ff.equals(reverseToString(ed));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}
