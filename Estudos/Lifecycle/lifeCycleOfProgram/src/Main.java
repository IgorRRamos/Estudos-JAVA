import java.io.IOException;
import java.io.InputStream;

public class CustomClassLoader extends ClassLoader {
    public CustomClassLoader(ClassLoader parent) {
        super(parent);
    }
    // Method to load a class given its name
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        if (!name.startsWith("com.example")) {
            // Delegate to the parent class loader
            return super.loadClass(name);
        }
        // The class name does start with "com.example", construct the file name
        String fileName = name.substring(name.lastIndexOf('.') + 1) + ".class";
        // Try to open an InputStream for the file
        InputStream inputStream = getClass().getResourceAsStream(fileName);
        // If the stream is null, throw a ClassNotFoundException
        if (inputStream == null) {
            throw new ClassNotFoundException();
        }
        try {
            // Create a byte array to hold the contents of the file
            byte[] bytes = new byte[inputStream.available()];
            // Read the bytes from the input stream
            inputStream.read(bytes);
            // Define the class using the class name, the byte array, and the number of bytes
            return defineClass(name, bytes, 0, bytes.length);
        } catch (IOException e) {
            throw new ClassNotFoundException();
        }
    }
}