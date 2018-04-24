/*
check if there are exactly 3 question marks between EVERY pair of two numbers that add up to 10
*/
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class QuestionMarksActual{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.println(QuestionMarks(s.nextLine()));

		System.out.println(QuestionMarks("arrb7???4xxbl4???eee5"));		//quicker instead of repeating input	-	should return false
	}

	public static String QuestionMarks(String str) {
		String bool = "false";
		int index = 0;
		int count = 0;
		int num = 0;
		int first = 0;
		int second = 0;
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {				//iterates the indexes of the String

			if (Character.isDigit(str.charAt(i))) {				//if the character at index i is a digit
				index = i;

				for (int j = i + 1; j < str.length(); j++) {	//starts the iteration with the following character

					if (Character.isDigit(str.charAt(j))) {		//if its a digit goes on to the next index
						num++;
						break;
					}
					if (str.charAt(j) == '?') {					//if its '?' the count++
						count++;
					}
				}
				if (count > 0 && count != 3 && num == 1) {		//if there's two numbers together and 1 or two '?' it returns false
					return "false";
				}
				if (count == 3 && num == 1) {					//if there's 3 '?', the moment there's another number it returns truea and restarts the counters
					bool = "true";
					count = 0;
					num = 0;
				}
			}
		}

		return bool;

	}
}

//arrb6???4xxbl5???eee5			true
//acc?7??sss?3rr1??????5		true
//5??aaaaaaaaaaaaaaaaaaa?5?5		false
//9???1???9???1???9			true
//aa6?9					false

//arrb7???4xxbl4???eee5			false	-	but the application returns true (its missing the sum = 10)

//arrb6???4xxbl

//first = Character.getNumericValue(str.charAt(i));		returns the int value that the specified Unicode character represents
