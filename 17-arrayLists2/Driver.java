import java.util.*;
public class Driver{
    public static ArrayList<Integer> permute(ArrayList<Integer> a){
	ArrayList<Integer> out = new ArrayList<Integer> ();
	while(a.size()>0){
	    int c = (int)(Math.random()*a.size());
	    out.add(a.get(c));
	    a.remove(c);
	}
	return out;
    }
    public static void main(String[] args){
	ArrayList<Integer> scrambling = new ArrayList<Integer> ();
	for(int i=0; i<100; i++){
	    scrambling.add(i);
	}
	ArrayList<Integer> scrambled = permute(scrambling);
	System.out.println(scrambled.toString());
    }
}
