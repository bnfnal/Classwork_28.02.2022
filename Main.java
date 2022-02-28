import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        System.out.println("Задача №1: Even or Odd");
        // Create a function that takes an integer as an argument and returns "Even" for even numbers or "Odd" for odd numbers.
        // Function EvenOrOdd(int x)
        
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Ответ: " + EvenOrOdd(n));
        
    }
    
    public static String EvenOrOdd(int x)
    {
        if (x%2 == 0) 
        {
            return("Even"); 
        }
        else 
        {
            return("Odd");
        }
    }

}
