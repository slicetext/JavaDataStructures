public class Main {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        System.out.println(s.isEmpty());
        s.push(5);
        System.out.println(s.isEmpty());
        System.out.println(s.peek());
        System.out.println(s.size());
        s.push(8);
        System.out.println(s.peek());
        System.out.println(s.size());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.size());
        System.out.println(s.isEmpty());
    }
}