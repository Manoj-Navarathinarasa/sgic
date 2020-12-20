import java.util.Scanner;

public class CompareTwoWords {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter the value 1st number : ");
        int num1 = scanner.nextInt();
        System.out.print("Please Enter the value 2nd number  : ");
        int num2 = scanner.nextInt();
        if (num1 == num2) // Same as arr1.equals(arr2)
            System.out.println("Same");
        else
            System.out.println("Not same");
    }
}
