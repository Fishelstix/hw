public class Greeter{
    private String greeting;
    public Greeter(String s){
	greeting = s;
    }
    public String getGreeting(){
	return greeting;
    }
    public void setGreeting(String s){
	greeting = s;
    }
    public String greet(){
	return greeting;
    }
    public void ungreet(){
	System.out.println("I'm out.");
    }
}
