import java.util.HashMap;
import java.util.Map;

public class Hero {
  private String mName;
  private int mAge;
  private String mPower;
  private String mWeakness;
  private Integer mAttackPoints;
  private Integer mDefensePoints;
  private Integer mSpeedPoints;


  public Hero(String name, int age, String power, String weakness, Integer attackPoints, Integer defensePoints, Integer speedPoints) {
    mName = name;
    mAge = age;
    mPower = power;
    mWeakness = weakness;
    mAttackPoints = attackPoints;
    mDefensePoints = defensePoints;
    mSpeedPoints = speedPoints;
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

  public Integer getSpeedPoints() {
    return mSpeedPoints;
  }
}
