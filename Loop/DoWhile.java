import java.util.Scanner;

public class DoWhile {

    Scanner keyboard = new Scanner(System.in);
    
    public static void main(String[] args) {
        DoWhile test = new DoWhile();
        test.examEntry();
    }
    
    public void examEntry() {
        int students = 0;
        int distinctions = 0;
        int pass = 0;
        int fail = 0;
        int invalid = 0;
        
        int userEntry;
        
        do {
            System.out.print("Enter score for student number " + (students+1) + ": ");
            userEntry = keyboard.nextInt();
            
            if (userEntry > 69 && userEntry < 101) {
                distinctions++;
                students++;
            }
            else if (userEntry > 49 && userEntry < 70) {
                pass++;
                students++;
            }
            else if (userEntry > -1 && userEntry < 50) {
                fail++;
                students++;
            }
            else {
                invalid++;
            }
            
        } while (userEntry != -1);
        
        System.out.println("There are " + students + " Students." +
                           "\nThere are " + distinctions + " Distinctions." +
                           "\nThere are " + pass + " Passes." +
                           "\nThere are " + fail + " Fails." +
                           "\nThere are " + (invalid-1) + " Invalid entries.");
    }
}
