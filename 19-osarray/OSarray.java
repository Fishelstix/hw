public class OSarray extends Sarray{
    public void add(int index, String i){
    }
    public void add(String i){
	int index;
	for(int j=0; j<data.length; j++){
	    if(i.compareTo(data[j])<0){
		index = j;
		break;
	    }
	}
	String[] data2 = new String[(data.length+1)];
	for(int j=0; j<index; j++){
	    data2[j]= new Stirng data[j];
	}
	data2[index]=new String i;
	for(int j=index; j<data.length; j++){
	    data2[j+1]=new Sting data[j];
	}
	int[] data = data2;
    }
    public String set(int index, String i){
	String j = new String data[index];
	this.remove(index);
	this.add(i);
	return j;
    }
}
