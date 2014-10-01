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
}
