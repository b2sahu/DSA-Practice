import java.util.Scanner;

public class pattern5 {
    
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Rowd And Column in Pattern: ");
        int x = sc.nextInt();
        for(int i=0;i<x;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=5;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
