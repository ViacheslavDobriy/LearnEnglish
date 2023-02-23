import java.util.Objects;
import java.util.Scanner;

public class UserMenu {
    private int userChoice = 0;
    public void greetings() {
        System.out.println("����� ���������� � ��� ������ �����-������� ��������!");
    }
    public void farewell() {
        System.out.println("������� �� �������� � ���� ������ �����");
    }
    public void menu(){
        System.out.println("����� 1, ���� �� ����������� �������� ����� �����: ");
        System.out.println("����� 2, ���� �� ����������� ��������� ���� �����: ");
        System.out.println("����� 3, ���� �� ������ ����� �� ����������: ");
        Scanner userNumber = new Scanner(System.in);
        this.userChoice = userNumber.nextInt();
        SetNewWord newWord = new SetNewWord();
        switch (userChoice) {
            case 1 -> {
                newWord.setEngWord();
                newWord.setRusWord();
                WorkWithFile.writeToFile(newWord);
            }
            case 2 -> {
                System.out.printf("Say me %s\n", WorkWithFile.readFromFile());//.split(" ")[0]);
                Scanner iScanner = new Scanner(System.in);
                if(Objects.equals(iScanner.nextLine(), WorkWithFile.readFromFile())) {//.split(" ")[2])) {
                    System.out.println("Yes, you are right");
                } else {
                    System.out.println("Nope, it is not correct");
                    System.out.println(newWord.getRussian());
                }
            }
        }
    }

    public int getUserChoice() {
        return userChoice;
    }
}
