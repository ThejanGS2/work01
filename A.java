import java.util.Scanner;
public class A
{
    public static void main(String[] args) 
    {
 
        Scanner input = new Scanner(System.in);
        int number;
        int sum = 0;
        int anyNegativeNumber = -1;
 
        System.out.println("Enter number :");
            number = input.nextInt();
        
        while (number != anyNegativeNumber)
        {
            sum += number;
             number = input.nextInt();
        }
 
        System.out.println("Sum: " + sum);
    }
}
