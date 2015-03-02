import java.util.HashSet;
import java.util.Set;

public class Digimon4 {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon4(String name, int hitPoints, double attackSpeed) {
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
        return "Digimon4{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackSpeed=" + attackSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Digimon4) {
            Digimon4 d = (Digimon4) o;
            // equal if same name and attack speed (ignores hit points)
            return this.name.equals(d.name) && this.attackSpeed == d.attackSpeed;
        }
        return false;
    }

    @Override 
    public int hashCode() {
	return this.name.hashCode() + 
			(new Double(this.attackSpeed).hashCode());
		
    }

    // Tests an HashSet<Digimon>.  It requires Digimon::hashCode (in
    // addition to previously implemented Digimon::equals).
    public static void main(String[] args) {
        Set<Digimon4> digimon = new HashSet<>();
        Digimon4 gatomon = new Digimon4("Gatomon", 500, 12.9);
        digimon.add(gatomon);
        Digimon4 agumon = new Digimon4("Agumon", 53, 9.8);
        digimon.add(agumon);
        Digimon4 koromon = new Digimon4("Koromon", 20, 1.3);
        digimon.add(koromon);
        Digimon4 tortomon = new Digimon4("Turtomon", 9001, 2.5);
        digimon.add(tortomon);
        Digimon4 metalgreymon = new Digimon4("Metalgreymon", 38, 11.2);
        digimon.add(metalgreymon);
        Digimon4 gatomonDup1 = new Digimon4("Gatomon", 999, 12.9);
        digimon.add(gatomonDup1);
        Digimon4 gatomonDup2 = new Digimon4("Gatomon", 999, 99.9);
        digimon.add(gatomonDup2);
        System.out.println(digimon.size() + ": " + digimon);
    }
}

