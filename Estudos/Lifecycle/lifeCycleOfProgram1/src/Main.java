class Main extends Object {
    // Class variable initializers and static initializers are executed in this order
    static int x = 1;  // Initializer for static field x
    static int y;  // No initializer for static field y
    // Static initializer
    static {
        y = x + 1;
    }
    static int z = x + y;  // Initializer for static field z
    public static void main(String[] args) {
        // Main method is executed after the class is initialized
    }
}