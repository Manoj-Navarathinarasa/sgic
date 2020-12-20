import java.util.Scanner;

public class SwapTwoInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the value of X : ");
        int x = scanner.nextInt();
        System.out.print("Please Enter the value of Y : ");
        int y = scanner.nextInt();
        //Define variables
        System.out.println("before swapping numbers: " + x + " " + y);
        //Swapping
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping: " + x + "  " + y);
    }
}
