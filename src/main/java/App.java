
public class App {
    public static void main(String[] args) {

        UserMenu userMenu = new UserMenu();
        userMenu.greetings();
        do{
            userMenu.menu();
        } while(userMenu.getUserChoice() != 3);
        userMenu.farewell();

    }
}
