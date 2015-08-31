import java.util.Random;
import java.util.Scanner;

public class SimpleDotComTestDrive {
	public static void main (String[] args) {
		SimpleDotCom dot = new SimpleDotCom();		
		int [] location = new int[3];
		int i = 0;
		Random r = new Random();
		while(i < 3){
			location[i] = r.nextInt(5 - 0) + 0;
			//int randomNum = (int) (Math.random() * 5)
			// creates something between 0 - 4
			i++;
		}
		
		for (int value1 : location){
			System.out.println(value1);
		}
		dot.setLocationCells(location);
		Scanner in = new Scanner(System.in);
		
		while (dot.numOfHits < 3){
			System.out.println("Enter a number: ");
			String userGuess = in.nextLine();
			String result = dot.checkYourself(userGuess);	
			dot.numOfGuess++;	
			String testResult = "failed";
			if (result.equals("hit")){
				testResult = "passed";
			}
			if (dot.numOfHits == 3){
				System.out.println("Kill");
				System.out.print("The Total number of Guesses you took: ");
				System.out.println(dot.numOfGuess);
			}
			System.out.println(testResult);
		}
	}
}


class SimpleDotCom {
	int numOfHits = 0;
	int [] locationCells;
	int numOfGuess = 0;
	
	
	public void setLocationCells(int [] locs){
	locationCells = locs;
	}
	
	
	public String checkYourself(String stringGuess){	
		String result = "miss";
		int guess = Integer.parseInt(stringGuess);
		//above line converts string into an int
		for (int cell : locationCells){
		//Read the above line as for each value in
		//locationCells assign the value to cell
		//which is also an int
			if (guess == cell) {
				result = "hit";
				numOfHits ++;
				break;
			}
			if (numOfHits == locationCells.length) {
				result = "kill";				
			}
		}
		System.out.println(result);
		return result;			
	} 
}