import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:");
        Float a = scanner.nextFloat();
        System.out.print("Podaj drugą liczbę:");
        Float b = scanner.nextFloat();
        System.out.print("Podaj znaczek:");
        char operation = scanner.next().charAt(0);

        if(operation == '+')
        {
            Float result = a + b;
            System.out.println(result);
        }
        else if (operation == '-')
        {
            Float result = a - b;
            System.out.println(result);
        }
        else if (operation == '*')
        {
            Float result = a * b;
            System.out.println(result);
        }
        else if (operation == '/')
        {
            Float result = a / b;
            System.out.println(result);
        }


 //       String testValue = "Random tekst";
 //       String secondTestValue = "";

   //     System.out.println(testValue.toLowerCase());
   //     System.out.println(testValue.toUpperCase());
   //     System.out.println(secondTestValue.toUpperCase());
    }

    private static int calc(int a, int b) {
        return 0;
    }
}