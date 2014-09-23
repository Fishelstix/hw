public class Driver{
    public static String nonStart(String a, String b){
	return a.substring(1)+b.substring(1);
    }
    public static String makeAbba(String a, String b){
	return a+b+b+a;
    }
    public static int diff21(int n){
	if(n>21){
	    return 2*n-24;
	}else{
	    return 21-n;
	}
    }
    public static void main(String[] args){
	System.out.println("");
	System.out.println(nonStart("Hello", "There"));
	System.out.println(nonStart("java", "code"));
	System.out.println(nonStart("shotl", "java"));
	System.out.println("");
	System.out.println(makeAbba("Hi", "Bye"));
	System.out.println(makeAbba("Yo", "Alice"));
	System.out.println(makeAbba("What", "Up"));
	System.out.println("");
	System.out.println(diff21(19));
	System.out.println(diff21(10));
	System.out.println(diff21(21));
	System.out.println("");
    }
}
