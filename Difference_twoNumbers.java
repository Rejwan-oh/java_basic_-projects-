import java.util.Scanner;

public class Difference_twoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number one: ");
        int num = sc.nextInt();
        System.out.println("enter number two: ");
        int num_2= sc.nextInt();

        int result = num;

        for (int i=0; i<num_2; i++){
            result=result-1;

        }  System.out.println("result is: "+result);
    }
}
