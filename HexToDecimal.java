
import java.io.*;
public class HexToDecimal {
    private static BufferedReader buffer;

	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            int x = line.length();
            int sum = 0;
            int y;
            for (int i =0; i < x; i++) {
            	String s = line.substring(i, i+1);
            	try {
            		y = Integer.parseInt(s);
            	}
            	catch (Exception e) {
            		char c = s.charAt(0);
            		y = (int) c;
            	}
            	double z = Math.pow(16,(x-i-1));
            	sum += (y % 87) * z;
            	
            }
            System.out.println(sum);
        }
    }
}
