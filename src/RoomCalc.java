import java.util.Scanner;

/**
 * Created by christophernamyst on 1/30/17.
 */
public class RoomCalc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int answer = 1;
        // Prompt user input to enter values of L and W of said classroom
        // Display the area and perimeter of said classroom
        // Ask if the user would like to continue
        System.out.println("Bienvenido a la GCs' Room Detail Generator!");//1. greet user

        while (answer == 1) {  //initiate while loop

            System.out.print("Please enter the length of the room : ");//2. ask for input
        double length = scan.nextDouble();//3. input is being scanned

            System.out.print("Please enter width of the room: ");//4. ask for input
        double width = scan.nextDouble();//5. input is being scanned

        double area = length * width;//6. system is performing the calculation

        System.out.println("The area of the room is: " + area);//system outputs equation(answer)

        double perimeter = 2 * length + 2 * width;//performing calculations

        System.out.println("The perimeter of the room is: " + perimeter);//system outputs equation(answer)

        System.out.println("Would you like to continue?: Please enter a 1 for Yes and 2 for No ");//asking for user input
        answer = scan.nextInt();//scanning for answer
        }
        System.out.print("Thank you for playing, Buenos Tardes!! ");//closing statement
        scan.close();
        }

    }

