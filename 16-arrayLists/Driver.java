import java.util.*;
public class Driver{
    static ArrayList<Integer> list = new ArrayList<Integer>();
    public static void setVals(){
	for(int i=0; i<20; i++){
	    list.add((int)(10.0*Math.random())+1);
	}
    }
    public static void main(String[] args){
	setVals();
	int c=0;
	while(c<list.size()-1){
	    if(list.get(c)==list.get(c+1)){
		list.remove(c+1);
	    }else{
		c++;
	    }
	}
	for(int i=0; i<list.size(); i++){
	    System.out.println(list.get(i));
	}
    }
}
