package src;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 1~100 까지의 숫자가 배열에 99개가 저장될경우
 * 저장되지 않는 숫자를 찾는 프로그램
 */
public class findNum {

    private static int[] makeArray(int count) {
        int[] rtnArr = new int[count];

        for (int i = 0; i < count; i++) {
            rtnArr[i] = i + 1;
        }
        return rtnArr;
    }

    private static int[] putNumArr(int[] target, int[] numArr) {

        if (target == null || numArr == null) {
            return null;
        }

        ArrayList<Integer> dupList = new ArrayList<>();
        for (int i =0; i < target.length; i++) {

            int ran = (int) Math.floor(Math.random() * 100);
            if (dupList.contains(ran)) {
                i--;
            } else {
                target[i] = numArr[ran];
                dupList.add(ran);
            }
        }
        return target;
    }

    private static int getNotExistNum(int[] arr, int[] strdArr) {
        int rtnVal = 0;
        for (int num : strdArr) {
            if (!Arrays.stream(arr).boxed().collect(Collectors.toList()).contains(num)) {
                rtnVal = num;
            }
        }
        return rtnVal;
    }

    public static void main(String[] args) {

        int[] newArry = new int[99];
        int[] numArr = makeArray(100);

        System.out.println(getNotExistNum(putNumArr(newArry, numArr), numArr));


    }

    /*
    let findNum = function () {
        let arr = new Array(99);

        let numObj = {};
        for(var i = 1; i<=100; i++) {
            numObj[i-1] = i;
        }
        var bool = true


        var dup = [];
        for (var j = 0; j<arr.length; j++) {

            var ran = Math.floor(Math.random() * 100);
            if (dup.indexOf(ran) > -1) {
                j--;
                continue;
            } else {
                arr[j] = numObj[ran];
                dup[dup.length] = ran;
            }
        }

        for(num of Object.values(numObj)) {
            if (!arr.includes(num)) console.log(num)
        }
    }*/


}
