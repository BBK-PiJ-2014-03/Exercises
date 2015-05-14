public class Person {
    
    public String getInitials(String fullName) {
        String result = "";
        if (fullName == null) {
            return null;
        }
        if (fullName == "") {
            return result;
        }
        else {
            String newFullName = fullName.trim();
            String[] words = newFullName.split("\\s+");
            for (int i = 0; i < words.length; i++) {
                String nextInitial = "" + words[i].charAt(0);
                result = result + nextInitial.toUpperCase();
            }
        }
        return result;
    }
}
