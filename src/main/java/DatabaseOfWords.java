import java.util.HashMap;
import java.util.Map;

public class DatabaseOfWords {
    private static Map<String, String> database = new HashMap<>();

    public static void putNewWord(SetNewWord newWord) {
        database.put(newWord.getEnglish(), newWord.getRussian());
    }

    public static Map<String, String> getDatabase() {
        return database;
    }
}
