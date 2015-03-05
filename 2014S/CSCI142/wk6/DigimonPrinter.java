import java.util.function.Consumer;


public class DigimonPrinter implements Consumer<Digimon5> {

	@Override
	public void accept(Digimon5 p)  {
		System.out.println(p);
	}
}
