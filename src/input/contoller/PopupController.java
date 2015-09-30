package input.contoller;

import input.view.PopupDisplay;
import input.model.Thing;
public class PopupController
{
	private PopupDisplay myPopups;
	private Thing myThing;
	public PopupController()
	{
		myPopups = new PopupDisplay();
	}
	
	public void start()
	/**
	 * starts the import system.
	 */
	{
		String name = myPopups.getAnswer(" Type in your name ");
		
		myPopups.displayResponse(" you typed in " + name);
		
		int age;
		String tempAge = myPopups.getAnswer(" type in your age ");
		
		while(!isInteger(tempAge))
		{
			tempAge = myPopups.getAnswer("type in a integer value!!!!!");
		}
		
		myPopups.displayResponse(" you typed age ");
		if(isInteger(tempAge))
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -123456789;
		}
		
		myPopups.displayResponse(" you are " + age );
		
		double weight;
		String tempWeight = myPopups.getAnswer("type in our weight");
		myPopups.displayResponse("you typed in weight");
		while(!isDouble(tempWeight))
		{
			tempWeight = myPopups.getAnswer("Give me valid double value!");
		}
		
		if(isDouble(tempWeight))
		{
			weight =Double.parseDouble(tempWeight);
		}
		else
		{
			weight = 120;
		}
		myPopups.displayResponse(" you typed " + weight);
		
		myThing = new Thing(name, age, weight);
		
		myPopups.displayResponse(myThing.toString());
	}

	private boolean isInteger(String input)
	{
			boolean isInt = false;
				
			try
			{
				int validInteger = Integer.parseInt(input);
				isInt = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("you did not typle in a valid int");
			}
			return isInt;
	}
		
	
/**
 * it 
 * @param input
 * @return
 */
	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
			}
			catch(NumberFormatException error)
			{
				myPopups.displayResponse("you did not tipe valid number.");
		}
		return isDouble;
		}
	}
	
