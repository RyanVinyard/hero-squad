import org.junit.*;
import static org.junit.Assert.*;
import java.time.LocalDateTime;

public class SquadTest {

  @After
  public void emptySquad() {
    Squad.clear();
  }

  @Test
  public void Squad_instantiantesCorrectly_true() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals(true, mySquad instanceof Squad);
  }

  @Test
  public void Squad_returnsName_String() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals("Motherfuckers", mySquad.getSquadName());
  }

  @Test
  public void Squad_returnsMaxSize_int() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals(3, mySquad.getMaxSize());
  }

  @Test
  public void Squad_returnsCause_String() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals("Fucking mothers", mySquad.getSquadCause());
  }

  @Test
  public void Squad_returnsAttackPoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals((Integer)0, mySquad.getAttackPoints());
  }

  @Test
  public void Squad_returnsDefensePoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals((Integer)0, mySquad.getDefensePoints());
  }

  @Test
  public void Squad_returnsSpeedPoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals((Integer)0, mySquad.getSpeedPoints());
  }

  @Test
  public void Squad_returnsAllInstancesOfSquad_true() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Squad evilSquad = new Squad("Asskissers", 3, "Kissing ass");
    assertEquals(true, Squad.all().contains(goodGuys));
    assertEquals(true, Squad.all().contains(evilSquad));
  }

  @Test
  public void Squad_clearsUsingAfterMethod_int() {
    assertEquals(Squad.all().size(), 0);
  }

  @Test
  public void getID_squadsInstantiateWithID_2() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Squad evilSquad = new Squad("Asskissers", 3, "Kissing ass");
    assertEquals(2, evilSquad.getID());
  }

  @Test
  public void find_returnsSquadWithID_evilSquad() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Squad evilSquad = new Squad("Asskissers", 3, "Kissing ass");
    assertEquals(Squad.find(evilSquad.getID()), evilSquad);
  }

  @Test
  public void getHeroes_initiallyReturnsEmptyList_List() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals(0, goodGuys.getHeroes().size());
  }

  @Test
  public void addHero_addsHeroToSquad_true() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Hero hotRod = new Hero("Hot Rod", 8, "Fire dick", "Dick is literally on fire", 9, 5, 18);
    goodGuys.addHero(hotRod);
    assertTrue(goodGuys.getHeroes().contains(hotRod));
  }
}
