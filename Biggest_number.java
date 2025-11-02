import java.util.Scanner;

public class Biggest_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("enter first number A: ");
        a = sc.nextInt();

        System.out.println("enter second number B: ");
        b = sc.nextInt();

        System.out.println("enter third number C: ");
        c = sc.nextInt();

        if (a>b && a>c){
            System.out.println("the biggest number is A: "+a);
        }
        else if (b>a && b>c) {
            System.out.println("the biggest number is B: "+b);
        }
        else {
            System.out.println("the biggest number is C: "+c);
        }
    }
}
