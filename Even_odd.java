import java.util.Scanner;

public class Even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        int num = sc.nextByte();

        if (num%2==0){
            System.out.println("the number is even");

        }
        else {
            System.out.println("the number is odd");
        }
    }
}
