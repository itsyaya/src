import java.util.Scanner;

public class Calu {

    public static void main(String[] args) {
        System.out.println("Was ist Ihre Name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Was ist Ihre Vorname? ");
        String vorname = scan.nextLine();

        System.out.println("Herzlich Willkommen zu deine Platform! Herr/Frau " + name + " "+ vorname +"\n");

        System.out.print("Bitte gib deine erste nummer ein ");
        double erstenummer = scan.nextDouble();

        System.out.print("Bitte gib deine Operand ein ");
        String operatur = scan.next();

        System.out.print("bitte gib deine zweite nummber ein "); 
        double  zweitenummer = scan.nextDouble();


        double result = 0; 

        switch (operatur) {
            case "+": 
                result = erstenummer + zweitenummer;
                break;

                case "-": 
                result = erstenummer - zweitenummer;
                break;

                case "*": 
                result = erstenummer * zweitenummer;
                break;

                case "/": 
                if (zweitenummer != 0) {

                    result = erstenummer / zweitenummer;
                } else {
                    System.out.println("Fehler! Division durch Null ist nich moeglich");
                }
                break;

                default:
                System.out.println("Fasche Operand");
        }

        System.out.println("Das Ergebnis ist: "+ result);

    }
}
