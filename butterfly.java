import java.util.Scanner;
public class butterfly {
 public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    //outer line 
    for(int i=1;i<n;i++){
        //Star--i
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        // Space--2*(n-i)
        for(int j=1;j<2*(n-i);j++){
            System.out.print(" ");

        }
        //star--i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    for(int i=n;i>=0;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");

        }
        // Space--2*(n-i)
        for(int j=1;j<2*(n-i);j++){
            System.out.print(" ");

        }
        //star--i
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }

    sc.close();
 } 

}