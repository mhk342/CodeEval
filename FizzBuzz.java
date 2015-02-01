import java.io.*;
public class FizzBuzz {
    private static BufferedReader buffer;

	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            String[] s = line.split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);
            for(int i = 1; i <= n; i++) {
            	if(i % x == 0) {
            		System.out.print("F");
            		if(i % y == 0) {
                		System.out.print("B");
                	}
            	}
            	else if(i % y == 0) {
            		System.out.print("B");
            	}
            	else{
            		System.out.print(i);
            	}
            	if(i!=n) {
            		System.out.print(" ");
            	}
            	else{
            		System.out.println();
            	}
            }
            
            
            
        }
    }
}
