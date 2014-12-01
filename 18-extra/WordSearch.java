import java.util.ArrayList;
public class WordSearch {
    private ArrayList<String> bank = new ArrayList<String>();
    private ArrayList<Character> bank0 = new ArrayList<Character>();
    private ArrayList<Character> bank1 = new ArrayList<Character>();
    private ArrayList<Character> bank2 = new ArrayList<Character>();
    private ArrayList<Character> bank3 = new ArrayList<Character>();
    private ArrayList<Character> bank4 = new ArrayList<Character>();
    public WordSearch(ArrayList<String> o){
        for(String word : o){
	    bank.add(word);
	    bank0.add(word.charAt(0));
	    bank1.add(word.charAt(1));
	    bank2.add(word.charAt(2));
	    bank3.add(word.charAt(3));
	    bank4.add(word.charAt(4));
	}
    }
    public ArrayList<String> validWords(char[] letters){
	int min = 0;
	int max = bank.size();
	for(int i=0; i<5; i++){
	    if(letters[i]==' ') break;
	    ArrayList<Character> bankI = bank0;
	    if(i==1) bankI = bank1;
	    if(i==2) bankI = bank2;
	    if(i==3) bankI = bank3;
	    if(i==4) bankI = bank4;
	    boolean minSet = false;
	    for(int j=min; j<max; j++){
	        if((letters[i]==bankI.get(j))&&!minSet){
		    min = j;
		    minSet = true;
		}
		if((letters[i]!=bankI.get(j))&&minSet){
		    max = j;
		    break;
		}
	    }
	    if(!minSet){
		min = 0;
		max = 0;
		break;
	    }
	}
	ArrayList<String> out = new ArrayList<String>();
	for(int i=min; i<max; i++){
	    out.add(bank.get(i));
	}
	return out;
    }
    public void put(char[][] board, int wordNum){
        char[] letters = new char[5];
	if(wordNum%2==0){
	    for(int i=0; i<5; i++){
		letters[i]=board[wordNum/2][i];
	    }
	}else{
	    for(int i=0; i<5; i++){
		letters[i]=board[i][wordNum/2];
	    }
	}
	ArrayList<String> valid = validWords(letters);
	if(!valid.isEmpty()){
	    if(wordNum==9){
		String out = new String("");
	        for(int j=0; j<5; j++){
		    for(int k=0; k<5; k++){
			out+=board[j][k];
		    }
		    out+="\n";
		}
		System.out.println(out);
	    }else{
		int l=valid.size();
		for(int i=0; i<l; i++){
		    String word = valid.get(i);
		    char[][] newboard = new char[5][5];
		    for(int j=0; j<5; j++){
			for(int k=0; k<5; k++){
			    newboard[j][k]=board[j][k];
			}
		    }
		    if(wordNum%2==0){
			for(int j=0; j<5; j++){
			    newboard[wordNum/2][j]=word.charAt(j);
			}
		    }else{
			for(int j=0; j<5; j++){
			    newboard[j][wordNum/2]=word.charAt(j);
			}
		    }
		    put(newboard, wordNum+1);
		}
	    }
	}
    }
}
