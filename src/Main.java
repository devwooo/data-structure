import java.awt.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String firstName = "T ASD-TDS- ASDT-DTS-";
        String lastName = " AS-DT-ASD TAS- TD-S";

        System.out.println(firstName + nameMasking(lastName));
    }




    public static String nameMasking(String name) {
        // 한글만 (영어, 숫자 포함 이름은 제외)
        // String regex = "(^[가-힣]+)$";
        // 2025-02-28 박주석) 이름 마스킹 정책 변경
        // 이름이 첫글자와 마지막 글자 제외한 마스킹
        // 이름이 두글자일 경우 마지막 글자 마스킹
        String regex = "(^[A-Za-z\\s]+)$";
        Matcher matcher = Pattern.compile(regex).matcher(name);
        if (matcher.find()) {
            int length = name.length();
            String middleMask = "";
            if (length > 2) {
                middleMask = name.substring(1, length);
            } else {
                // 이름이 외자
                middleMask = name.substring(1, length);
            }
            String dot = "";
            for (int i = 0; i < middleMask.length(); i++) {
                dot += "*";
            }
            if (length > 2) {
                return name.substring(0, 1) + middleMask.replace(middleMask, dot);
            } else {
                // 이름이 외자 마스킹 리턴
                return name.substring(0, 1) + middleMask.replace(middleMask, dot);
            }
        }
        else
        {
            int length = name.length();
            String middleMask = "";
            if (length > 2) {
                middleMask = name.substring(1, length - 1);
            } else {
                // 이름이 외자
                middleMask = name.substring(1, length);
            }
            String dot = "";
            for (int i = 0; i < middleMask.length(); i++) {
                dot += "*";
            }
            if (length > 2) {
                return name.substring(0, 1) + middleMask.replace(middleMask, dot) + name.substring(length - 1, length);
            } else {
                // 이름이 외자 마스킹 리턴
                return name.substring(0, 1) + middleMask.replace(middleMask, dot);
            }
        }
    }
}