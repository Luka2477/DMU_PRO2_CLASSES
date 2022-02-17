package given.rekursion;

public class Talfolge {
    
    public static int talN(int n) {
        if (n < 0) {
            throw new RuntimeException(
                "Metode kaldt med negativt ikke valid parameter");
        }
        else if (n == 0) {
            return 2;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 5;
        }
        else if (n % 2 == 0) {
            return 2 * talN(n - 3) - talN(n - 1);
        }
        else {
            return talN(n - 1) + talN(n - 2) + 3 * talN(n - 3);
        }
        
    }
    
    public static int talNI(int n) {
        if (n < 0) {
            throw new RuntimeException(
                "Metode kaldt med negativt ikke valid parameter");
        }
        if (n == 0) {
            return 2;
        }
        int i = 1;
        int a = 2;
        int b = 1;
        int c = 5;
        int temp;
        while (i != n) {
            if (i % 2 == 0) {
                temp = 2 * a - c;
            }
            else {
                temp = c + b + 3 * a;
            }
            a = b;
            b = c;
            c = temp;
            i++;
        }
        return b;
    }
    
    public static int talNA(int n) {
        if (n < 0) {
            throw new RuntimeException(
                "Metode kaldt med negativt ikke valid parameter");
        }
        else if (n == 0) {
            return 2;
        }
        else if (n == 1) {
            return 1;
        }
        else if (n == 2) {
            return 5;
        }
        else {
        	int[] tal = new int[n+1];
        	tal[0] = 2;
        	tal[1] = 1;
        	tal[2] = 5;
        	for (int i = 3; i<=n; i++) {
        		if (i%2 == 0) {
        			tal[i] = 2 * tal[i-3] - tal[i-1];
        		}else {
        			tal[i] = tal[i-1] + tal[i-2] + 3 * tal[i-3];
        		}
        	}
        	return tal[n];
        }
        
    }
    public static void main(String[] args) {
        System.out.println("På n = 0 er tallet: " + talN(0) + "  og "
            + talNI(0)+ "  og " + talNA(0));
        System.out.println("På n = 1 er tallet: " + talN(1) + "  og "
            + talNI(1)+ "  og " + talNA(1));
        System.out.println("På n = 2 er tallet: " + talN(2) + "  og "
            + talNI(2)+ "  og " + talNA(2));
        System.out.println("På n = 3 er tallet: " + talN(3) + "  og "
            + talNI(3)+ "  og " + talNA(3));
        System.out.println("På n = 4 er tallet: " + talN(4) + "  og "
            + talNI(4)+ "  og " + talNA(4));
        System.out.println("På n = 5 er tallet: " + talN(5) + "  og "
            + talNI(5)+ "  og " + talNA(5));
        System.out.println("På n = 6 er tallet: " + talN(6) + "  og "
            + talNI(6)+ "  og " + talNA(6));
        System.out.println("På n = 7 er tallet: " + talN(7) + "  og "
            + talNI(7)+ "  og " + talNA(7));
        System.out.println("På n = 8 er tallet: " + talN(8) + "  og "
            + talNI(8)+ "  og " + talNA(8));
        
//		
    
    }
    
}
