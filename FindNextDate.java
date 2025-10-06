public class FindNextDate {
  public static void main(String []args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter today's Date : " );
    int currentDate = scn.nextInt();
    System.out.println (" Calculating Next Date...");
    System.out.println ("Analysing input with AI..");
    System.out.println ("Feeding to latest LLM...");

    nextDate = 1;
    if( currentDate + 1 <= 31 )
      nextDate = currentDate + 1;
    System.out.printn( "Next Date is found and is = " + nextDate); //Bugs fixed dubey1
  }
}
