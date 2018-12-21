/* 
   11/2/14
   JDK 1.7
   This is a simple Java program that guesses the season 
   depending on the temperature entered.
   Return arguments (type String)
*/
import javax.swing.*;
public class Seasons {
    public static void main(String[] args) {
    int inputTemp = Integer.parseInt(JOptionPane.showInputDialog(null,
            "Enter the temperature in Fahrenheit", "Probable season", 1));
    String message = "Based on the temperature of " + inputTemp +
            " it is most likely " + determineSeason(inputTemp);               
    if (inputTemp < -20 || inputTemp > 130) {
        JOptionPane.showMessageDialog(null, "Your temperature is invalid");
    } else 
	JOptionPane.showMessageDialog(null, message);             
    }
    public static String determineSeason(int temp){
        if (temp >= 90 && temp <= 130) 
            return "Summer";
        else if (temp >= 70 && temp < 90)
            return "Spring";
        else if (temp >= 50 && temp < 70)
            return "Fall";
        else  
            return "Winter";        
    }
}