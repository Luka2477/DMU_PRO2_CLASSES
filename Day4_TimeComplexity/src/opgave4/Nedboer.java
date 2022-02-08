package opgave4;

public class Nedboer {
    private int[] nedboerPrUge = { 20, 10, 12, 12, 13, 14, 15, 10, 8, 7, 13,
        15, 10, 9, 6, 8, 12, 22, 14, 16, 16, 18, 23, 12, 0, 2, 0, 0, 78, 0,
        0, 0, 34, 12, 34, 23, 23, 12, 44, 23, 12, 34, 22, 22, 22, 22, 18,
        19, 21, 32, 24, 13 };
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i de tre uger
     *
     * @return
     */

    // Big Oh: O(n)
    public int bedsteTreFerieUger() {
        int sum;
        int min = Integer.MAX_VALUE;
        int bedsteUge = 0;

        for (int i = 2; i < this.nedboerPrUge.length; i++) {
            sum = this.nedboerPrUge[i-2]+this.nedboerPrUge[i-1]+this.nedboerPrUge[i];

            if (sum < min) {
                min = sum;
                bedsteUge = i-2;
            }
        }

        return bedsteUge;
    }
    
    /**
     * Returnerer ugenummeret for den uge i året, hvor man skal starte ferien,
     * hvis man ønsker den minimale nedbørsmængde i det "antal" uger, der er
     * angivet i paramtereren
     *
     * @return
     */

    // Big Oh: O(n)
    public int bedsteFerieUgerStart(int antal) {
        int min = Integer.MAX_VALUE;
        int bedsteUge = 0;

        for (int i = antal-1; i < this.nedboerPrUge.length; i++) {
            int sum = 0;
            for (int j = i-antal+1; j <= i; j++) {
                sum += this.nedboerPrUge[j];
            }

            if (sum < min) {
                min = sum;
                bedsteUge = i-antal;
            }
        }

        return bedsteUge;
    }
    
    /**
     * Returnerer ugenummeret på den første uge hvor nedbøren har været præcis
     * den samme flest uger i træk
     *
     * @return
     */

    // Big Oh: O(n)
    public int ensNedboer() {
        int max = 0;
        int bedsteUge = 0;

        for (int i = 1, tempMax = 1, last = this.nedboerPrUge[0]; i < this.nedboerPrUge.length; i++) {
            if (this.nedboerPrUge[i] == last) {
                tempMax++;

                if (tempMax > max) {
                    max = tempMax;
                    bedsteUge = i-tempMax+1;
                }
            } else {
                tempMax = 1;
                last = this.nedboerPrUge[i];
            }
        }

        return bedsteUge;
    }

    public static void main(String[] args) {
        Nedboer nb = new Nedboer();
        System.out.println(nb.bedsteTreFerieUger());
        System.out.println(nb.bedsteFerieUgerStart(5));
        System.out.println(nb.ensNedboer());
    }
}
