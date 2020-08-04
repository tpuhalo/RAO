package zadatak;

import java.time.LocalTime;
import java.util.LinkedHashMap;
import java.util.Map;

public class Logika {

	private Logika() {
	}

	public static Map<Key, String> makeMap(int n, int m, int k) {
		Map<Key, String> map = new LinkedHashMap<>();

		int skolskiSat = 0;
		int odmor = 0;
		LocalTime time = LocalTime.of(8, 0);
		Key key;
		for (int i = 0; i < 19; i++) {
			// sat
			if (i % 2 == 0) {
				skolskiSat++;
				key = new Key();
				key.setStart(time);
				time = time.plusMinutes(45);
				key.setEnd(time);
				map.put(key, skolskiSat + ". sat");
			}
			// odmor
			else {
				odmor++;
				if (skolskiSat == k) {
					key = new Key();
					key.setStart(time);
					time = time.plusMinutes(m);
					key.setEnd(time);
				} else {
					key = new Key();
					key.setStart(time);
					time = time.plusMinutes(n);
					key.setEnd(time);
				}
				map.put(key, odmor + ". odmor");
			}

		}
		return map;
	}

}
