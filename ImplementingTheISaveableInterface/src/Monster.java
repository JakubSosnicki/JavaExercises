import java.util.List;

public class Monster implements ISaveable{

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        String PlayerStat = name + ", " + hitPoints + ", " + strength;
        return List.of(PlayerStat.split(", ")) ;
    }

    @Override
    public void read(List<String> monsterStat) {


        if (monsterStat != null) {
            if (!monsterStat.isEmpty()) {
                if (monsterStat.size() > 0) {
                    name = monsterStat.get(0);
                    hitPoints = Integer.parseInt(monsterStat.get(1));
                    strength = Integer.parseInt(monsterStat.get(2));
                }
            }

        } else {
            System.out.println("Error");
        }
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + getName() + '\'' +
                ", hitPoints=" + getHitPoints() +
                ", strength=" + getStrength() +
                '}';
    }
}
