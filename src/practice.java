import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("enter text: ");
        String text = keyboard.next();
            if ((text == null) || (text.length() % 2 != 1) || (text.length() < 3)) {
                System.out.print("text");
            } else {
                double length = text.length();
                double doubledCenter = Math.ceil(length / 2);
                int center = (int) doubledCenter;
                String finalString = text.substring(center - 2, center + 1);
                System.out.print(finalString);
            }
        }
    }
