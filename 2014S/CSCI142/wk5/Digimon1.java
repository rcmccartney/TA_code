import java.util.ArrayList;
import java.util.List;

public class Digimon1 {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon1(String name, int hitPoints, double attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public boolean equals(Object o) {
	if (o instanceof Digimon1) {
		Digimon1 d = (Digimon1) o;
		return this.name.equals(d.name) &&
			this.attackSpeed == d.attackSpeed;
	}
	return false;
    }

    // Tests an ArrayList<Digimon> using contains(), and requiring the
    // implementation of Digimon::equals.
    public static void main(String[] args) {
        List<Digimon1> digimon = new ArrayList<>();
        Digimon1 gatomon = new Digimon1("Gatomon", 500, 12.9);
        digimon.add(gatomon);
        Digimon1 agumon = new Digimon1("Agumon", 53, 9.8);
        digimon.add(agumon);
        System.out.println("Contains Gatomon? " + digimon.contains(new Digimon1("Gatomon", 500, 12.9)));
        Digimon1 gatomonDup = new Digimon1("Gatomon", 999, 12.9);
        System.out.println("Contains GatomonDup? " + digimon.contains(gatomonDup));
        Digimon1 gatomon2 = new Digimon1("Gatomon", 999, 99.9);
        System.out.println("Contains Gatomon2? " + digimon.contains(gatomon2));
    }
}
