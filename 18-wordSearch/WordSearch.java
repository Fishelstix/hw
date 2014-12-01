public class WordSearch {
    private char[][] board;
    private int boardX;
    private int boardY;
    private String[] wordList;
    public WordSearch(int r, int c, String[] list){
	wordList = list;
	boardX = c;
	boardY = r;
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	for(int i=0; i<wordList.length; i++){
	    w.addword(wordList[i]);
	}
    }
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j];
	    }
	    s = s + "\n";
	}
	return s;
    }
    public boolean isValid(String w, int x, int y, int xVel, int yVel){
	int l = w.length()-1;
	if((x+l*xVel<0)||(x+l*xVel>=boardX)||(y+l*yVel<0)||(y+l*yVel>=boardY)) return false;
	for(int i=0; i<=l; i++){
	    if(!((board[y][x]=='.')||(board[y][x]==w.charAt(i)))) return false;
	    x+=xVel;
	    y+=yVel;
	}
	return true;
    }
    public void addWord(String w){
	int l = w.length()-1;
	boolean fits = false;
	while(!fits){
	    int x = (int)(Math.random()*boardX);
	    int y = (int)(Math.random()*boardY);
	    int xVel=0;
	    int yVel=0;
	    while(xVel==0 && yVel==0){
		xVel = (int)(Math.random()*3) - 1;
		yVel = (int)(Math.random()*3) - 1;
	    }
	    if(isValid(w,x,y,xVel,yVel)){
		for(int i=0; i<=l; i++){
		    board[y][x]=w.charAt(i);
		    x+=xVel;
		    y+=yVel;
		}
		fits = true;
	    }
	}
    }
}
