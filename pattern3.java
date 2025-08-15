import java.util.Scanner;
public class pattern3 {
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);
       int x = sc.nextInt();
       int z =1;
       for(int i=1;i<=x;i++){
        for(int j=0;j<i;j++){
            System.out.print(z+" ");
            z++;
        }
        System.out.println();
       } 
    sc.close();
    }
    
}
