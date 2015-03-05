import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class Digimon5 implements Comparable<Digimon5> {
    private String name;
    private int hitPoints;
    private double attackSpeed;

    public Digimon5(String name, int hitPoints, double attackSpeed) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.attackSpeed = attackSpeed;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Digimon5) {
            Digimon5 p = (Digimon5) obj;
            return this.name.equals(p.name) && this.attackSpeed == p.attackSpeed;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Digimon5{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", attackSpeed=" + attackSpeed +
                '}';
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + Double.hashCode(this.attackSpeed);
    }

    @Override
    public int compareTo(Digimon5 o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args) {
        Set<Digimon5> digimon = new HashSet<>();
        Digimon5 gatomon = new Digimon5("Gatomon", 500, 12.9);
        digimon.add(gatomon);
        Digimon5 agumon = new Digimon5("Agumon", 53, 9.8);
        digimon.add(agumon);
        Digimon5 koromon = new Digimon5("Koromon", 20, 1.3);
        digimon.add(koromon);
        Digimon5 tortomon = new Digimon5("Turtomon", 9001, 2.5);
        digimon.add(tortomon);
        Digimon5 metalgreymon = new Digimon5("Metalgreymon", 38, 11.2);
        digimon.add(metalgreymon);

        // old way of iterating and printing each element
        System.out.println("Classic foreach: ");
        for (Digimon5 p : digimon) {
            System.out.println(p);
        }

        // new way #1:  use a class that implements Consumer
        System.out.println("Consumer");	
	DigimonPrinter p = new DigimonPrinter();
	digimon.forEach(p);	

        // new way #2:  anonymous Consumer
	System.out.println("Anonymous");
	digimon.forEach(new Consumer<Digimon5>() {
		public void accept(Digimon5 d) {
			System.out.println(d);
		}
	});	
		
        // new way #3: lambda!
	System.out.println("lambda");
	digimon.forEach((Digimon5 x) -> { System.out.println(x); });

        // new way #4: minimal lambda!
	System.out.println("minimal lambda");
	digimon.forEach((x) ->  System.out.println(x) );

        // new way #5: method reference
	System.out.println("method reference");
	digimon.forEach(Digimon5::compareTo);
    }
}
