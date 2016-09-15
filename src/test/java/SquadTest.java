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
  public void Squad_returnsHealthPoints_Integer() {
    Squad mySquad = new Squad("Motherfuckers", 3, "Fucking mothers");
    assertEquals((Integer)0, mySquad.getHealthPoints());
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
    Hero hotRod = new Hero("Hot Rod", 8, "Fire head", "head is literally on fire", 9, 5, 18);
    goodGuys.addHero(hotRod);
    assertTrue(goodGuys.getHeroes().contains(hotRod));
  }

  @Test
  public void getSquadAttack_returnsTotalSquadAttack_Integer() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Hero hotRod = new Hero("Hot Rod", 8, "Fire head", "head is literally on fire", 18, 8, 50);
    Hero hugeDouche = new Hero("Huge Douche", 34, "Verbally berates opponents", "If opponent stops crying and attacks, he can't actually fight", 20, 0, 100);
    goodGuys.addHero(hotRod);
    goodGuys.addHero(hugeDouche);
    assertEquals((Integer)38, goodGuys.getSquadAttack());
  }

  @Test
  public void getSquadDefense_returnsTotalSquadDefense_Integer() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Hero hotRod = new Hero("Hot Rod", 8, "Fire head", "head is literally on fire", 18, 8, 50);
    Hero hugeDouche = new Hero("Huge Douche", 34, "Verbally berates opponents", "If opponent stops crying and attacks, he can't actually fight", 20, 0, 100);
    goodGuys.addHero(hotRod);
    goodGuys.addHero(hugeDouche);
    assertEquals((Integer)8, goodGuys.getSquadDefense());
  }

  @Test
  public void getSquadHealth_returnsTotalSquadHealth_Integer() {
    Squad goodGuys = new Squad("Motherfuckers", 3, "Fucking mothers");
    Hero hotRod = new Hero("Hot Rod", 8, "Fire head", "head is literally on fire", 18, 8, 50);
    Hero hugeDouche = new Hero("Huge Douche", 34, "Verbally berates opponents", "If opponent stops crying and attacks, he can't actually fight", 20, 0, 100);
    goodGuys.addHero(hotRod);
    goodGuys.addHero(hugeDouche);
    assertEquals((Integer)150, goodGuys.getSquadHealth());
  }

  @Test
  public void addHero_onlyAddsUntilMaxSize_void() {
    Squad goodGuys = new Squad("Motherfuckers", 2, "Fucking mothers");
    Hero hotRod = new Hero("Hot Rod", 8, "Fire head", "head is literally on fire", 18, 8, 50);
    Hero hugeDouche = new Hero("Huge Douche", 34, "Verbally berates opponents", "If opponent stops crying and attacks, he can't actually fight", 20, 0, 100);
    Hero spaniard = new Hero("Spaniard", 28, "Really Spanish", "Self conscious and a little too Spanish", 14, 12, 35);
    goodGuys.addHero(hotRod);
    goodGuys.addHero(hugeDouche);
    goodGuys.addHero(spaniard);
    assertEquals(2, goodGuys.getHeroes().size());
  }
}
