import java.util.Scanner;
import java.util.InputMismatchException;

public class MinutesFromStartDay {

    private static final int MINUTES_PER_HOUR = 60;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = readInteger(scanner, "Digite a hora (0-23):", 0, 23);
        int minutes = readInteger(scanner, "Digite os minutos (0-59):", 0, 59);

        int minutesFromStartOfDay = calculateMinutesFromStartOfDay(hour, minutes);

        System.out.println("Minutos desde o início do dia: " + minutesFromStartOfDay);

        scanner.close();
    }

    private static int calculateMinutesFromStartOfDay(int hour, int minutes) {
        return (hour * MINUTES_PER_HOUR) + minutes;
    }

    private static int readInteger(Scanner scanner, String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message);
                int value = scanner.nextInt();

                if (value >= min && value <= max) {
                    return value;
                }

                System.out.println("Valor inválido. Digite um número entre " + min + " e " + max + ".");

            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite apenas números inteiros.");
                scanner.next(); 
            }
        }
    }
}