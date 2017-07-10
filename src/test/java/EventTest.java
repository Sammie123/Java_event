import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void Event_instantiatesCorrectly_true() {
    Event myEvent = new Event(100, "", "", "", "", "", "");
    assertEquals(true, myEvent instanceof Event);
  }

  @Test
  public void Event_getGuest_100() {
    Event myEvent = new Event(100, "", "", "", "", "", "");
    assertEquals(100, myEvent.getGuest());
  }

  @Test
  public void Event_getEntree_chicken() {
    Event myEvent = new Event(100, "chicken", "", "", "", "", "");
    assertEquals("chicken", myEvent.getEntree());
  }

  @Test
  public void Event_getBeverage_water() {
    Event myEvent = new Event(100, "chicken", "water", "", "", "", "");
    assertEquals("water", myEvent.getBeverage());
  }

  @Test
  public void Event_getEntertainment_dancing() {
    Event myEvent = new Event(100, "chicken", "water", "dancing", "", "", "");
    assertEquals("dancing", myEvent.getEntertainment());
  }

  @Test
  public void Event_getCoupon_morning() {
    Event myEvent = new Event(100, "", "", "", "morning", "", "");
    assertEquals("morning", myEvent.getCoupon());
  }

  @Test
  public void Event_getDiscount_DISCOUNT() {
    Event myEvent = new Event(100, "", "", "", "", "DISCOUNT", "");
    assertEquals("DISCOUNT", myEvent.getDiscount());
  }

  @Test
  public void Event_getLocation_park() {
    Event myEvent = new Event(100, "", "", "", "", "", "park");
    assertEquals("park", myEvent.getLocation());
  }

  @Test
  public void Event_costEvent_150() {
    Event myEvent = new Event(101, "chicken", "water", "dancing", "morning", "DISCOUNT", "park");
    assertEquals(125, myEvent.costEvent());
  }
}
