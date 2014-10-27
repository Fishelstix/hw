public class Driver{
    public static int find(int[] a, int n){
	int l=a.length;
	for(int i=0;i<l;i++){
	    if(a[i]==n) return i;
	}
	return -1;
    }
    public static int maxVal(int[] a){
	int m = 0;
	int l=a.length;
	for(int i=0;i<l;i++){
	    if(a[i]>m) m=a[i];
	}
	return m;
    }
    public static void main(String[] args){
	int[] a = {3,2,4,1};
	System.out.println(""+find(a,4));
	System.out.println(""+find(a,5));
	System.out.println(""+maxVal(a));
    }
}
