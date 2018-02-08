
/**
 * Chapter 1 - Assignment B
 * @author (Jason Henderson)
 * @version (01/29/2018)
 */
import javax.swing.JOptionPane;
import java.util.*;
import java.text.NumberFormat;
import java.util.ArrayList;
public class TestItem
{
        public static void main(String[] args){
            //smaller array
            GroceryList();
            //Number 7
            System.out.println("Would you like to input another list, Yes or No?");
            Scanner newList = new Scanner(System.in);
            String str = newList.next();
            if(str.equalsIgnoreCase("no"))
            {
                System.out.println("Goodbye");
                System.exit(0);
            }
            else
            {
                GroceryList();
            }
            //larger array
            GroceryListLarge();
            //Number 7
            System.out.println("Would you like to input another list, Yes or No?");
            Scanner newListLarge = new Scanner(System.in);
            String strLarge = newListLarge.next();
            if(strLarge.equalsIgnoreCase("no"))
            {
                System.out.println("Goodbye");
                System.exit(0);
            }
            else
            {
                GroceryListLarge();
            }
        }
        //popup message
        public static void popUp()
                {
                     JOptionPane.showMessageDialog(null, "Welcome to Tri-C");
                }
        //average the item amounts        
        public static double avgItems(ArrayList<Item> itemsArray)
                {
                    double sum = 0;
                    
                    for(int i=0;i<itemsArray.size();i++)
                    {
                                if(itemsArray.get(i).getPrice() >=0)
                                {
                                    sum += itemsArray.get(i).getPrice();
                                }
                    }
                                return sum/itemsArray.size();
                 }
        // reverse the array
        public static void reverseArray(ArrayList<Item> array)
    
                {
                for(int i=array.size()-1;i>=0;i--)
                
                {
                        System.out.println(array.get(i));
                }
            
                }
        
        //smaller array
        public static void GroceryList(){
                    //Number 5
                    popUp();
                    //Number 1
                    //Item newItem = new Item();
                    //newItem.input();
                    //newItem.show();
                    //Number 2 & 3
                    ArrayList<Item> itemArray = new ArrayList<Item>();
                        for(int i=0;i<3;i++)
                            {
                                Item a = new Item();
                                a.input();
                            }  
                    double avgPrice = avgItems(itemArray);
                    NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();  
                    boolean findPeas = false;
                        for(int i=0;i<3;i++)
                            {
                                System.out.println("Item: "+itemArray.get(i).getName()+ " Price: "+itemArray.get(i).getPrice());
                                if("Peas".equalsIgnoreCase(itemArray.get(i).getName()))
                                {
                                    findPeas = true;
                                }
                            }  
                        if(findPeas == true)
                                    
                            {
                            System.out.println("Average Price:"+defaultFormat.format(avgPrice));
                            }
                            else
                            {
                            System.out.println("no average output.");
                            }
                    //Number 6       
                        reverseArray(itemArray);
                
        }
        //larger array
        public static void GroceryListLarge()
        {
            //Number 5
                    popUp();        
            //Number 4
                ArrayList<Item> largeItemArray = new ArrayList<Item>();
                    for(int i=0;i<100;i++)
                    {
                        Item b = new Item();
                        b.input();
                    }
                double avgPriceLarge = avgItems(largeItemArray);
                NumberFormat defaultFormatLarge = NumberFormat.getCurrencyInstance();  
                boolean findPeasLarge = false;
                    for(int i=0;i<3;i++)
                        {
                            System.out.println("Item: "+largeItemArray.get(i).getName()+ " Price: "+largeItemArray.get(i).getPrice());
                            if("Peas".equalsIgnoreCase(largeItemArray.get(i).getName()))
                            {
                                findPeasLarge = true;
                            }
                        }  
                    if(findPeasLarge == true)
                                
                        {
                        System.out.println("Average Price:"+defaultFormatLarge.format(avgPriceLarge));
                        }
                        else
                        {
                        System.out.println("no average output.");
                        }
                //Number 6       
                        reverseArray(largeItemArray);    
        }
        }
         
          
        
 