public class Driver{
    public static void main(String[] args){
	String s = "max fishelson";
	int x = s.indexOf(" ");
	String first = s.substring(0,x);
	String last = s.substring(x+1);
	System.out.println("First name: "+first);
	System.out.println("Last name: "+last);
    }
}
