package JavaCondition;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int dan = scanner.nextInt();

        for (int i = 1; i <= 9; i++) {
            System.out.println(dan + " x " + i + " = " + (dan * i));
        }
        scanner.close();

    }
}
