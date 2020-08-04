package zadatak;

import java.time.LocalTime;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Zadatak {

	private static Logger log = Logger.getLogger("Zadatak");

	public static void main(String[] args) throws Exception {
		try {
			Validacije.validationOfArray(args);
			int n = Integer.parseInt(args[0]);
			int m = Integer.parseInt(args[1]);
			int k = Integer.parseInt(args[2]);
			int a = Integer.parseInt(args[3]);
			int b = Integer.parseInt(args[4]);
			Validacije.validationOfData(n, m, k, a, b);
			Map<Key, String> map = Logika.makeMap(n, m, k);

			Key key = map.keySet().stream().filter(x -> x.isBetween(LocalTime.of(a, b))).findFirst()
					.orElseThrow(() -> new ZadatakException("Zadano vrijeme nije unutar redovnog rada skole."));
			log.info(map.get(key));

		} catch (ZadatakException e) {
			log.log(Level.SEVERE, e.getMessage());
		} catch (NumberFormatException e) {
			log.log(Level.SEVERE, "Jedan od ulaznih parametara nije broj.");
		} catch (Exception e) {
			log.log(Level.SEVERE, "Generalna greška.");
		}

	}

}
