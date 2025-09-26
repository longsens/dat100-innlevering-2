package no.hvl.dat100.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {
        for (int[] rad : matrise) {
            for (int element : rad) {

                System.out.print(element + " ");
            }
        }
        System.out.println();
	}

	// b)
	public static String tilStreng(int[][] matrise) {
        String x = "";
        for (int[] rad : matrise) {
            for (int element : rad) {
                x += element + " ";
            }
            x += "\n";
        }
        return x;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {
        int[][] matrise2 = new int[matrise.length][matrise[0].length];
        for (int i = 0; i < matrise.length; i++) {
            for (int j = 0; j < matrise[0].length; j++) {
                matrise2[i][j] = matrise[i][j] * tall;
            }
        }
        return matrise2;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {
        boolean lik = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                lik = false;
                break;
            }
            for (int j = 0; j < a[i].length; j++) {
                if (a[i][j] != b[i][j]) {
                    lik = false;
                    break;
                }
            }
        }
        return lik;
	}
	
	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO

		throw new UnsupportedOperationException("Metoden speile ikke implementert");
	
	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("Metoden multipliser ikke implementert");
	
	}
}
