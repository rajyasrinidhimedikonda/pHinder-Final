public class login
{
    //string array of valid usernames
    //string array of valid passwords
    String[] usernames = {"Lisa", "Peter", "Scott", "Tanya"};
    String[] passwords = {"LisaPassword", "PeterPassword", "ScottPassword", "TanyaPassword"};

    String userNamee;
    String passwordd;
    /**
     * Constructor for objects of class login
     */
    public login()
    {
        //default constructor
        
    }
    
    public login(String userN, String pass)
    {
        //username validation
        userNamee = userN;
        passwordd = pass;
    }
    
    public boolean loginPassword(String userN, String pass)
    {
        for(int i = 0; i < usernames.length; i++)
        {
            if(userN.equals(usernames[i]))
            {
                //if matching username is found
                //check for matching password
                if(pass.equals(passwords[i]))
                {
                    System.out.println("You are logged in!");
                    return true;
                }
                else
                {
                    System.out.println("Incorrect password");   
                    return false;
                }
            }
            else if(i==usernames.length -1 && !userN.equals(usernames[i]))
            {
                System.out.println("Incorrect Username");
                return false;
            }
        }
        return false;
    }
}
