import java.util.Scanner;

public class ArrayExercise {
    public static void main(String[] args) {
        
        int[] employeeID = new int[10];
        String[] employeeName = new String[10];
        
        Scanner keyboard = new Scanner(System.in);
        
        for (int count = 0; count < employeeID.length; count++) {
            System.out.print("Enter ID number for employee " + (count+1) + ": ");
            employeeID[count] = keyboard.nextInt();
            keyboard.nextLine();
            System.out.print("Enter Name for employee " + (count+1) + ": ");
            employeeName[count] = keyboard.nextLine();
        }
        
        System.out.println("\nEmployees whose ID number is less than 1000.");
        for (int count = 0; count < employeeID.length; count++) {
            if (employeeID[count] <1000) {
                System.out.println("Employee ID: " + employeeID[count]);
                System.out.println("Employee Name: " + employeeName[count]);
            }
        }
        
        System.out.println("\nEmployees whose Name begins with 'S' or 'J'.");
        for (int count = 0; count < employeeID.length; count++) {
            if (employeeName[count].charAt(0) == 'J' || employeeName[count].charAt(0) == 'S') {
                System.out.println("Employee ID: " + employeeID[count]);
                System.out.println("Employee Name: " + employeeName[count]);
            }
        }
    }
}
