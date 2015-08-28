public class BeerSong{
	public static void main (String[] args) {
		int beer_num = 10;
		String word1 = "bottles";
		String word2 = "bottles";
		while (beer_num >= 0){
			if (beer_num == 2) {
				word1 = "bottles";
				word2 = "bottle";
			}else if (beer_num == 1){
				word1 = "bottle";
				word2 = "bottles";
			}else if (beer_num == 0) {
				System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
				break;
			}
			System.out.print(beer_num + " " + word1 + " of beer on the wall, ");
			System.out.println(beer_num + " " + word1 +" of beer.");	
			beer_num = beer_num - 1;
			if (beer_num == 0){
				System.out.println("Take one down and pass it around, no more bottles of beer on the wall.");
			} else if (beer_num == 1){
				System.out.print("Take one down and pass it around, ");
				System.out.println(beer_num + " " + word2 + " of beer.");
			} else {
				System.out.print("Take one down and pass it around, ");
				System.out.println(beer_num + " " + word2 + " of beer.");
			}	
  	   } 	    
  	} 
}

//n bottles of beer on the wall, n bottles of beer.
//Take one down and pass it around, n-1 bottles of beer on the wall.

//2 bottles of beer on the wall, 2 bottles of beer.
//Take one down and pass it around, 1 bottle of beer on the wall.
//1 bottle of beer on the wall, 1 bottle of beer.
//Take one down and pass it around, no more bottles of beer on the wall.
//No more bottles of beer on the wall, no more bottles of beer. 
//Go to the store and buy some more, 99 bottles of beer on the wall.