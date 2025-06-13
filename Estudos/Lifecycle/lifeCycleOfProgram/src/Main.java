/*
Carregamento refere-se ao processo de encontrar a forma binária de uma classe
ou interface (ou seja, a classformato de arquivo) com um nome específico e
construção de um Classobjeto dessa forma binária. A JVM usa um ClassLoader
para encontrar a representação binária de Main- A . (í a questão: es. , , ,
íntepeo. . E. . es. sobre a questão . (em, proprio, e O que é ClassLoaderclasse
e suas subclasses implementam o processo de carregamento. O método defineClassÉ
chamado a construir Classobjetos a partir da representação binária do formato de arquivo de classe.
A JVM fornece dois tipos de carregadores de classe: um carregador de
classe embutido chamado bootstrap class loader, que carrega as classes Java
principais do rt.jararquivo; e o carregador de classe de extensão, que carrega
classes a partir do extDiretório. Além disso, os carregadores de classe de
aplicativos podem ser usados para carregar classes de outros locais, como o
classpath ou um servidor remoto. Os últimos são subclasses personalizados de
ClassLoaderque podem carregar classes através do java.lang.ClassPor exemplo.
 */



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