import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int counter, i=0, j=0, temp;
        int number[] = new int[100];
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Numbers you want to enter: ");
        counter = scanner.nextInt();
        for(i=0; i<counter; i++)
        {
            System.out.print("Enter "+(i+1)+" Number "+": ");
            number[i] = scanner.nextInt();
        }
        j = i - 1;
        i = 0;
        scanner.close();{

                if(number[i]>number[j]){
                    temp = number[i];
                    number[i] = number[j];
                    number[j] = temp;
                }
        }
        System.out.println("This is second largest number is:: "+number[counter-2]);
    }
}
