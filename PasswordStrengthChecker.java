import java.util.Scanner;

public class PasswordStrengthChecker {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a password: ");
        System.out.println();
        String password = scanner.nextLine();
        
        int length = password.length();
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        
        for (char c : password.toCharArray()) 
        {
            if (Character.isUpperCase(c)) 
            {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) 
            {
                hasLowercase = true;
            } else if (Character.isDigit(c))
            {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c))
            {
                hasSpecialChar = true;
            }
        }
        
        int strength = 0;
        if (length >= 8)
        {
            strength++;
        }
        if (hasUppercase)
        {
            strength++;
        }
        if (hasLowercase)
        {
            strength++;
        }
        if (hasDigit) {
            strength++;
        }
        if (hasSpecialChar) 
        {
            strength++;
        }
        
        String strengthMessage;
        switch (strength)
        {
            case 0:
                strengthMessage = "Very Weak";
                break;
            case 1:
                strengthMessage = "Weak";
                break;
            case 2:
                strengthMessage = "Moderate";
                break;
            case 3:
                strengthMessage = "Strong";
                break;
            case 4:
                strengthMessage = "Very Strong";
                break;
            default:
                strengthMessage = "Excellent";
                break;
        }
        
        System.out.println("Password Strength: " + strengthMessage);
    }
}
