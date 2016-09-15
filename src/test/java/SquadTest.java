import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class SquadTest {

  @Test
  public void Squad_instantiantesCorrectly_true() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
  public void Squad_returnsName_String() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals("Motherfuckers", mySquad.getSquadName());
  }

  @Test
  public void Squad_returnsMaxSize_int() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals(3, mySquad.getMaxSize());
  }

  @Test
  public void Squad_returnsCause_String() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals("Fucking mothers", mySquad.getSquadCause());
  }

  @Test
  public void Squad_returnsAttackPoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals((Integer)58, mySquad.getAttackPoints());
  }

  @Test
  public void Squad_returnsDefensePoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals((Integer)9, mySquad.getDefensePoints());
  }

  @Test
  public void Squad_returnsSpeedPoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers", 58, 9, 35);
    assertEquals((Integer)35, mySquad.getSpeedPoints());
  }
}
