import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class MatrixRotation {
    private static BufferedReader buffer;

	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(" ");
            int x = s.length;
            int y = (int) Math.sqrt(x);
            int z = x*x;
            for (int i = 0; i < y; i++) {
            	for (int j = 0; j < y; j++) {
            		z = z - y;
                	System.out.print(s[z%x]);
                	if(j!=y) {
                		System.out.print(" ");
                	}
            	}
            	z++;
            }
            
            System.out.println("");
        }
    }
}
