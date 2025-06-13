import java.lang.ref.WeakReference;
public class LargeClass {
    // A large array of integers that consumes a lot of memory
    private int[] data = new int[Integer.MAX];
    public static void main(String[] args) {
        // Create a LargeClass object and hold a weak reference to it
        LargeClass largeObject = new LargeClass();
        WeakReference<LargeClass> weakRef = new WeakReference<>(largeObject);
        largeObject = null;  // largeObject is no longer strongly reachable
        // Run the garbage collector
        System.gc();
        // Check if the LargeClass object has been collected
        if (weakRef.get() == null) {
            System.out.println("The LargeClass object has been collected");
        } else {
            System.out.println("The LargeClass object has not been collected");
        }
    }
}
