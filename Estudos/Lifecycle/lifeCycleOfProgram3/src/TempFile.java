import java.io.File;

public class TempFile {
    private File file;
    public TempFile(String filename) {
        file = new File(filename);
    }
    @Override
    protected void finalize() throws Throwable {
        // Delete the file when the TempFile object is garbage collected
        file.delete();
        super.finalize();
    }
}