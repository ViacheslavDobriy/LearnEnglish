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
        SetEngWord newWord = new SetEngWord();
        switch (userChoice) {
            case 1 -> {
                newWord.setEngWord();
                newWord.setRusWord();
            }
            case 2 -> {
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
    }

    public int getUserChoice() {
        return userChoice;
    }
}
