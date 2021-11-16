package hingst.bank.screens;

import hingst.bank.util.ScreenRouter;

import java.io.BufferedReader;

import static hingst.bank.util.AppState.shutdown;

public class WelcomeScreen extends Screen{

    public WelcomeScreen(BufferedReader consoleReader, ScreenRouter router) {
        super("WelcomeScreen", "/welcome", consoleReader, router);
    }

    @Override
    public void render() throws Exception {

        System.out.print("\nWELCOME TO BANK OF FRED\n" +
                "Press 1 to open account\n" +
                "Press 2 for your account\n" +
                "Press 3 to exit the menu\n" +
                "Enter choice here ->->->->");

        String userSelection = consoleReader.readLine();

        switch (userSelection) {
            case "1":
                System.out.println("What sort of account?");
                System.out.println("C for checking, or S for savings");
                router.navigate("/register");
                break;
            case "2":
                System.out.println("What is your account number?");
                String acctNum = consoleReader.readLine();
                System.out.println("Our system is experiencing difficulties");
                break;
            default:
                System.out.println("Customer has entered an invalid selection\nPlease try again");

            case "3":
                System.out.println("Exiting session");
                shutdown();

        }

    }

    private void shutdown() {
    }
}
