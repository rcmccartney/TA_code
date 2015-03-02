import java.util.HashMap;
import java.util.Map;

public class Digimon5 {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon5(String name, int hitPoints, double attackSpeed) {
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
        if (o instanceof Digimon5) {
            Digimon5 d = (Digimon5) o;
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

    // Tests an HashMap<Digimon, String>.  Where the string is the rank of the
    // digimon
    public static void main(String[] args) {
        Map<Digimon5, String> digimon = new HashMap<>();
        digimon.put(new Digimon5("Gatomon", 500, 12.9), "Rookie");
        digimon.put(new Digimon5("Agumon", 53, 9.8), "Rookie");
        digimon.put(new Digimon5("Koromon", 20, 1.3), "Training");
        digimon.put(new Digimon5("Turtomon", 9001, 2.5), "Champion");
        digimon.put(new Digimon5("Metalgreymon", 38, 11.2), "Ultimate");

        // update
        digimon.put(new Digimon5("Gatomon", 500, 12.9), "Mega");

	for( Digimon5 d: digimon.keySet())
		System.out.println(d.getName() + " : " + digimon.get(d));

	for (Map.Entry<Digimon5, String> entry : digimon.entrySet())
		System.out.println(entry.getKey() + " : " + entry.getValue());

    }
}

