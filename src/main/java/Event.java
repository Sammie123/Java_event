public class Event {

  public int costEvent (int guest, String entree, String beverage, String entertainment, String coupon, String discount, String location)  {
    int totalCost = 0;
    if (guest > 100) {
      totalCost += 100;
    } else {
      totalCost += 50;
    }

    if (entree.equals("chicken")) {
      totalCost += 75;
    } else if (entree.equals("beef")) {
      totalCost += 50;
    }

    if (beverage.equals("water")) {
      totalCost += 50;
    } else if (beverage.equals("champagne")) {
      totalCost += 100;
    }

    if (entertainment.equals("music")) {
      totalCost += 25;
    } else if (entertainment.equals("dancing")) {
      totalCost += 50;
    }

    if (coupon.equals("morning")) {
      totalCost -= 50;
    } else if (coupon.equals("evening")) {
      totalCost -= 0;
    }

    if (discount.equals("DISCOUNT") && location.equals("park")) {
      totalCost -= 100;
    } else {
      return totalCost;
    }
    return totalCost;
  }
}
