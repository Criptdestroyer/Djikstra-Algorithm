package Dijkstra;

/**
 *
 * @author alfath
 */
public class Hashtable {

    private final int CAPACITY;
    private long key[];
    private String value[];

    public int getCAPACITY() {
        return CAPACITY;
    }

    public Hashtable(int CAPACITY) {
        this.CAPACITY = CAPACITY;
        key = new long[CAPACITY];
        value = new String[CAPACITY];
        for (int i = 0; i < CAPACITY; i++) {
            key[i] = -1;
        }
    }

    public int __hashfunction(long key) { //mengembalikan index didalam array
        return (int) (key % CAPACITY);
    }

    public int put(long key, String value) {
        int idx = __hashfunction(key);
        this.key[idx] = key;
        this.value[idx] = value;
        return (int) key;
    }

    public int putCol(long key, String value) {
        int idx = __hashfunction(key);
        int count = 0;
        while (this.key[idx] != -1) {
            count++;
            if (count >= CAPACITY) {
                return -1;
            }
            idx = (idx + 1) % CAPACITY;
        }
        this.key[idx] = key;
        this.value[idx] = value;
        return 0;
    }

    public String get(long key) {
        int idx = __hashfunction(key);
        return value[idx];
    }

    public String getCol(long key) {
        int idx = __hashfunction(key);
        int count = 0;
        while (this.key[idx] != key) {
            count++;
            if (count >= CAPACITY) {
                return "key tidak ada";
            }
            idx = (idx + 1) % CAPACITY;
        }
        return this.value[idx];
    }

    public void print() {
        System.out.print("[ ");
        for (int i = 0; i < key.length; i++) {
            System.out.print(key[i] + " => " + value[i] + ", ");
        }
        System.out.println("]");
    }

}
