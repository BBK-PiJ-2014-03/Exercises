import java.util.Scanner;

public class ErrorHandlingUserInput {

    Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        ErrorHandlingUserInput test = new ErrorHandlingUserInput();
        
        test.launch();
    }
    
    public void launch () {
        //String str = System.console().readLine();
        //Integer.parseInt(str);
        //Double.parseDouble(str);
        //Boolean.parseBoolean(str);
        
        System.out.println("Average > " + getAverage(getLimit()));
        
    }
    
    private int getLimit () {
        try {
            System.out.print("How many numbers would you like to enter? > ");
            String str = keyboard.nextLine();
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            System.out.print("Not a number.");
            return getLimit();
        }
    }
    
    private double getAverage (int number) {
        double total = 0;
        
        for (int i = 0; i < number; i++) {
            try {
                System.out.print("Enter a number > ");
                String str = keyboard.nextLine();
                int num = Integer.parseInt(str);
                total += num;
            } catch (NumberFormatException ex) {
                System.out.println("Not a number");
                i--;
            }
        }
        return (total/number);
    }
