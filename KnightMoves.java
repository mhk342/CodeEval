import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class KnightMoves {

    private static BufferedReader buffer;

    char n, c;
    
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            char c = line.charAt(0);
            String n = line.substring(1,2);
            // a = 97 in ascii; h = 104
            int cc = (int) c;
            int nn = Integer.parseInt(n);
            printMoves(cc,nn);
            System.out.println();
            
        }
    }
	
	/**
	 * sorts b[] in order
	 */
	public static int[] sort (int[] n){
		int a = n[0];
		int b = n[1];
		int c = n[2];
		int d = n[3];
		n[0] = d;
		n[1] = b;
		n[2] = a;
		n[3] = c;
		
		return n;
		
	}	
	public static void printMoves(int c, int n) {
	
		int[] a = new int[4];//arraylists are easier here
		int aSize = 0;
		for (int i = 1; i < 3; i++) {
			if (n+i < 9) {
				a[aSize] = (n+i);
			}
			aSize++; // outside of if statement to set up exact positions
			if (n-i>0) {
				a[aSize] = (n-i);
			}
			aSize++;
		}
		
		int[] b = new int[4];
		int bSize = 0;
		for (int i = 1; i < 3; i++) {
			if (c+i < 105) {
				b[bSize] = (c+i);
			}
			bSize++; // outside of if statement to set up exact positions
			if (c-i>96) {
				b[bSize] = (c-i);
			}
			bSize++;
		}
		b = sort(b);
		
		for (int i =0;i < 4; i++) {
			if (b[i] == 0) {
				continue;
			}
			
			if(i == 0 || i == 3) {
				
				if(a[1] != 0) {
					char cc = (char)b[i];
					String ss = "" + (a[1]);
					System.out.print(cc + ss+ " ");
				}
				if(a[0] != 0) {
					char cc = (char)b[i];
					String ss = "" + (a[0]);
					System.out.print(cc + ss + " ");
				}
				
			}
			else { // if i < 2 
				
				if(a[3] != 0) {
					char cc = (char)b[i];
					String ss = "" + (a[3]);
					System.out.print(cc + ss + " ");
				}
				if(a[2] != 0) {
					char cc = (char)b[i];
					String ss = "" + (a[2]);
					System.out.print(cc + ss + " ");
				}
			}
		}
		
	}
	
}
