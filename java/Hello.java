public class Hello {
    public static void main(String[] args) {
        String name = null;

        System.out.println("Hello " + (name != null && !name.isEmpty() ? name : "world") + "!");
        
    }
}
