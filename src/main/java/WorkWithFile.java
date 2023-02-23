import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collections;

public class WorkWithFile {
    private static Path file = Paths.get("myDictionary.txt");
    public static void writeToFile(SetNewWord setNewWord){
        try {
            Files.write(file, Collections.singleton(setNewWord.getEnglish() + " " + setNewWord.getRussian()), StandardCharsets.UTF_8, StandardOpenOption.APPEND);
        } catch (IOException e){
            e.getMessage();
        }
    }

    public static String readFromFile() {
        try {
            String read = Files.readString(file);//readAllLines(file).get(1);
            return read;
        } catch (IOException e) {
            e.getMessage();
        }
        return "error";
    }

}
