public class Shapes {
    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }
    public String tri1(int h){
	//3 minutes
	String s = "";
	int row = 0;
	int col = 0;
	while(row<h){
	    while(col<=row){
		s=s+"*";
		col++;
	    }
	    row++;
	    col = 0;
	    s=s+"\n";
	}
	return s;
    }
    public String tri2(int h){
	//3 minutes
	String s = "";
	int col = 0;
	int row = 0;
	while(col<h){
	    while(row<h){
		if(col+row+1<h){
		    s=s+" ";
		}else{
		    s=s+"*";
		}
		row++;
	    }
	    col++;
	    row=0;
	    s=s+"\n";
	}
	return s;
    }
    public String tri3(int h){
	//5 minutes
	String s = "";
	for(int i=0; i<h; i++){
	    for(int j=0; j<=h+i; j++){
		if(j+i<h-1){
		    s=s+" ";
		}else{
		    if(j==h+i){
			s=s+"\n";
		    }else{
			s=s+"*";
		    }
		}
	    }
	}
	return s;	
    }
    public String diamond(int h){
	//3 minutes
	if(h%2==0){
	    return "Diamond needs an odd number\n";
	}
	int mid=(h-1)/2;
	String s="";
	for(int i=0; i<h; i++){
	    for(int j=0; j<h; j++){
		if(Math.abs(mid-i)+Math.abs(mid-j)>mid){
		    s=s+" ";
		}else{
		    s=s+"*";
		}
	    }
	    s=s+"\n";
	}
	return s;
    }
    public String tri4(int h){
	//2 minutes
	String s = "";
	for(int i=0; i<h; i++){
	    for(int j=0; j<h; j++){
		if(i-j>0){
		    s=s+" ";
		}else{
		    s=s+"*";
		}
	    }
	    s=s+"\n";
	}
	return s;
    }
}
