public class Copystack {

    // last in first out
    // 나중에 들어간게 먼저나가는 구조
    int idx = -1;
    int[] intArr = new int[5];
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
        // 지역 변수로 변경하는 것이 더 안전하고 메모리 낭비를 줄일 수 있음
        int[] tmpArr = null;
        // 같을경우 java.lang.ArrayIndexOutOfBoundsException 발생하므로 = 부등호 추가
        if (idx >= intArr.length - 1) {
            tmpArr = intArr;

            // 개선사항2 : 배열을 동적으로 늘려줄 경우 현재 배열 길이의 2배씩 늘려주는게
            // 재할당과 복사의 횟수를 줄일 수 있다.
            intArr = new int[intArr.length * 2];
            for (int num = 0 ; num < tmpArr.length; num++) {
                intArr[num] = tmpArr[num];
            }
            tmpArr = null;
        }
    }

    public int size() {
        // size는 현재 Stack의 크기를 리턴해줘야 함
        return idx + 1;
    }


    //pick 현재 가장 위에 있는 값을 리턴해줌
    public int peek() {
        // 개선사항1 : peek 메서드에서 예외처리 필요
        if (empty()) {
            throw new RuntimeException("스택이 부족합니다");
        }
        return intArr[idx];
    }

    //empty
    public boolean empty() {
        return idx == -1;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CopyStack : [");
        for (int i = 0; i <= idx; i++) {
            if (i == idx) {
                sb.append(intArr[i] + "]");
            } else {
                sb.append(intArr[i] + ",");
            }
        }
        return sb.toString();
    }
}
