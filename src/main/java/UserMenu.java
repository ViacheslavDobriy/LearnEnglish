import java.util.Objects;
import java.util.Scanner;

public class UserMenu {
    private int userChoice = 0;
    public void greetings() {
        System.out.println("Добро пожаловать в ваш личный англо-русский словарик!");
    }
    public void farewell() {
        System.out.println("Надеюсь мы увидимся с вами совсем скоро");
    }
    public void menu(){
        System.out.println("Введи 1, если ты собираешься добавить новое слово: ");
        System.out.println("Введи 2, если ты собираешься повторить свои слова: ");
        System.out.println("Введи 3, если ты хочешь выйти из приложения: ");
        Scanner userNumber = new Scanner(System.in);
        this.userChoice = userNumber.nextInt();
        SetNewWord newWord = new SetNewWord();
        switch (userChoice) {
            case 1 -> {
                newWord.setEngWord();
                newWord.setRusWord();
                WorkWithFile.writeToFile(newWord);
                newWord.putItInMap();
            }
            case 2 -> {
                for (var word : DatabaseOfWords.getDatabase().entrySet()) {
                    System.out.printf("How to say %s on russian?", word.getKey());
                    Scanner iScanner = new Scanner(System.in);
                    String answer = iScanner.nextLine();
                    if(Objects.equals(word.getValue(), answer)){
                        System.out.println("Правильно, молодец!");
                    } else System.out.printf("Неправильно! А правильно будет %s", word.getValue());
                }
            }
        }
    }

    public int getUserChoice() {
        return userChoice;
    }
}
