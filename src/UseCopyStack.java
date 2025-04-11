import java.util.Stack;

public class UseCopyStack {

    public static void main(String[] args) {
        Copystack c = new Copystack();

        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        System.out.println(c.pop());
        c.push(7);
        c.push(8);
        c.push(9);
        c.push(3);
        System.out.println(c.pop());
        System.out.println("C의 size : " + c.size());
    }
}

