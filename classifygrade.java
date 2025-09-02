import java.util.Scanner;

/* write a java program to accept the marks of a student and then display the grades using a switch case conditional statement.*/

public class classifygrade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter grade from (A, B, C or F) : ");

        String str = scanner.next();
        char grade = str.charAt(0);

        switch (grade) {
            case 'A','a':
                System.out.println("Grade A - marks >=80");
                break;

            case 'B', 'b':
                System.out.println("Grade B - marks >=60");
                break;

            case 'C','c':
                System.out.println("Grade C - marks >=40");
                break;

            case 'F','f':
                System.out.println("Grade F - marks <40 FAIL");
                break;

            default : //optional
                System.out.println("Invalid Grade");
                break; //optional
        }
    }
}