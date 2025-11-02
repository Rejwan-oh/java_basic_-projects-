import java.util.Scanner;

public class Switch_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter your mark in one subject(out of 100): ");
        int mark = sc.nextInt();

        switch (mark/10) {
            case 10:
            case 9:
            case 8:
                System.out.println("Grade is: A+");
                break;
            case 7:
                System.out.println("Grade is: A");
                break;
            case 6:
                System.out.println("Grade is: B");
                break;
            case 5:
                System.out.println("Grade is: C");
                break;
            case 4:
                System.out.println("Grade is: D");
                break;
            default:
                System.out.println("enjoy your life, you don't need to go to school now!");
                break;
        }
    }
}
