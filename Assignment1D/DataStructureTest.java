import java.util.Scanner;

public class DataStructureTest

{
     
     public static void main(String args[])
     
     {
         
         DataStructure a = new DataStructure(2); 
         //create
         Listing l1=new Listing("Jason",32);
         Listing l2=new Listing("Felix",3);
         //add
         a.addListing(l1);
         a.addListing(l2);
         //show
         a.showAllListings();
     }
}
