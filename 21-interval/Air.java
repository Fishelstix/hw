public class Air extends Basechar implements Comparable{
    public Air(){
	setElement("air");
	setA1name("wind shot");
	setA2name("air shield");
	setA3name("meditate");
	setA4name("tornado strike");
    }
    public int compareTo(Air other){
	return (this.name).compareTo(other.getName());
    }
}
