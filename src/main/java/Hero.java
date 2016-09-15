import java.util.HashMap;
import java.util.Map;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private Integer mAttackPoints;
  private Integer mDefensePoints;
  private Integer mHealthPoints;


  public Hero(String name, int age, String power, String weakness, Integer attackPoints, Integer defensePoints, Integer healthPoints) {
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    mAttackPoints = attackPoints;
    mDefensePoints = defensePoints;
    mHealthPoints = healthPoints;
  }

  public String getName() {
    return mName;
  }

  public int getAge() {
    return mAge;
  }

  public String getPower() {
    return mPower;
  }

  public String getWeakness() {
    return mWeakness;
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
}
