import java.util.Stack;

public class GenericStack<T> {

    int idx = -1;

    Object[] arr = null;

    public GenericStack() {
        // 생성자의 경우 this로 호출할 수 있다.
        this(5);
    }

    // 크기를 입력받아 배열의 크기를 지정 할 수 있다.
    public GenericStack(int size) {
        arr = new Object[size];
    }

    public boolean push(T value) {
        lengthcheck();
        arr[++idx] = value;
        return true;

    }

    public T pop() {
        if (empty()) {
            throw new RuntimeException("Stack 이 부족합니다. 현재 Stack : " + idx);
        }
        T value = (T)arr[idx];

        //메모리 누수방지를 위해 null 처리
        arr[idx--] = null;
        return value;
    }

    public T peek() {
        if (empty()) {
            throw new RuntimeException("Stack 이 부족합니다. 현재 Stack : " + idx);
        }
        return (T)arr[idx];
    }

    public boolean empty() {
        return idx == -1;
    }

    public int size() {
        // idx는 0부터 시작이므로 크기를 알려줘야 하므로 + 1
        return idx + 1;
    }

    private void lengthcheck() {
        if (idx >= arr.length - 1) {
            Object[] tmpArr = new Object[arr.length * 2];
            // native 메서드로 속도가 빠르다.
            System.arraycopy(arr, 0, tmpArr, 0, idx + 1);
            arr = tmpArr;
        }
    }
}
