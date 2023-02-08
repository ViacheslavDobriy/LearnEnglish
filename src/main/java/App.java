import java.util.Objects;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        SetEngWord newWord = new SetEngWord();
        System.out.printf("Say me %s\n", newWord.getEnglish());
        Scanner iScanner = new Scanner(System.in);
        if(Objects.equals(iScanner.nextLine(), newWord.getRussian())) {
            System.out.println("Yes, you are right");
        } else {
            System.out.println("Nope, it is not correct");
            System.out.println(newWord.getRussian());
        }
    }
}
