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
            System.out.println("Файл не найден");
        }
    }

    public static void readFromFile() {
        try {
            String[] read = Files.readString(file).replace("\n", " ").split(" ");
            int counter = 1;
            while(counter < read.length){
                DatabaseOfWords.getDatabase().put(read[counter-1], read[counter]);
                counter += 2;
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

}
