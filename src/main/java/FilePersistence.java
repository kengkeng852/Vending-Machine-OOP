import java.io.File;
import java.io.IOException;
import java.util.NoSuchElementException;

public interface FilePersistence {
    void writeToFile(File outputFile)
            throws IOException;
    void readFromFile(File inputFile)
            throws IOException, NoSuchElementException;
}