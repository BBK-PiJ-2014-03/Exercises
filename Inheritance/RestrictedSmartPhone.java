public class RestrictedSmartPhone extends SmartPhone {
    
    public RestrictedSmartPhone(String brand) {
        super(brand);
    }
    
    /**
    *   Attempting to override a public method with a private method results
    *   in an "attempting to assign weaker access privileges" error
    *   You cannot override a method and reduce its visibility
    *
    */
    /* private String playGame(String game) {
        String message = "Error: Games are not playable from Restricted Smart Phones";
        return message;
    } */
}
