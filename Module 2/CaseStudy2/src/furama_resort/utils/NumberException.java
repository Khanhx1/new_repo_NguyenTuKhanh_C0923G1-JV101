package furama_resort.utils;

import java.util.Scanner;

public class NumberException {
    private Scanner scanner = new Scanner(System.in);

    public int inputNumberException() {
        int count = 0;
        int number = 0;
        do {
            count = 0;
            try {
                number = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                count++;
                System.out.println("The input number is invalid");
            }
        } while (count != 0);
        return number;
    }
}
