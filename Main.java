import java.util.Scanner;
/**
 * Nidhi Medikonda
 */
public class Main
{
    public Main()
    {
        System.out.println("Welcome to pHinder!");
        //logging in 
        System.out.println("Let's get you logged in!");
        Scanner login = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your username : ");
        String userName = login.nextLine();
        System.out.println("Enter your password : ");
        String password = login.nextLine();
        login newUser = new login(userName,password);
        //validation
        boolean val = newUser.loginPassword(userName,password);
        while(!val)
        {
            System.out.println("Your credentials are invalid. Please enter again");
            login = new Scanner(System.in);
            System.out.println("Enter your username : ");
            userName = login.nextLine();
            System.out.println("Enter your password : ");
            password = login.nextLine();
            val = newUser.loginPassword(userName,password);
        }

        //getting name of user
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your first name : ");
        String fName = myObj.next();
        System.out.println("Enter your last name : ");
        String lName = myObj.next();
        System.out.println("Hello, " + fName + " " + lName);

        Scanner addres = new Scanner(System.in);
        System.out.println("Enter your location(address): ");
        String addy = addres.nextLine();
        location add = new location(addy);
        //if(add.checkAddress(addy))
        //{
            //System.out.println("Valid address entered.");
        //}
        //else
        //{
            //System.out.println("INVALID address");
        //}
        //medicine
        System.out.println("Your address is : " + addy);
        System.out.println("Pick your medicine from our catalog >>>");
        System.out.println("(1) Advil\n(2) lisinopril (Zestril)\n(3) phenol (Chloraseptic)\n(4) naproxen (Aleve)\n(5) simvastatin (Zocor)\n (6) atorvastatin (Lipitor)");
        
        System.out.println("Based on your location and medicine, here are the most optimal choices: ");
        System.out.println("In 5 miles radius, (1) CVS on Farm to Market Rd \n (2) Walmart Pharmacy Coit Rd");
        
        

    }
}
