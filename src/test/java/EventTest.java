import org.junit.*;
import static org.junit.Assert.*;

public class EventTest {

  @Test
  public void costEvent_howMuchForOverOneHundredGuest_100(){
    Event event = new Event();
    assertEquals(100, event.costEvent(101, "", ""));
  }

  @Test
  public void costEvent_howMuchForEntree_75(){
    Event event = new Event();
    assertEquals(75, event.costEvent(0, "chicken",""));
  }

  @Test
  public void costEvent_combineCost_175() {
    Event event = new Event();
    assertEquals(175, event.costEvent(175, "chicken",""));
  }

  @Test
  public void costEvent_combineCost_225(){
    Event event = new Event();
    assertEquals(225, event.costEvent(175, "chicken", "water"));
  }

  @Test
  public void costEvent_addCoupon_substract50() {
    Event event = new Event();
    assertEquals(200, event.costEvent(150, "chicken", "water", "music", "morning"));
  }

  @Test
  public void costEvent_addCoupon_substract150(){
    Event event = new Event();
    assertEquals(100, event.costEvent(150, "chicken", "water", "music", "morning", "DISCOUNT", "park"));
  }

























}
