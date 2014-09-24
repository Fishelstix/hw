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
    public static boolean nearHundred(int n){
	return Math.abs(n-100)<=10 || Math.abs(n-200)<=10;
    }
    public static boolean mixStart(String str) {
	return str.substring(1,3).equals("ix");
    }
    public static int teaParty(int tea, int candy) {
	if (tea >= 5 && candy >= 5) {
	    if (tea >= 2 * candy || candy >= 2 * tea) {
		return 2;
	    }else{
		return 1;
	    }
	}else{
	    return 0;
	}
    }
    public boolean lastDigit(int a, int b, int c) {
	return (a%10==b%10)||(a%10==c%10)||(b%10==c%10);
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
