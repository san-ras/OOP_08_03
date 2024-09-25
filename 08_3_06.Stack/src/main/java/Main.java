public class Main {

    public static void main(String[] args) {

        Stack stack = new Stack();
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        stack.add("First");
        stack.add("Second");
        System.out.println(stack.isEmpty());
        System.out.println(stack.values());

        String taken = stack.take();
        System.out.println(stack.values());
        System.out.println(taken);
        String taken2 = stack.take();
        System.out.println(stack.isEmpty());


    }
}
