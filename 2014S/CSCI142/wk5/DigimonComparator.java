import java.util.Comparator;

public class DigimonComparator implements Comparator<Digimon3> {

public int compare(Digimon3 a, Digimon3 b) {

	// this will have a casting problem
	return b.getHitPoints() - a.getHitPoints();
}

}
