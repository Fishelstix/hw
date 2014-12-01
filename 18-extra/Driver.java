import java.util.*;
import java.io.*;
public class Driver {
    public static void main(String[] args) {
	ArrayList<String> size5 = new ArrayList<String>();
	Scanner sc = null;
	try {
	    sc =new Scanner(new File("words.txt"));
	}catch (Exception e) {
	    System.out.println("File not found");
	    System.exit(0);
	}
	while (sc.hasNext()) {
	    String s = sc.next();
	    if(s.length()==5){
		if(((int)(s.charAt(0))>96)&&((int)(s.charAt(0))<123)&&((int)(s.charAt(1))>96)&&((int)(s.charAt(1))<123)&&((int)(s.charAt(2))>96)&&((int)(s.charAt(2))<123)&&((int)(s.charAt(3))>96)&&((int)(s.charAt(3))<123)&&((int)(s.charAt(4))>96)&&((int)(s.charAt(4))<123)){
		    size5.add(s);
		}
	    }
	}
	WordSearch answers = new WordSearch(size5);
	char[][] start = new char[5][5];
	for(int j=0; j<5; j++){
	    for(int k=0; k<5; k++){
	        start[j][k]=' ';
	    }
	}
	answers.put(start,0);
    }
}
