package zadatak;

import java.util.Arrays;

public class Validacije {

	private Validacije() {
	}

	// U prvom je retku prirodan broj N (1 <= N <= 30), trajanje običnog odmora u
	// minutama.
	// U drugom je retku prirodan broj M (1 <= M <= 30, N <= M), trajanje velikog
	// odmor u minutama.
	// U trećem je retku prirodan broj K (1 <= K <= 9), redni broj sata iza kojeg
	// dolazi veliki odmor.
	// U četvrtom je retku prirodan broj A (8 <= A <= 20), sat iz teksta zadatka.
	// U petom je retku prirodan broj B (0 <= B <= 59), minuta iz teksta zadatke.

	public static void validationOfData(int n, int m, int k, int a, int b) throws Exception {
		if (isNotBetween(n, 1, 30) || isNotBetween(m, 1, 30) || isNotBetween(k, 1, 9) || isNotBetween(a, 8, 20)
				|| isNotBetween(b, 0, 59) || !(n <= m)) {
			throw new ZadatakException("Ulazni podaci su nevalidni.");
		}
	}

	private static boolean isNotBetween(int number, int start, int end) {
		return !(start <= number && number <= end);
	}

	public static void validationOfArray(String[] args) {
		if (Arrays.asList(args).size() != 5) {
			throw new ZadatakException("Nedovoljan broj parametara.");
		}
	}
}
