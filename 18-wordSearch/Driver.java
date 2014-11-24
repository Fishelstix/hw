import java.util.Scanner;
import java.io.*;
public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(7,10);
	Scanner sc = null;
	try {
	    sc =new Scanner(new File("word"));
	}catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    w.addWord(s);
	}
	System.out.println(w);
    }
}
