public class Driver {
    public static void main(String[] args){
	Basechar c = new Basechar();
	Warrior w = new Warrior();
	Mage m = new Mage();
	System.out.println(c.getHealth());
	System.out.println(w.getHealth());
	System.out.println(m.getHealth());
	System.out.println(m.getManna());
	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2;
	
	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();
	
	m2 = m1;
	//m2 = b1;
	//m2 = c1;
	
	b2 = m1;
	b2 = m2;
	b2 = new Warrior();
    }
}
