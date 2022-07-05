import java.util.Locale;
import java.util.Scanner;
public class UnderstandingTheWhileLoop {
    public static void main(String[] args) {
        boolean isTrue = false;
        String truePassword = "123@@123";
        Scanner sc = new Scanner(System.in);
        int counter=0;
        while (!isTrue){
            System.out.println("Enter your password, please");
            String accuratePassword = sc.nextLine();
            if (accuratePassword.contentEquals(truePassword)){
                System.out.println("You've successfully logged-in!");
                isTrue=true;
            }
            else{
                System.out.println("It seems that you've entered your password wrong.");
            counter++;
            if(counter == 3){
                System.out.println("Would you like to change your password?     (Y/n)");
                String answer = sc.nextLine().toLowerCase();
                switch (answer) {
                    case "y":
                        isTrue=true;
                        System.out.println("Enter your new password");
                        String newPassword = sc.nextLine();
                        truePassword = newPassword;
                        System.out.println("Would you like to try login with your new password?  " +
                                        "  (Y/n)");
                        String wannaTry = sc.nextLine().toLowerCase();
                        switch (wannaTry) {
                            //Maybe we can add a checking mechanism if the old and new passwords
                            // are the same or not. So if they are same, we don't let the user to
                            // continue to change user password.
                            case "y":
                                isTrue = false;
                                break;
                            case "n":
                               isTrue = true;
                                System.out.println("As you wish, dude! Adios!");
                               break;
                        }
                        break; //kayip olan break
                    case "n":
                        System.out.println("As you wish, dude! Adios!");
                        isTrue = true;
                        break;

                }
                }

            }
            }
        }



}
