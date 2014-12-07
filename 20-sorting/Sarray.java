//I realized there were errors in my 19-sarray, so I used Jake's code for 19, and worked with him on 20
public class Sarray {
    private String[] data;
    private int last;
    private int chunk;

    public Sarray(int chunk) {
        this.chunk = chunk;
        last = -1;
        data = new String[chunk];
    }

    public Sarray() {
        this(100);
    }

    private boolean hasSpace() {
        return last + 1 < data.length;
    }

    private void makeSpace() {
        if ( !hasSpace() ) {
            String[] new_data = new String[data.length + chunk];
            for (int i = 0; i < data.length; i++)
                new_data[i] = data[i];
            data = new_data;
        }
    }

    private void checkIndex(int index) {
        if (index > last)
            throw new IndexOutOfBoundsException(""+index);
    }

    public boolean add(String i){
        makeSpace();
        last++;
        data[last] = i;
        return true;
    }

    public boolean add(int index, String i){
        checkIndex(index);
        makeSpace();
        for (int j = last; j >= index; j--) // shift from end
            data[j+1] = data[j];
        data[index] = i;
        last++;
        return true;
    }

    public int size() {
        return last + 1;
    }

    public String get(int index) {
        checkIndex(index);
        return data[index];
    }

    public String set(int index, String i) {
        checkIndex(index);
        String old = data[index];
        data[index] = i;
        return old;
    }

    public String remove(int index) {
        checkIndex(index);
        String old = data[index];
        for (int i=index; i < last; i++) // count up from index
            data[i] = data[i+1];
        last--;
        return old;
    }

    public String toString() {
        if (size() == 0) return "[]";
        String out = "[ ";
        for (int i = 0; i < size(); i++) {
            if (i == last)
                out += data[i] + " ]";
            else
                out += data[i] + ", ";
        }
        return out;
    }

    public boolean isSorted() {
        for (int i = 1; i < size(); i++) {
            if (data[i-1].compareTo(data[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    private void shift(int index) {
      String shiftee = data[index];
      int i;
      for (i = index; i > 0 && data[i-1].compareTo(shiftee) > 0; i--) {
        data[i] = data[i-1];
      }
      data[i] = shiftee;
    }

    public void isort() {
      for (int divider = 0; divider < size(); divider++) {
        shift(divider);
      }
    }

    public void ssort() {
        for (int divider = 0; divider < size(); divider++) {
            String king = data[divider];
            int king_index = divider;
            for (int i = divider; i < size(); i++) {
                if (data[i].compareTo(king) < 0 ) {
                    king = data[i];
                    king_index = i;
                }
            }
            data[king_index] = data[divider];
            data[divider] = king;
        }
    }

    private void swap(int i, int j) {
        String buffer = data[i];
        data[i] = data[j];
        data[j] = buffer;
    }

    public void bsort() {
        for (int divider = 0; divider < size(); divider++) {
            for (int i = divider; i+1 < size(); i++) {
                if (data[i].compareTo(data[i+1]) > 0) {
                    swap(i, i+1);
                }
            }
        }
    }

    public static void main(String[] args) {
        Sarray s = new Sarray();
        s.add("a");
        s.add("e");
        s.add("f");
        s.add("b");
        s.add("d");
        System.out.println(s);
        s.isort();
        System.out.println(s);
    }
}
