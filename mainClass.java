import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter lower bound: ");
        int low = scanner.nextInt();

        System.out.print("Enter upper bound: ");
        int high = scanner.nextInt();

        System.out.println("Factorion numbers:");

        for (int i = low; i <= high; i++) {
            if (FactorionChecker.isFactorion(i)) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}