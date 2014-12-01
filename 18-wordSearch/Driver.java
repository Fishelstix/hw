import java.util.Scanner;
import java.io.*;
public class Driver {
    public static void main(String[] args) {
	String[] list = new String[10];
	Scanner sc = null;
	try {
	    sc =new Scanner(new File("words"));
	}catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    w.addWord(s);
	}
	WordSearch w = new WordSearch(7,10,list);
	System.out.println(w);
    }
}
