import java.util.Scanner;

public class ForLoop_serise_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n,i,sum=0;

        System.out.println("enter a number: ");
        n = sc.nextByte();

        for(i=1;i<=n;i++){
            sum = sum + i*i;
        }
        System.out.println("total sum is: "+ sum);


    }


}
