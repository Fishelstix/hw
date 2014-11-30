public class Sarray{
    private String[] data;
    private int last;
    public Sarray(String[] d){
	data = d;
    }
    public boolean add(String i){
	String[] data2 = new String[(data.length+1)];
	for(int j=0; j<data.length; j++){
	    data2[j]=new String data[j];
	}
	data2[data.length]=new String i;
	String[] data = data2;
	return true;
    }
    public void add(int index, String i){
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
    public int size(){
	return data.length;
    }
    public String get(int index){
	return data[index];
    }
    public String set(int index, String i){
	String j = new String data[index];
	data[index]=new String i;
	return j;
    }
    public String remove(int index){
	String i = new String data[index];
	String[] data2 = new String[(data.length-1)];
	for(int j=0; j<index; j++){
	    data2[j]=new Stirng data[j];
	}
	for(int j=index; j<data.length; j++){
	    data2[j-1]=new String data[j];
	String[] data = data2;
	}
	return i;
    }
}
