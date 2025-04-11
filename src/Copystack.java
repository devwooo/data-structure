
import java.util.ArrayList;
import java.util.Stack;

public class Copystack {

    // last in first out
    // 나중에 들어간게 먼저나가는 구조
    int idx = -1;
    int[] intArr = new int[5];
    int[] tmpArr = null;
    public Copystack() {

    }

    public void push(int num) {
        lengthcheck();
        intArr[++idx] = num;
    }

    public int pop() {
        if (idx < 0) {
            throw new RuntimeException("스택이 비어있습니다.");
        }
        int rtnVal =  intArr[idx];
        intArr[idx--] = 0;
        System.out.println("현재 idx는 : " + idx + "입니다.");
        return rtnVal;
    }


    public void lengthcheck() {
        if (idx > intArr.length - 1) {
            tmpArr = intArr;
            intArr = new int[intArr.length + 5];
            for (int num = 0 ; num < tmpArr.length; num++) {
                intArr[num] = tmpArr[num];
            }
            tmpArr = null;
        }
    }

    public int size() {
        return idx;
    }

}
