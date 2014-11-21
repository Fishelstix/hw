public class Driver {
    public static void main(String[] args) {
	WordSearch w = new WordSearch(7,10);
	w.addWord("hello");
	w.addWord("lol");
	w.addWord("elo");
	w.addWord("hell");
	System.out.println(w);
    }
}
