import java.util.Scanner;

public class pattern6 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Rowd And Column in Pattern: ");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=x;j>i;j--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int j=0;j<=i;j++){
                System.out.print(i-j+1);

            }
            System.out.println();
        }
        sc.close();
    }
}
