public class location
{
    //string array of included locations
    String[] zipcodes = {"75080", "75068", "75033", "75021"};
    String[] addressses = {"1234 apple ln, richardson, TX 75080", "4567 maple dr, Seattle, Washington 75021"};
    String addres;
    String zip;
    String addressTest;
    /**
     * Constructor for objects of class login
     */
    public location()
    {
        //default constructor
        
    }
    
    public location(String address)
    {
        addres = address;
    }
    
    public boolean checkAddress(String a)
    {
        String z = a.substring(a.length() - 5);
        System.out.println("zipcode extracted : " + addressTest);
        for(int i = 0; i < zipcodes.length; i++)
        {
            if(z.equals(zipcodes[i]))
            {
                //if matching username is found
                //check for matching password
                if(addressTest.equals(zipcodes[i]))
                {
                    System.out.println("Address Matched to Database!");
                    return true;
                }
                
            }
        }
        return false;
    }
}
