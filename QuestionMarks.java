//check if there are exactly 3 question marks between every pair of two numbers that add up to 10
import java.util.*;

public class QuestionMarks{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.println(QuestionMarks(s.nextLine()));

		System.out.println(QuestionMarks("arrb6???4xxbl5???eee5"));			//should return true
		System.out.println(QuestionMarks("acc?7??sss?3rr1??????5"));		//should return true
		System.out.println(QuestionMarks("9???1???9???1???9"));				//should return true
		System.out.println(QuestionMarks("arrb6???4xxbl"));					//should return true
		System.out.println(QuestionMarks("aa6?9"));							//should return false
		System.out.println(QuestionMarks("5??aaaaaaaaaaaaaaaaaaa?5?5"));	//should return false
		System.out.println(QuestionMarks("arrb7???4xxbl4???eee5"));			//should return false
		System.out.println(QuestionMarks("9???1???9???3???9"));				//should return false but returns true
	}

	public static String QuestionMarks(String str) {
		char[] myArray;
		myArray = str.toCharArray();

		int numTester, sum;
		boolean condition1 = false;
		boolean condition2 = true;

		for (int i = 0; i < myArray.length; i++) {

			numTester = myArray[i];

			if (numTester > 47 && numTester < 58) {
				for (int j = (i + 1); j < myArray.length; j++) {

					numTester = myArray[j];

					if (numTester > 47 && numTester < 58) {

						if ((Character.getNumericValue(str.charAt(i)) + Character.getNumericValue(str.charAt(j))) == 10) {

							condition1 = true;
							sum = 0;
							for (int k = i + 1; k < j; k++) {

								if (myArray[k] == '?') {
									sum += 1;
								}
							}
							if (sum != 3) {
								condition2 = false;
							}
						}
						break;
					}
				}
			}
		}
		if (condition1 == true && condition2 == true){
			return "True";
		}else{
			return "False";
		}

	}
}

