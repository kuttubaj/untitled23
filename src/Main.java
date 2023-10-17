import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User user = new User();
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Введите ваше имя: ");
            String name = input.nextLine();
            try {
                user.setName(name);
                System.out.println("Введите ваш возвраст");
                int age = input.nextInt();
                user.setAge(age);
            } catch (IllegalNameLegthException e) {
                throw new RuntimeException(e);
            }
        }
    }
}