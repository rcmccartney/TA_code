import java.util.Set;
import java.util.TreeSet;

public class Digimon3 {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon3(String name, int hitPoints, double attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    @Override
    public String toString() {
        return "Digimon3{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackSpeed=" + attackSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Digimon3) {
            Digimon3 d = (Digimon3) o;
            // equal if same name and attack speed (ignores hit points)
            return this.name.equals(d.name) && this.attackSpeed == d.attackSpeed;
        }
        return false;
    }

    // Tests an TreeSet<Digimon> that orders based decreasing hit points.
    // Uses a custom Comparator<Digimon> class,
    // DigimonComparator -> DigimonComparator::compare
    public static void main(String[] args) {
        Set<Digimon3> digimon = new TreeSet<>(new DigimonComparator());
        Digimon3 gatomon = new Digimon3("Gatomon", 500, 12.9);
        digimon.add(gatomon);
        Digimon3 agumon = new Digimon3("Agumon", 53, 9.8);
        digimon.add(agumon);
        Digimon3 koromon = new Digimon3("Koromon", 20, 1.3);
        digimon.add(koromon);
        Digimon3 gatomonDup = new Digimon3("Gatomon", 500, 99.9);
        digimon.add(gatomonDup);
        System.out.println(digimon.size() + ": " + digimon);
    }
}

