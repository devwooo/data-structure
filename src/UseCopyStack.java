import java.util.Stack;

public class UseCopyStack {

    public static void main(String[] args) throws Exception {
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

        System.out.println("================");
        GenericStack<Integer> gs = new GenericStack<>();
        gs.push(3);
        System.out.println(gs.pop());
        System.out.println("================");
        GenericStack<String> gs2 = new GenericStack<>();
        gs2.push("hi");
        gs2.push("hello");
        System.out.println(gs2.pop());
    }
}

