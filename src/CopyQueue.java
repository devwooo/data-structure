import java.util.NoSuchElementException;
import java.util.Queue;

public class CopyQueue {
    //Queue
    private int index = -1;
    private int[] arr = new int[5];

    //CopyQueue First in First out
    public CopyQueue() {

    }


    // add[true, error]
    public boolean add(Integer num) {
        if (offer(num)) {
            return true;
        } else {
            throw new IllegalStateException("Queue Full");
        }
    }

    // offer[true, false]
    public boolean offer(Integer num) {
        if (num != null) {
            arr[++index] = num;
            return true;
        } else {
            return false;
        }
    }

    // remove
    public Integer remove() {
        if (poll() != null) {
           return arr[index--];
        } else {
            throw new NoSuchElementException("Queue is Empty");
        }


    }

    // poll
    public Integer poll() {
        if (index >= 0) {
            return arr[index];
        } else {
            return null;
        }
    }
    // element

    // peek
    public Integer peek() {
        return 0;
    }
}
