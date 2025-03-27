import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public String getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public List<String> write() {
        String PlayerStat = name + ", " + hitPoints + ", " + strength + ", " + weapon;
        return List.of(PlayerStat.split(", ")) ;
    }

    @Override
    public void read(List<String> playerStat) {
        if (playerStat != null)
        {
            if (playerStat.size() > 0) {
                name = playerStat.get(0);
                hitPoints = Integer.parseInt(playerStat.get(1));
                strength = Integer.parseInt(playerStat.get(2));
                weapon = playerStat.get(3);

                System.out.println(this);
            }
        } else {
            System.out.println("Error");
        }

    }


    @Override
    public String toString() {
        return "Player{" +
                "name='" + getName() + '\'' +
                ", hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() +
                ", weapon='" + getWeapon() + '\'' +  '}';
    }
}
