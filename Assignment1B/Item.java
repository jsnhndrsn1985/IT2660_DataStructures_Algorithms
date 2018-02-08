import java.util.*;
import java.text.NumberFormat;
public class Item
{
    private String name;
    private double price;
    
    public static final double TOLERANCE = 0.0000001;
    
    public Item(String name,double price)
    {
        this.name = name;
        this.price = price;
    }
    
    public Item()
    {
        this("",0.0);
    }
    
    public Item(Item other)
    {
        this.name = other.name;
        this.price = other.price;
    }
    
    public String getName()
    {
        return name;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setPrice(double price)
    {
        this.price = price;
    }
    
    public void input()
    {
       
       Scanner scan = new Scanner (System.in);
       System.out.println("Please enter an item name");
       name = scan.nextLine();
       System.out.println("Please enter an item price");
       price = scan.nextDouble();
    }
    
    public void show()
    {
            System.out.println(toString());
    }

    public String toString()
    {
        NumberFormat defaultFormat = NumberFormat.getCurrencyInstance(); 
        return "Item: " + name + " Price: " + defaultFormat.format(price);
    }
    
    public boolean equals(Object other)
    {
        if(other == null)
            return false;
        else if(getClass() != other.getClass())
            return false;
        else
        {
            Item otherItem = (Item)other;
            return(name.equals(otherItem.name)
                && equivalent(price, otherItem.price));
        }
        
    }
    
    private static boolean equivalent(double a, double b)
    {
        return ( Math.abs(a - b) <= TOLERANCE );
    }
    

}