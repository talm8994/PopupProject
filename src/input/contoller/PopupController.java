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
	{
		String temp = myPopups.getAnswer("Type in your name");
		
		myPopups.displayResponse("you typed in" + temp);
		
		int age;
		String tempAge = myPopups.getAnswer("type in your age");
		myPopups.displayResponse("you typed" + age);
		{
			age = Integer.parseInt(tempAge);
		}
		else
		{
			age = -123456789;
		}
		
		double weight;
		String tempWeight = myPopups.getAnswer("type in our weight");
		myPopups.displayResponse("you typed in " + weight);
		
		myThing = new Thing(name, age, weight);
		
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

	private boolean isDouble(String input)
	{
		boolean isDouble = false;
		
		try
		{
			double validDouble = Double.parseDouble(input);
			isDouble = true;
			{
				my
			}
	}
	
