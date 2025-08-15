import java.util.Scanner;
public class pattern4{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number in Rowd And Column in Pattern: ");
        int x = sc.nextInt();
       // char c='A';
        for(int i=0;i<x;i++){
            for(int j=0;j<x;j++){
                char c =97;
                System.out.print((char)(c+i+j));
               // c++;
            }
            //c='A';
            System.out.println();
        }
        sc.close();
    }
    
}
