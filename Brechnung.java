import java.util.Scanner;

public class Brechnung {

 public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Was wollen Sie brechnen? ");
    // Spannung, Strom, Widerstand, Leistung, Programm zu beenden
    System.out.println("1 für Spannung");
    System.out.println("2 für Strom");
    System.out.println("3 für Widerstand");
    System.out.println("4 für Leistung");
    System.out.println("5 für das Programm zu beenden");
    

    String brechnung = input.nextLine();

    switch (brechnung) {
        case "1" -> {
            System.out.println("Geben Sie den Strom ein: ");
            double strom = input.nextDouble();
            System.out.println("Geben Sie den Widerstand ein: ");
            double widerstand = input.nextDouble();
            double spannung = strom * widerstand;
            System.out.println("Die Spannung ist: " + spannung);
        }

            case "2" -> {

                System.out.println("Geben Sie die Spannung ein: ");
                double spannung1 = input.nextDouble();
                System.out.println("Geben Sie den Widerstand ein: ");
                double widerstand1 = input.nextDouble();
                double strom1 = spannung1 / widerstand1;
    
                System.out.println("Die Strom ist: "+ strom1);
                break; 
            }

            case "3" -> {

                System.out.println("Geben sie den Spannung ein: ");
                double spannung2 = input.nextDouble();
                System.out.println("Geben Sie den Strom ein: ");
                double strom2 = input.nextDouble();
                double widerstand2 = spannung2 / strom2;
    
                System.out.println("Der Widerstand ist; " + widerstand2);
                break;
            }

            case "4" -> {

                System.out.println("Geben Sie den Spannung ein: ");
                double spannung3 = input.nextDouble();
                System.out.println("Geben Sie den Strom ein: ");
                double strom3 = input.nextDouble();
                double leistung = spannung3 * strom3;
    
                System.out.println("Die Leistung ist; " + leistung);
                break;
            }

            case "5" -> {

                System.out.println("Das Programm wird beended, weil Sie 5 eingegeben haben");
                break;
            }

            default -> System.out.println("Ungueltige Berechnung");
    }

    input.close();

 } 
   
}