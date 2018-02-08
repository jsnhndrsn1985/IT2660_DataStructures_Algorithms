import java.util.Scanner;
public class Listing
{
   
   private int age;
   private String name;
   
   public Listing()
   {
       age = 0;
       name = "";
   }
 
   public Listing(String listingName, int listingAge)
   {
       age = listingAge;
       name = listingName;
   }
  
   public String toString()
   {
       return "Listing Name: " + name + "\nListing Age: " + age;
   }
  
   public void input()
   {
       Scanner userInput = new Scanner(System.in);
           System.out.print("Please enter a name: ");
               name = userInput.nextLine();
          
           System.out.print("Please enter an age: ");
               age = userInput.nextInt();
       userInput.nextLine();
   }
  
   public void setName(String setListingName)
   {
       name = setListingName;
   }
  
   public void setAge(int setListingAge)
   {
       age = setListingAge;
   }
   
   public String getName()
   {
       return name;
   }
  
   public int getAge()
   {
       return age;
   }
}