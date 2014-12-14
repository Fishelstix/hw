import java.util.*;
public class Searching{
    private Comparable[] a;
    public Searching(int l){
	a = new Comparable[l];
    }
    public Comparable getA(int index){
	return a[index];
    }
    public void addItem(Comparable item){
	for(int i=0; i<a.length; i++){
	    if(a[i]==null){
		a[i]=item;
		break;
	    }
	}
    }
    public void doSort(){
	Arrays.sort(a);
    }
    public Comparable lsearch(Comparable item){
	for(int i=0; i<a.length; i++){
	    if(a[i]==item){
		return item;
	    }
	}
	return null;
    }
    public Comparable bsearch(Comparable item){
	int low = -1;
	int high = a.length;
	while(high-low>1){
	    int c = item.compareTo(a[(high + low)/2]);
	    if(c==0){
		return item;
	    }
	    if(c>0){
		low=(high + low)/2;
	    }
	    if(c<0){
		high=(high + low)/2;
	    }
	}
	return null;
    }
    public Comparable rbsearch(Comparable item){
	return rbsearchhelper(item, 0, a.length-1);
    }
    public Comparable rbsearchhelper(Comparable item, int low, int high){
	if(high-low>1){
	    int c = item.compareTo(a[(high + low)/2]);
	    if(c==0){
		return item;
	    }else{
	    if(c>0){
		return rbsearchhelper(item, (high + low)/2, high);
	    }else{
	        return rbsearchhelper(item, low, (high + low)/2);
	    }}
	}else{
	    return null;
	}
    }
}
