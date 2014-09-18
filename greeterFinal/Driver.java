public class Driver{
    public static void main(String[] args){
	Greeter g1 = new Greeter("G'day mate!");
	Greeter g2 = new Greeter("Yo yo yo");
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	g1.setGreeting("WOO!");
	System.out.println(g1.greet());
	System.out.println(g2.greet());
	String s = g1.getGreeting();
	System.out.println("g1's greeting is "+s);
    }
}
