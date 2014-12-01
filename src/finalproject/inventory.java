package finalproject;
import java.util.ArrayList;
public class inventory {
	
	public static ArrayList<String> inventory = new ArrayList<String>();
	public static boolean sword = false;
	public static boolean shield = false;
	public static boolean goggles = false;
	public static boolean key = false;
	public static boolean treasure = false;
	public static boolean map = false;
	
	/**
	 * Displays the current items in inventory;
	 */
	public static void display()
	{
		for (int x = 0; x<=inventory.size(); x++)
			System.out.print(inventory.get(x));
	}
	
	/**
	 * Adds an item to the ArrayList<String>inventory and sets their variable to true.
	 * @param item
	 */
	public static void additem(String item)
	{
		inventory.add(item);
		if(item.equals("anti virus sword"))
		{
			sword = true;
		}
		else if(item.equals("fire wall shield")){
			shield = true;
		}
		else if(item.equals("scan goggles")){
			goggles = true;
		}
		else if(item.equals("key")){
			key = true;
		}
		else if(item.equals("treasure")){
			treasure = true;
		}
		else if(item.equals("map")){
			map = true;
		}
	}
	
}
