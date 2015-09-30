package input.model;

public class Thing
{
	private String name;
	private int age;
	private double weight;
	
	/**
	 * getters will get the info you need.
	 */
	public Thing()
	{
		age = -99;
		weight = -.0000005;
		name = "";
	}
	
	/**
	 * setters will set the info replacing what you put.
	 * @param name
	 * @param age
	 * @param weight
	 */
	public Thing(String name, int age, double weight)
	{
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public double getWeight()
	{
		return weight;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public void setName(int age)
	{
		this.age = age;
	}
	
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	/**
	 * returns all the veriablefrom the object and retuns it as a string.
	 */
 	public String toString()
	{
		String thingInfo = " name " + name + " age " + age + " weight " + weight;
		return thingInfo;
	}
}
