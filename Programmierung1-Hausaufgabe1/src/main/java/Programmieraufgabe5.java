public class Programmieraufgabe5 {
    public static void main(String[] args) {
        for (int i = 0; i <= 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

       /*
        for (int i = 3; i <= 0; i--) {
          for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        --> false for condition outer loop for rows: i<=0 is false i starts with 3 and i<=0 is never true aus diesem Grund , this loop never runs cuz its false and prints nothinmg
        ALWAYS DRAW THE STERN-ROW TABLE ON PAPER RUN THE ALGORITHM ON PAPER
        */

    for (int i = 3; i >= 0; i--) {
        for (int j = 0; j <= i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}}