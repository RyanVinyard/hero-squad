import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

public class Squad {
  private String mSquadName;
  private int mMaxSize;
  private String mSquadCause;
  private Integer mAttackPoints;
  private Integer mDefensePoints;
  private Integer mHealthPoints;
  private int mID;
  private List<Hero> mHeroes;
  private static ArrayList<Squad> squads = new ArrayList<Squad>();

  public Squad(String squadName, int maxSize, String squadCause) {
    mSquadName = squadName;
    mMaxSize = maxSize;
    mSquadCause = squadCause;
    mAttackPoints = 0;
    mDefensePoints = 0;
    mHealthPoints = 0;
    squads.add(this);
    mID = squads.size();
    mHeroes = new ArrayList<Hero>();
  }

  public String getSquadName() {
    return mSquadName;
  }

  public int getMaxSize() {
    return mMaxSize;
  }

  public String getSquadCause() {
    return mSquadCause;
  }

  public Integer getAttackPoints() {
    return mAttackPoints;
  }

  public Integer getDefensePoints() {
    return mDefensePoints;
  }

  public Integer getHealthPoints() {
    return mHealthPoints;
  }

  public static List<Squad> all() {
    return squads;
  }

  public static void clear() {
    squads.clear();
  }

  public int getID() {
    return mID;
  }

  public static Squad find(int id) {
    return squads.get(id - 1);
  }

  public List<Hero> getHeroes() {
    return mHeroes;
  }

  public void addHero(Hero hero) {
    if (mHeroes.size() < mMaxSize) {
      mHeroes.add(hero);
    }
  }

  public Integer getSquadAttack() {
    for(Hero hero : mHeroes){
      mAttackPoints += hero.getAttackPoints();
    }
    return mAttackPoints;
  }

  public Integer getSquadDefense() {
    for(Hero hero : mHeroes){
      mDefensePoints += hero.getDefensePoints();
    }
    return mDefensePoints;
  }

  public Integer getSquadHealth() {
    for(Hero hero : mHeroes){
      mHealthPoints += hero.getHealthPoints();
    }
    return mHealthPoints;
  }
}
