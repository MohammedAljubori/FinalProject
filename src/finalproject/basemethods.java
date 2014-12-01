package finalproject;

import java.util.Scanner;

public class basemethods {
	public static String command;
	public static boolean getsword;
	public static boolean getshield;
	public static boolean getgoggles;
	public static boolean getkey;
	public static boolean gettreasure;
	public static boolean getmap;
	
	/**
	 * Using Basemethods.entcom(); will have the user input a command and it
	 * will be saved. Use this every time you want the use to input a command
	 * and you can use it as a variable for the last entered command.
	 * 
	 * @return
	 */
	public static String entcom() {
		Scanner keyboard = new Scanner(System.in);
		command = keyboard.next();
		return command;
	}

	/**
	 * This method is a shortcut to having to type system.out.print every time.
	 * @param txt
	 */
	public static void text(String txt) {
		System.out.println(txt);
	}

	/**
	 * This is a switch case method that will handle the output of basic options
	 * to the user
	 */
	public static void basic() {
		switch (command) {
		case "task":
			if (getsword) {
				System.out.println("I need to find a weapon.");
				break;
			}
			else if (getgoggles) {
				System.out.println("I need a way to see the villain.");
				break;
			} 
			else if (getshield) {
				System.out.println("I need to find a means of defense.");
				break;
			}
			else if (getkey) {
				System.out.println("I need to find a key.");
				break;
			}
			else if (gettreasure) {
				System.out.println("I need to find a something valuable to trade.");
				break;
			}
			else if (getmap) {
				System.out.println("I need to find a map.");
				break;
			}
		case "bag":
			System.out.println("My inventory contains:");
			inventory.display();
			break;
		case "help":
			System.out
					.println("You can type 'task' 'bag' or explore other options");
			break;

		}
	}
}
