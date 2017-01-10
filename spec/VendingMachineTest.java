import static org.junit.Assert.*;
import org.junit.*;
import Vending.*;

public class VendingMachineTest {
  VendingMachine vending;

  @Before
  public void setup() {
    vending = new VendingMachine();
  }

  @Test
  public void testStartsNoMoney() {
    assertEquals(vending.getTotalMoney(), 0.00, 0.01);
  }
}