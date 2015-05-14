public class PhoneLauncher {
    
    
    
    public static void main(String[] args) {
/*         OldPhone userPhone = new OldPhone();
        userPhone.call("0111012030"); */
        
        /* MobilePhone userPhone = new MobilePhone(); */
        
        SmartPhone userPhone = new SmartPhone("Nokia");
        
        userPhone.call("123");
        userPhone.call("1234");
        userPhone.call("12345");
        userPhone.call("123456");
        userPhone.call("1234567");
        userPhone.call("12345678");
        
        userPhone.printLastNumbers();
        
        userPhone.call("123");
        userPhone.call("1234");
        userPhone.call("12345");
        userPhone.call("123456");
        userPhone.call("1234567");
        
        userPhone.printLastNumbers();
        
        userPhone.browseWeb("www.birkbeck.ac.uk");
        
        System.out.println(userPhone.findPosition());
        
        userPhone.playGame("Pokemon");
        userPhone.printGame("Pokemon 2");
        
    }
}
