public class Programmieraufgabe6{
    public static void main(String[] args){
        /*
        i=1;
        -j=1: print *
        -j=2  print .
        -j=3 print *
        -j=4 print .
        -j=5 print *

        wenn j (column-number) uneven is --> print * (für i =1 , i is uneven)
        wenn j even , i uneven --> print .
        ......bis j=9

        i=2;
        -j=1: print .
        -j=2 print *
        -j=3 print .
        -j=4 print *
        -j=5 print .

        wenn i is even and j is uneven print .
        wenn is is even and j is uneven print *

        ...........bis j=9


        wenn i is uneven und j is even print . sonst print *
        wenn i is even and j is  uneven print * sonst print .



         */

   // Viereck Loop Outer Loop
       /* int n=9; //n is the height, number of total rows

        for(int i=1; i<=n; i++ ){
            for(int j=1; j<=n; j++ ){
                while(i%2!=0){
                    if(j%2==0){
                        System.out.print(".");
                    }else{
                        System.out.print("*");
                    }
                }
                while(i%2==0){
                    if(j%2!=0){
                        System.out.print(".");
                    }else{
                        System.out.print("*");
                    }
                }

        }
----> INFINTE LOOP DONT USE WHILE --> BUT WHY THE LOGIK NACHFRAGEN

*/
        int n = 9;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 != 0) {
                    if (j % 2 == 0) {
                        System.out.print(".");
                    } else { // j is odd
                        System.out.print("*");
                    }
                } else {
                    if (j % 2 != 0) {
                        System.out.print(".");
                    } else {
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}