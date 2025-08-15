import java.util.Scanner;
public class pattern7{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x= sc.nextInt();
        for(int i=x;i>=1;i--){
            if(i>x/2){
                    for(int j=0;j<i;j++){
                        System.out.print(" ");
                }
                for(int j=x;j>=i;j--){

                    System.out.print(j-i+1);
                }
                for(int j=x;j>i;j--){
                    System.out.print(x-j+2);
                }
            }
               else{ 
                    for(int j=x;j>=i;j--){
                        System.out.print(" ");
                }
                for(int j=1;j<i;j++){
                    System.out.print(i-j+1);
                }
                for(int j=0;j<i;j++){
                    System.out.print(j+1);
                }
                    
           }
           System.out.println();
        }
        sc.close();
    }
} 