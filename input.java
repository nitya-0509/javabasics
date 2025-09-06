import java.util.Scanner;
public class input {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
            //print write a message
            System.out.println("Write a message");
            String message = scanner.nextLine();
            System.out.println(message);
        }

    }

}
