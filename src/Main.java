import company.interfaces.Messenger;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        int x = 10;
        int y = 5;
        
        int sum = MathUtils.add(x, y);
        System.out.println("Sum of " + x + " and " + y + " is: " + sum);

        Messenger messenger = new EmailMessenger();
        messenger.sendMessage("The sum of " + x + " and " + y + " is: " + sum);
    }
}