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
  private Integer mSpeedPoints;
  private int mId;
  private List<Hero> mHeroes;
  private static ArrayList<Squad> squads = new ArrayList<Squad>();

  public Squad(String squadName, int maxSize, String squadCause, Integer attackPoints, Integer defensePoints, Integer speedPoints) {
    mSquadName = squadName;
    mMaxSize = maxSize;
    mSquadCause = squadCause;
    mAttackPoints = attackPoints;
    mDefensePoints = defensePoints;
    mSpeedPoints = speedPoints;
    squads.add(this);
    mId = squads.size();
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

  public Integer getSpeedPoints() {
    return mSpeedPoints;
  }

}
