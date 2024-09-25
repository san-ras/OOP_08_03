import java.util.ArrayList;

public class Stack {

    private final ArrayList<String> stack;

    public Stack() {
        this.stack = new ArrayList<>();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void add(String value) {
        this.stack.add(value);
    }

    public ArrayList<String> values() {
        return this.stack;
    }

    public String take() {
        String last = stack.get(stack.size() - 1);
        this.stack.remove(last);
        return last;
    }


}
