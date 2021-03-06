import java.util.Scanner;

class Assignment1 {
  public static void main(String[] args) {
   //Declare scanner
   Scanner scan = new Scanner (System.in);
   
   //Get inputs
   System.out.println ("Please enter the movie name. ");
   String title = scan.nextLine();
   
   System.out.println ("Please enter the running time in minutes. ");
   int time = scan.nextInt();
   
   System.out.println ("Please enter ratings from the movie review website. ");
   int online1 = scan.nextInt();
   int online2 = scan.nextInt();
   int online3 = scan.nextInt();
   
   System.out.println ("Please enter ratings from the focus group. ");
   double focus1 = scan.nextDouble();
   double focus2 = scan.nextDouble();
   
   System.out.println ("Please enter the average movie critic rating. ");
   double criticAverage = scan.nextDouble();
   
   //online and focus averages
   double onlineAverage = (double) (online1 + online2 + online3)/3;
   double focusAverage = (focus1 + focus2)/2;
   
   //weighted average
   int overallRating = (int) (onlineAverage*.2 + focusAverage*.3 + criticAverage*.5 + 0.5);
   
   //print results
   System.out.println("Title: " + title);
   System.out.println("Running time: " + time/60 + "h" + time%60);
   System.out.println("Average website rating: " + onlineAverage);
   System.out.println("Average focus group rating: " + focusAverage);
   System.out.println("Average movie critic rating: " + criticAverage);
   System.out.println("Overall movie rating: " + overallRating);
   
   
  }
}
