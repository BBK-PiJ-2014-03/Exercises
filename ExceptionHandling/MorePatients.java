import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MorePatients {

    private List<Patient> patientList;
    private Scanner keyboard = new Scanner(System.in);
    
    public static void main (String[] args) {
        
        MorePatients test = new MorePatients();
        test.patientList  = new ArrayList<Patient>();
        
        test.launch();
        
        for (Patient p : test.patientList) {
            System.out.println(p);
        }
    }
    
    private void launch () {
        for (int i = 0; i < 5; i++) {
            getPatient();
        }
    }
    
    
    /* private Patient getPatient () {
        Patient p;
        String str;
        int num;
        try {
            System.out.print("Enter patient name > ");
            str = keyboard.nextLine();
            System.out.print("Enter patient age > ");
            num = keyboard.nextInt();
            keyboard.nextLine();
            p = new Patient(str, num);
            return p;
        } catch (IllegalArgumentException e) {
            System.out.println(e);
            return getPatient();
        }
    } */
    
    private void getPatient () {
        Patient p = null;
        String str;
        int num;
        boolean flag = true;
        while (flag) {
            try {
                System.out.print("Enter patient name > ");
                str = keyboard.nextLine();
                System.out.print("Enter patient age > ");
                num = keyboard.nextInt();
                keyboard.nextLine();
                flag = false;
                p = new Patient(str, num);
                }
                catch (IllegalArgumentException e) 
                {
                    System.out.println(e);
                    flag = true;
                }
                

        }
        System.out.println("We're here");
        patientList.add(p);
    }
