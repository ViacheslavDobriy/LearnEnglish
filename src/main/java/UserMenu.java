import java.nio.charset.StandardCharsets;
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
                System.out.println("�� ������� " + countsRightAnswers() + " ����� �� " + DatabaseOfWords.getDatabase().size());
            }
        }
    }

    public int getUserChoice() {
        return userChoice;
    }
    private boolean compareBytes(byte[] myAnswer, byte[] fromFile) {
        if(myAnswer.length == fromFile.length - 1) {
            for (int i = 0; i < fromFile.length - 1; i++) {
                if (myAnswer[i] != fromFile[i]) {
                    return false;
                }
            }
        } else return false;
        return true;
    }

    private int countsRightAnswers(){
        int counter = 0;
        for (var word : DatabaseOfWords.getDatabase().entrySet()) {
            System.out.printf("��� ����������� %s �� �������? ", word.getKey());
            Scanner iScanner = new Scanner(System.in);
            String answer = iScanner.nextLine();
            if(compareBytes(answer.getBytes(StandardCharsets.UTF_8), word.getValue().getBytes(StandardCharsets.UTF_8))){
                System.out.println("���������!");
                counter++;
            } else {
                System.out.println("�����������!");
            }
        }
        return counter;
    }
}
