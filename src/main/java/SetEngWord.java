import java.util.Scanner;

public class SetEngWord extends Word{

    public void setEngWord() {
        System.out.println("������� ����� �� ���������� �����, ������� ����� ���������");
        Scanner iScanner = new Scanner(System.in);
        this.setEnglish(iScanner.nextLine());
    }

    public void setRusWord() {
        System.out.println("������� ������� ����� ����� �� ������� �����");
        Scanner iScanner = new Scanner(System.in);
        this.setRussian(iScanner.nextLine());
    }
}
