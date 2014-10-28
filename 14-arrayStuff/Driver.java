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
    public static int freq(int[] a, int n){
	int x = a[n];
	int c = 0;
	int l = a.length;
	for(int i=0; i<l; i++){
	    if(a[i]==x) c++;
	}
	return c;
    }
    public int sum67(int[] nums) {
	boolean six = false;
	int l=nums.length;
	int c=0;
	for(int i=0; i<l; i++){
	    if(six){
		if(nums[i]==7) six = false;
	    }else{
		if(nums[i]==6){
		    six = true;
		}else{
		    c+=nums[i];
		}
	    }
	}
	return c;
    }
    public boolean more14(int[] nums) {
	int l = nums.length;
	int one = 0;
	int four = 0;
	for (int i=0; i<l; i++){
	    if (nums[i] == 1) one++;
	    if (nums[i] == 4) four++;
	}
	return one>four;
    }
    public int[] tenRun(int[] nums) {
	int c=1;
	int l = nums.length;
	for(int i=0; i<l; i++){
	    if(nums[i]%10==0){
		c=nums[i];
	    }else{
		if(c!=1) nums[i]=c;
	    }
	}
	return nums;
    }
    public boolean tripleUp(int[] nums) {
	int l = nums.length;
	if(l==0) return false;
	int c = nums[0];
	boolean second = false;
	for (int i=1; i<l; i++){
	    if(!second){
		if(nums[i]==c+1){
		    second=true;
		}else{
		    c=nums[i];
		}
	    }else{
		if(nums[i]==c+2){
		    return true;
		}else{
		    second=false;
		    c=nums[i];
		}
	    }
	}
	return false;
    }
    public boolean canBalance(int[] nums) {
	int l=nums.length;
	int c=0;
	int d=0;
	for(int i=0; i<l; i++){
	    c+=nums[i];
	}
	if(c%2==1) return false;
	for(int i=0; d<c/2; i++){
	    d+=nums[i];
	}
	return d==c/2;
    }
    public int[] seriesUp(int n) {
	int x=(n*(n+1)/2);
	int c=0;
	int[] s = new int[x];
	for(int i=1; i<=n; i++){
	    for(int j=1; j<=i; j++){
		s[c]=j;
		c++;
	    }
	}
	return s;
    }
    public static void main(String[] args){
	int[] a = {3,2,4,1};
	System.out.println(""+find(a,4));
	System.out.println(""+find(a,5));
	System.out.println(""+maxVal(a));
	int[] b = {3,2,4,5,6,2,3,4,1,2,3};
	System.out.println(""+freq(b,1));
    }
}
