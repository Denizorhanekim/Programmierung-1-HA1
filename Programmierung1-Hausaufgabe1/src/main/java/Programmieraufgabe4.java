public class Programmieraufgabe4{
    public static void main(String[] args){
int n=6; // n ist die Anzahl von rows
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                if(i==2){
                    System.out.print(".");
                }else{
                    System.out.print("*");
                }
            }System.out.println();
        }
    }
}