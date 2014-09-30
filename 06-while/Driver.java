public class Driver{
    public static String frontTimes(String str, int n){
	//1 minute
	String front;
	if (str.length()<3){
	    front=str;
	}else{
	    front=str.substring(0,3);
	}
	String out = new String("");
	while (n>0){
	    out = out + front;
	    n--;
	}
	return out;
    }
    public static String stringBits(String str){
	//1 minute
	int c=1;
	while(c<str.length()){
	    str = str.substring(0,c)+str.substring(c+1);
	    c++;
	}
	return str;
    }
    public static String stringYak(String str){
	//1 minute
	int l=str.length();
	int c=0;
	while (c<l-2){
	    if(str.charAt(c)=='y' && str.charAt(c+2)=='k'){
		str = str.substring(0,c)+str.substring(c+3);
		c--;
		l=l-3;
	    }
	    c++;
	}
	return str;
    }
    public static int stringMatch(String a, String b){
	//1 minute
	int l=Math.min(a.length(),b.length());
	int c=0;
	int out=0;
	while (c<l-1){
	    if(a.substring(c,c+2).equals(b.substring(c,c+2))){
		out++;
	    }
	    c++;
	}
	return out;
    }
    public static void main(String[] args){
	System.out.println(frontTimes("Chocolate",3));
	System.out.println(stringBits("Heeololeo"));
	System.out.println(stringYak("xxxyakyyyakzzz"));
	System.out.println(stringMatch("aaxxaaxx", "iaxxai"));
    }
}
