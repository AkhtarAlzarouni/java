import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to our System,\n1: Login choose ,\n2: Register choose ,\n3: Exit choose ");
            int input = read.nextInt();
            switch (input){
                case 1 :
                    System.out.println(" enter your email to login: ");
                    String email = read.next();
                    boolean emailLogin = login.isValidmail(email);
                    if (emailLogin == true)
                        System.out.println(" email is valid");
                    else
                        System.out.println(" email  is invalid");

                    System.out.println("Please enter your password: ");
                    String password = read.next();
                    boolean passwordLogin = login.isValidPassLog(password);
                    if (passwordLogin == true) {
                        System.out.println("Correct Password");
                    }else {
                        System.out.println("Woring password");
                        break;
                    }System.exit(0);
                case 2:
                    System.out.println("ُEnter your data  registration");

                    System.out.println("Name: ");
                    String name = read.next();

                    System.out.println("Please enter you phone : ");
                    String phone = read.next();
                    boolean num = register.isValidPhoneNumber(phone);
                    if (num == true)
                        System.out.println("number is valid");
                    else
                        System.out.println("number is invalid");

                    System.out.println("Please enter your email : ");
                    String newEmail = read.next();
                    boolean result = register.isValid(newEmail);
                    if (result == true)
                        System.out.println(" email  is valid");
                    else
                        System.out.println("email  invalid");

                    System.out.println("Enter your password : ");
                    String newPassword = read.next();
                    boolean validpass = register.isValidPassword(newPassword);
                    if (validpass == true)
                        System.out.println("Password is valid");
                    else
                        System.out.println("Password is not valid");
                    break;
                case 3:
                    System.out.println("Thank you");
                    System.exit(0);
                default:
                    System.out.println("This choose Not available");
            }
        }
    }
}
class login {
    static boolean isValidmail(String email)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (email== null) {
            return false;
        }
        return pattern.matcher(email).matches();
    }
    static boolean isValidPassLog(String password)
    {
        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_]).{8,20}$";
        Pattern pas = Pattern.compile(regex);
        if(password == null){
            return false;
        }
        return pas.matcher(password).matches();
    }
}
 class register {
    static boolean isValid(String newEmail)
    {
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        if (newEmail == null) {
            return false;
        }
        return pattern.matcher(newEmail).matches();
    }
    static boolean isValidPhoneNumber(String phone)
    {
        String regex = "^(\\+\\d{3}( )?)?\\d{4}[- .]?\\d{4}$";
        Pattern p = Pattern.compile(regex);
        if (phone == null) {
            return false;
        }
        return p.matcher(phone).matches();
    }
    static boolean isValidPassword(String newPassword)
    {
        String regex ="^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%_]).{8,20}$";
        Pattern pas = Pattern.compile(regex);
        if(newPassword == null){
            return false;
        }
        return pas.matcher(newPassword).matches();
    }
}