
import java.util.Scanner;

public class Rounding
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double num1 = in.nextDouble();
        int num1Int = (int) (num1 * 100);
        System.out.print("Enter a real number: ");
        double num2 = in.nextDouble();
        int num2Int = (int) (num2 * 100);   // 3.55 * 100 = 355.0 

        double diff = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + diff);

        double correctDiff = (num1Int - num2Int) / 100.0;
        // Also works: double correctDiff = (double) (num1Int - num2Int) / 100;
        System.out.println("Correct difference: " + correctDiff);
    }
}

