package input.view;

import javax.swing.JOptionPane;
/**
 * this class provides popups for input and out put.
 * @author talm8994
 *@version 1.0 9/24/15
 */

public class PopupDisplay
{
	/**
	 * Provides a popup box for asking questions and allows the user to submit a text answer.
	 * Returns the user responce as a String.
	 * @param input the supplied question for the popup.
	 * @return the user's answer the suplied question.
	 */
	public String getAnswer(String input)
	{
		String answer = "";
		
		answer = JOptionPane.showInputDialog(null, input);
		
		return answer;
	}
	/**
	 * This displays all the data. 
	 * @param input the text to be displayed.
	 */
	public void displayResponse(String input)
	{
		JOptionPane.showMessageDialog(null, input);
	}
}
