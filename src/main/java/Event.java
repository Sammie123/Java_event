public class Event {
  private int mGuest;
  private String mEntree;
  private String mBeverage;
  private String mEntertainment;
  private String mCoupon;
  private String mDiscount;
  private String mLocation;


  public Event (int guest, String entree, String beverage, String entertainment, String coupon, String discount, String location) {
    mGuest = guest;
    mEntree = entree;
    mBeverage = beverage;
    mEntertainment = entertainment;
    mCoupon = coupon;
    mDiscount = discount;
    mLocation = location;
  }

  int totalCost = 0;

  public int getGuest() {
    return mGuest;
  }
  //
  public String getEntree() {
    return mEntree;
  }

  public String getBeverage() {
    return mBeverage;
  }

  public String getEntertainment() {
    return mEntertainment;
  }

  public String getCoupon() {
    return mCoupon;
  }

  public String getDiscount() {
    return mDiscount;
  }

  public String getLocation() {
    return mLocation;
  }

  public int costEvent() {
    if (mGuest > 100) {
      totalCost += 100;
    } else {
      totalCost += 50;
    }

    if (mEntree.equals("chicken")) {
      totalCost += 75;
    } else if (mEntree.equals("beef")) {
      totalCost += 50;
    }

    if (mBeverage.equals("water")) {
      totalCost += 50;
    } else if (mBeverage.equals("champagne")) {
      totalCost += 100;
    }

    if (mEntertainment.equals("music")) {
      totalCost += 25;
    } else if (mEntertainment.equals("dancing")) {
      totalCost += 50;
    }

    if (mCoupon.equals("morning")) {
      totalCost -= 50;
    } else if (mCoupon.equals("evening")) {
      totalCost -= 0;
    }

    if (mDiscount.equals("DISCOUNT") && mLocation.equals("park")) {
      totalCost -= 100;
    } else {
      return totalCost;
    }
    return totalCost;
  }
}
