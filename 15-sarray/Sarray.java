public class Sarray{
    private int[] data;
    private int last;
    public Sarray(int[] d){
	data = d;
    }
    public boolean add(int i){
	int[] data2 = int[data.length+1];
	for(int j=0; j<data.length; j++){
	    data2[j]=data[j];
	}
	data2[data.length]=i;
	int[] data = new int[] data2;
	return true;
    }
    public void add(int index, int i){
	int[] data2 = int[data.length+1];
	for(int j=0; j<index; j++){
	    data2[j]=data[j];
	}
	data2[index]=i;
	for(int j=index; j<data.length; j++){
	    data2[j+1]=data[j];
	int[] data = new int[] data2;
	}
    }
    public int size(){
	return data.length;
    }
    public int get(int index){
	return data[index];
    }
}
