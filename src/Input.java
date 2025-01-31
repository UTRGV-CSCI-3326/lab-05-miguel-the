import java.util.Scanner;

public class Input
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String Name = scanner.nextLine();  
   
        System.out.println("Enter age:");
        int Age = scanner.nextInt();

        System.out.println("Enter weight:");
        int Weight = scanner.nextInt();

        System.out.println("Do you smoke (y/n)?:");
        String smokeInput = scanner.next();
        Boolean Smoke = smokeInput.equals("y");

        System.out.println("Name is: " + Name);
        System.out.println("Age is: " + Age);
        System.out.println("Weight is: " + Weight);
        System.out.println("Smoker: " + Smoke);

        scanner.close();
    }
}
