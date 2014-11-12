public class Driver{
    static int[] list = new int[20];
    public static void setVals(){
	for(int i=0; i<20; i++){
	    list[i] = (int)(10.0*Math.random())+1;
	}
    }
    public static void remove(int n){
	for(int i=n; i<19; i++){
	    list[i]=list[i+1];
	}
	list[19]=0;
    }
    public static void main(String[] args){
	setVals();
	int c=0;
	while(c<19&&list[c]!=0){
	    if(list[c]==list[c+1]){
		remove(c+1);
	    }else{
		c++;
	    }
	}
	for(int i=0; i<20; i++){
	    System.out.println(list[i]);
	}
    }
}
