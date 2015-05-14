import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {
    
    @Test
    public void testsNormalName() {
        Person first = new Person();
        String input1 = "Dereck Robert Yssirt";
        String output1 = first.getInitials(input1);
        String expected1 = "DRY";
        assertEquals(output1, expected1);
        
        Person second = new Person();
        String input2 = "Roger      Smith           Johnson";
        String output2 = second.getInitials(input2);
        String expected2 = "RSJ";
        assertEquals(output2, expected2);
    }
    
    
    @Test
    public void testWhiteSpaceName() {
        Person third = new Person();
        String input3 = "I  J  W";
        String output3 = third.getInitials(input3);
        String expected3 = "IJW";
        assertEquals(output3, expected3);
    }
    
    @Test
    public void testNull() {
        Person fourth = new Person();
        String input4 = null;
        String output4 = fourth.getInitials(input4);
        String expected4 = null;
        assertEquals(output4, expected4);
    }
    
    @Test
    public void testEmpty() {
        Person fifth = new Person();
        String input5 = "";
        String output5 = fifth.getInitials(input5);
        String expected5 = "";
        assertEquals(output5, expected5);
    }
    
    @Test
    public void testLeadingWhiteSpace() {
        Person sixth = new Person();
        String input6 = "       Tom Rogers";
        String output6 = sixth.getInitials(input6);
        String expected6 = "TR";
        assertEquals(output6, expected6);
    }
    
    @Test
    public void testTrailingWhiteSpace() {
        Person seventh = new Person();
        String input7 = "Tom Rogers              ";
        String output7 = seventh.getInitials(input7);
        String expected7 = "TR";
        assertEquals(output7, expected7);
    }
}
