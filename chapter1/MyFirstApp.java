public class MyFirstApp {
    public static void main (String[] args) {

          System.out.print("Compulsory printing Hello World rule" + " \n");
          int x = 3;
          String name = "Popeye"; //For some reason
          System.out.println(name + " The Sailor Man");
          x = x +5;
          System.out.print("x is " + x + "\n");
          double d = Math.random();
          System.out.print("d is " + d + " \n");
          // This is a comment
          for (x = x; x < 10; x++){
          	if (x == 9){
          		System.out.print("Horray X is " + x + "\n");
          	}
          	else if (x == 8) {
          		System.out.print("Damn still X is " + x + "\n");
          	}
          	else {
          		System.out.print("Neither 8 nor 9" + "\n");
          	}	
          	System.out.print("In FOR loop X is " + x + " \n");
          }
    }
}
