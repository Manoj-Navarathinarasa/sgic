import java.util.Scanner;

public class TemporaryVariableSwap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the value of X : ");
        int X = scanner.nextInt();
        System.out.print("Please Enter the value of Y : ");
        int Y = scanner.nextInt();
        System.out.print("Please Enter the value of Z : ");
        int Z = scanner.nextInt();

        //Define variables
        System.out.println("before swapping numbers: " + X + " " + Y);
        //Swapping
        Z = X;
        X = Y;
        Y = Z;
        System.out.println("After swapping: " + X + "  " + Z);
        System.out.println("After swapping: " + X + "  " + Y);
        System.out.println("After swapping: " + Y + "  " + Z);
    }
}
