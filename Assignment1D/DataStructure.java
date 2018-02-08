public class DataStructure

{
     Listing[] data;
     int size = 100;
     int next = 0;
     
     DataStructure ()
     {
          data = new Listing[size];
     }

     DataStructure (int numberOfListings)
     {
          data = new Listing[numberOfListings];
     }

     void addListing (Listing newListing)
     {
          data[next] = newListing;
          next = next + 1;
     }

     void showAllListings()
     {
          for(int i=0;i<next;i++)
          {
              System.out.println(data[i].toString());
          }
     }
}