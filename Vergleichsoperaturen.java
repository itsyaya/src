public class Vergleichsoperaturen {
    public static void main(String[] args) {
        // ==, !=, <, >, <=, >= ||, &&, !, ^, |, &, ~ 

        int a = 10; 
        int b = 20; 
        int c = 10; 

        System.out.println("a == b: "+ (a == b));
        System.out.println("a != b: "+ (a != b));
        System.out.println("a < b: "+ (a < b));
        System.out.println("a > b: "+ (a > b));
        System.out.println("a <= b: "+ (a <= b));
        System.out.println("a >= b: "+ (a >= b));
        System.out.println("a == c: "+ (a == c));
        System.out.println("a != c: "+ (a != c));
        System.out.println("a < c: "+ (a < c));
        System.out.println("a > c: "+ (a > c));
        System.out.println("a <= c: "+ (a <= c));

        boolean x = true; 
        boolean y = false; 

        System.out.println("x && y: "+ (x && y));
        System.out.println("x || y: "+ (x || y));
        System.out.println("!x: "+ (!x));
        System.out.println("!y: "+ (!y));

        int d = 10; 
        int e = 20; 
        int f = 30;

        System.out.println("d < e && e < f: "+ (d <  e && e < f));
        System.out.println("d < e || e < f: "+ (d < e || e < f));
        System.out.println("d < e ^ e < f: "+ (d < e ^ e < f));
        System.out.println("d > e | e < f: "+ (d > e | e < f));
        System.out.println("d > e & e < f: "+ (d > e & e < f));
        System.out.println("~d: "+ (~d));
        System.out.println("~e: "+ (~e));
        System.out.println("~f: "+ (~f));

    }
    
}
