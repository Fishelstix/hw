public class Driver{
    public static void main(String[] args){
	Searching s = new Searching(20);
	for(int i=0; i<20; i++){
	    s.addItem((int)(20*Math.random()));
	}
	for(int i=0; i<20; i++){
	    System.out.println(s.getA(i));
	}
	System.out.println("\n");
	System.out.println(s.lsearch(7));
	System.out.println("\n");
	s.doSort();
	for(int i=0; i<20; i++){
	    System.out.println(s.getA(i));
	}
	System.out.println("\n");
	System.out.println(s.bsearch(7));
	System.out.println("\n");
	System.out.println(s.rbsearch(7));
    }
}
