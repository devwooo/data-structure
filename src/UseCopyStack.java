import java.util.Stack;

public class UseCopyStack {

    public static void main(String[] args) {
        Copystack c = new Copystack();
        System.out.println(c.empty());
        c.push(1);
        c.push(2);
        c.push(3);
        c.push(4);
        c.push(7);
        c.push(8);
        c.push(9);
        c.push(3);

        System.out.println(c.peek());
        System.out.println(c.empty());
        System.out.println(c);
        System.out.println(c.toString());
    }
}

