public class Sarray{
    private int[] data;
    private int last;
    public Sarray(int[] d){
	data = d;
    }
    public boolean add(int i){
	int[] data2 = new int[(data.length+1)];
	for(int j=0; j<data.length; j++){
	    data2[j]=data[j];
	}
	data2[data.length]=i;
	int[] data = data2;
	return true;
    }
    public void add(int index, int i){
	int[] data2 = new int[(data.length+1)];
	for(int j=0; j<index; j++){
	    data2[j]=data[j];
	}
	data2[index]=i;
	for(int j=index; j<data.length; j++){
	    data2[j+1]=data[j];
	int[] data = data2;
	}
    }
    public int size(){
	return data.length;
    }
    public int get(int index){
	return data[index];
    }
    public int set(int index, int i){
	int j = index;
	data[index]=i;
	return j;
    }
    public int remove(int index){
	int i = data[index];
	int[] data2 = new int[(data.length-1)];
	for(int j=0; j<index; j++){
	    data2[j]=data[j];
	}
	for(int j=index; j<data.length; j++){
	    data2[j-1]=data[j];
	int[] data = data2;
	}
	return i;
    }
}
