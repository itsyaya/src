import java.util.Scanner; 

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Was wollen Sie brechnen? ");
            // Spannung, Strom, Widerstand, Leistungs
            String brechnung = input.nextLine();

            switch (brechnung) {
                case "Spannung" -> {
                    System.out.println("Enter the current: ");
                    double current = input.nextDouble();
                    System.out.println("Enter the resistance: ");
                    double resistance = input.nextDouble();
                    double voltage = current * resistance;
                    System.out.println("The voltage is: " + voltage);
                }
                case "Strom" -> {
                    System.out.println("Enter the voltage: ");
                    double voltage1 = input.nextDouble();
                    System.out.println("Enter the resistance: ");
                    double resistance1 = input.nextDouble();
                    double current1 = voltage1 / resistance1;
                    System.out.println("The current is: " + current1);
                }
                case "Widerstand" -> {
                    System.out.println("Enter the voltage: ");
                    double voltage2 = input.nextDouble();
                    System.out.println("Enter the current: ");
                    double current2 = input.nextDouble();
                    double resistance2 = voltage2 / current2;
                    System.out.println("The resistance is: " + resistance2);
                }
                case "Leistung" -> {
                    System.out.println("Enter the voltage: ");
                    double voltage3 = input.nextDouble();
                    System.out.println("Enter the current: ");
                    double current3 = input.nextDouble();
                    double power3 = voltage3 * current3;
                    System.out.println("The power is: " + power3);
                }
                default -> System.out.println("Invalid calculation");
            }
        }
    }
}
