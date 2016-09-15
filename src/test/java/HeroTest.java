import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class HeroTest {

  @Test
  public void Hero_instantiatesCorrectly_true() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals(true, myHero instanceof Hero);
  }

  @Test
  public void Hero_returnsName_String() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals("Hero Guy", myHero.getName());
  }

  @Test
  public void Hero_returnsAge_int() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals(8, myHero.getAge());
  }

  @Test
  public void Hero_returnsPower_String() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals("Fire dick", myHero.getPower());
  }

  @Test
  public void Hero_returnsWeakness_String() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals("Dick is literally on fire", myHero.getWeakness());
  }

  @Test
  public void Hero_returnsAttackPoints_Integer() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals((Integer)9, myHero.getAttackPoints());
  }

  @Test
  public void Hero_returnsDefensePoints_Integer() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals((Integer)5, myHero.getDefensePoints());
  }

  @Test
  public void Hero_returnsHealthPoints_Integer() {
    Hero myHero = new Hero("Hero Guy", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    assertEquals((Integer)18, myHero.getHealthPoints());
  }
}
