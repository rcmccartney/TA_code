import java.util.Set;
import java.util.TreeSet;

public class Digimon2 implements Comparable<Digimon2> {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon2(String name, int hitPoints, double attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Digimon2) {
            Digimon2 d = (Digimon2) o;
            // equal if same name and attack speed (ignores hit points)
            return this.name.equals(d.name) && this.attackSpeed == d.attackSpeed;
        }
        return false;
    }

    public int compareTo(Digimon2 d) {
	return this.name.compareTo(d.name);	
    }

    public String toString() {
	return this.name + " " + this.attackSpeed;
    }

    // Tests an TreeSet<Digimon>.  Requires Digimon to implement
    // Comparable<Digimon> -> Digimon::compareTo
    public static void main(String[] args) {
        Set<Digimon2> digimon = new TreeSet<>();
        Digimon2 gatomon = new Digimon2("Gatomon", 500, 12.9);
        digimon.add(gatomon);
        Digimon2 agumon = new Digimon2("Agumon", 53, 9.8);
        digimon.add(agumon);
        Digimon2 koromon = new Digimon2("Koromon", 20, 1.3);
        digimon.add(koromon);
        Digimon2 gatomonDup = new Digimon2("Gatomon", 999, 12.9);
        digimon.add(gatomonDup);
        System.out.println(digimon.size() + ": " + digimon);
    }
}

