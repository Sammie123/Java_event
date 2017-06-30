import java.io.Console;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    boolean programRunning = true;

    while(programRunning) {
      System.out.println("Welcome to Starks' Event Planning! Lets get started with some questions to determine what you want at your event!");

      System.out.println("How many guest will be attenting to your event?");
      String stringGuest = myConsole.readLine();
      int intGuest = Integer.parseInt(stringGuest);

      System.out.println("What entree will you be serving? chicken or beef?");
      String stringEntree = myConsole.readLine();

      System.out.println("What drinks will you be serving? water or champagne?");
      String stringBeverage = myConsole.readLine();

      System.out.println("What kind of entertainment will you have? music or dancing?");
      String stringEntertainment = myConsole.readLine();

      System.out.println("We do offered discounts. One coupon that we offered is a $50 discount if the event will be morning. Will your event be in the morning or evening?");
      String stringCoupon = myConsole.readLine();

      System.out.println("Do you have a coupon code? If yes, write it below in all caps(**user please type DISCOUNT**).");
      String stringDiscount = myConsole.readLine();
      System.out.println("In additon to your promo code, we do offered another discount if your event is hosted at Lincoln's Park. If you would like to host your event at our park, type 'park' below");
      String stringLocation = myConsole.readLine();

      Event event = new Event();

      int totalCost = 0;
      int cost = event.costEvent(intGuest, stringEntree, stringBeverage, stringEntertainment, stringCoupon, stringDiscount, stringLocation);
      totalCost += cost;

      System.out.println("Below is a summary of your event and cost");
      System.out.println("----------------");
      System.out.println("Number of Guest: " + intGuest);
      System.out.println("Choice of Entree: " + stringEntree);
      System.out.println("Choice of Beverage: " + stringBeverage);
      System.out.println("Choice of Entertainment: " + stringEntertainment);
      System.out.println("Cost is " + "$" + totalCost);

      programRunning = false;






    }
  }
}
