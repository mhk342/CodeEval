
import java.io.*;
public class PokerHands {
    private static BufferedReader buffer;

    public class Cards {
    	int value;
    	String suite;
    	public Cards(String s, String ss) {
    		suite = ss;
    		try {
    			value = Integer.valueOf(s);
    		}
    		catch (Exception e) {
    			if (s.equals("T")) {
    				value = 10;
    			}
    			else if (s.equals("J")) {
    				value = 11;
    			}
    			else if (s.equals("Q")) {
    				value = 12;
    			}
    			else if (s.equals("K")) {
    				value = 13;
    			}
    			else {
    				value = 14;
    			}
    		}
    	}
    }
    
    public class Hand {
    	Cards[] h = new Cards[5];
    	boolean isFlush;
    	
    	public void checkFlush() {
    		for (int i = 0; i<4; i++) {
    			if (!h[i].suite.equals(h[i++].suite) ) {
    				isFlush = false;
    				return;
    			}
    		}
    		isFlush = true;
    	}
    	public void sortCards() {
    		
    	}
    	
    	
    }
    
    
	public static void main (String[] args) throws IOException {
        File file = new File(args[0]);
        buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            // Process line of input Here
        }
    }
}
