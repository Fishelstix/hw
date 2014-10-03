public class Shapes {
    public String frame(int r, int c){
	String s= "";
	for(int i=0;i<r;i++){
	    for(int j=0;j<c;j++){
		if(i%(r-1)==0 || j%(c-1)==0) s+="*";
	        else s+=" ";
	    }
	    s+="\n";
	}
	return s;
    }
    public String stringSplosion(String str){
	String s="";
	int l=str.length();
	for(int i=0;i<l;i++){
	    s+=str.substring(0,i+1);
	}
	return s;
    }
    public String stringX(String str){
	int l=str.length()-1;
	if(l<2) return str;
	String s="";
	for(int i=1; i<l; i++){
	    char c = str.charAt(i);
	    if(c!='x') s+=c;
	}
	return str.charAt(0)+s+str.charAt(l);
    }
}
