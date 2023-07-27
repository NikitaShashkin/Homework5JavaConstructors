import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите любое предложение на английском: ");
        String originalText = scanner.nextLine();
        TextMessage textMessage = new TextMessage(originalText);

        TextMessage textMessage2 = new TextMessage("My name is Nik");
        TextMessage textMessage3 = new TextMessage("Weather is fuck");
        TextMessage textMessage4 = new TextMessage("Weather is bullshit");






        //System.out.println();




    }
}