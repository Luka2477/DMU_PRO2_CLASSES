package opgave6;

public class AppAnden {

    public static int flyt (int n, int fra, int til){
        int moves = 0;

        if (n==1) {
            System.out.println("Flyt fra " +fra +" til " + til);
            moves++;
        } else {
            int temp = 6 - fra - til;
            moves += flyt(n-1,fra,temp);
            System.out.println("Flyt fra " + fra +" til " + til);
            moves++;
            moves += flyt(n-1,temp,til);
        }

        return moves;
    }

    public static void main (String[] args) {
        int moves = flyt(15,1,3);
        System.out.println(moves);
    }

}
