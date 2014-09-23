public class Driver{


    public static boolean mixStart(String str) {
	return str.substring(1,3).equals("ix");
    }


    public static String makeOutWord(String out, String word) {
	int l=out.length();
	return out.substring(0,l/2)+word+out.substring(l/2);
    }


    public static String firstHalf(String str) {
	int l=str.length();
	return str.substring(0,l/2);
    }


    public static void main(String[] args){
	System.out.println("");
	System.out.println("mixStart('mix snacks'): "+mixStart("mix snacks"));
	System.out.println("mixStart('pix snacks'): "+mixStart("pix snacks"));
	System.out.println("mixStart('piz snacks'): "+mixStart("piz snacks"));
	System.out.println("");
	System.out.println("makeOutWord('<<>>', 'Yay'): "+makeOutWord("<<>>", "Yay"));
	System.out.println("makeOutWord('<<>>', 'WooHoo'): "+makeOutWord("<<>>", "WooHoo"));
	System.out.println("makeOutWord('[[]]', 'word'): "+makeOutWord("[[]]", "word"));
	System.out.println("");
	System.out.println("firstHalf('WooHoo'): "+firstHalf("WooHoo"));
	System.out.println("firstHalf('HelloThere'): "+firstHalf("HelloThere"));
	System.out.println("firstHalf('abcdef'): "+firstHalf("abcdef"));
	System.out.println("");
    }
}
