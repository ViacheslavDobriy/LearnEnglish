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
        WorkWithFile.readFromFile();
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
                    System.out.printf("��� ����������� %s �� �������? ", word.getKey());
                    Scanner iScanner = new Scanner(System.in);
                    String answer = iScanner.nextLine();
                    if(answer == word.getValue()){
                        System.out.println("���������!");
                    } else {
                        System.out.println(word.getValue());
                    }
                }
            }
        }
    }

    public int getUserChoice() {
        return userChoice;
    }
}
