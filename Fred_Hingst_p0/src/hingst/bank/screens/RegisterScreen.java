package hingst.bank.screens;

import hingst.bank.exceptions.InvalidRequestException;
import hingst.bank.exceptions.ResourcePersistenceException;
import hingst.bank.models.AppUser;
import hingst.bank.services.UserService;
import hingst.bank.util.ScreenRouter;

import java.io.BufferedReader;

public class RegisterScreen extends Screen{

    private final UserService userService;

    public RegisterScreen(BufferedReader consoleReader, ScreenRouter router, UserService userService) {
        super("RegisterScreen", "/register", consoleReader, router);
        this.userService = userService;
    }

    @Override
    public void render() throws Exception {
        System.out.println("The customer opted to go to account");
        System.out.println("Please provide us with some basic information.");
        System.out.print("First name: ");
        String firstName = consoleReader.readLine();

        System.out.print("Last name: ");
        String lastName = consoleReader.readLine();


        System.out.print("Password: ");
        String password = consoleReader.readLine();

        System.out.printf("Provided customer first and last name: { \"firstName\": %s, \"lastName\": %s}\n", firstName, lastName);
        // String format specifiers: %s (strings), %d (whole numbers), %f (decimal values)


            System.out.println("Account located");

         shutdown();

        }


         private void shutdown(){

         }

    }

