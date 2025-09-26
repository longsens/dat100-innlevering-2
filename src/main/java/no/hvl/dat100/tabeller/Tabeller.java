package no.hvl.dat100.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {
        System.out.print("[");
        for (int i = 0; i < tabell.length; i++) {
            System.out.print(tabell[i] + " ");
        }
        System.out.print("]");
        System.out.println();
	}
	// b)
	public static String tilStreng(int[] tabell) {
        StringBuilder x = new StringBuilder("[");
        for (int i = 0; i < tabell.length; i++) {
            if (i == tabell.length-1) {
                x.append(String.valueOf(tabell[i]));
            } else {
                x.append(String.valueOf(tabell[i]));
                x.append(",");
            }
        }
        x.append("]");
        return x.toString();
	}

	// c)
	public static int summer(int[] tabell) {
        int sum = 0;
        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {
        boolean finnes = false;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                finnes = true;
            }
        }
        return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {
        int funnet = -1;
        for (int i = 0; i < tabell.length; i++) {
            if (tall == tabell[i]) {
                funnet = i;
                break;
            }
        }
        return funnet;
	}

	// f)
	public static int[] reverser(int[] tabell) {
        int[] revers = new int[tabell.length];
        int temp = tabell.length;

        for (int i = 0; i < tabell.length; i++) {
            revers[temp-1] = tabell[i];
            temp -= 1;
        }
        return revers;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
        boolean sortert = true;
        for (int i = 1; i < tabell.length; i++) {
            if (tabell[i] > tabell[i-1]) {
            } else {
                sortert = false;
            }
        }
        return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int[] sammen = new int[tabell1.length + tabell2.length];
        int x = 0;
        for (int i = 0; i < tabell1.length; i++) {
            sammen[i] = tabell1[i];
            x++;
        }
        for (int i = 0; i < tabell2.length; i++) {
            sammen[i+x] = tabell2[i];
        }
        return sammen;
	}
}
