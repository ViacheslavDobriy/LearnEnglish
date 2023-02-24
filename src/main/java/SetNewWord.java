import java.util.Scanner;

public class SetNewWord {

    private String english;
    private String russian;

    public void putItInMap() {
        DatabaseOfWords.putNewWord(this);
    }

    public void setEngWord() {
        System.out.println("Введите слово на английском языке, которое нужно запомнить");
        Scanner iScanner = new Scanner(System.in);
        this.english = iScanner.nextLine();
    }

    public void setRusWord() {
        System.out.println("Введите перевод этого слова на русском языке");
        Scanner iScanner = new Scanner(System.in);
        this.russian = iScanner.nextLine();
    }

    public String getEnglish() {
        return english;
    }

    public String getRussian() {
        return russian;
    }
}
