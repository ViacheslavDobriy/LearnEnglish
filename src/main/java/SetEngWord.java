import java.util.Scanner;

public class SetEngWord extends Word{

    public SetEngWord() {
        setEngWord();
        setRusWord();
    }

    public void setEngWord() {
        System.out.println("Введите слово на английском языке, которое нужно запомнить");
        Scanner iScanner = new Scanner(System.in);
        this.setEnglish(iScanner.nextLine());
    }

    public void setRusWord() {
        System.out.println("Введите перевод этого слова на русском языке");
        Scanner iScanner = new Scanner(System.in);
        this.setRussian(iScanner.nextLine());
    }
}
