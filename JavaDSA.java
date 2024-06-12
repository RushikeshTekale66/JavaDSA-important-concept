public class JavaDSA {

    private Entry[] table;
    private int capacity;

    private class Entry {

        private String key;
        private int value;
        private Entry next;

        public Entry(String key, int value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    public JavaDSA(int capacity) {
        this.capacity = capacity;
        this.table = new Entry[capacity];
    }

    private int hash(String key) {
        int hash = key.hashCode();
        return Math.abs(hash) % capacity;
    }

    public void put(String key, int value) {
        int index = hash(key);

        Entry entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                entry.value = value;
                return;
            }
            entry = entry.next;
        }
        Entry newEntry = new Entry(key, value);
        newEntry.next = table[index];
        table[index] = newEntry;
    }

    public int get(String key) {
        int index = hash(key);
        Entry entry = table[index];

        while (entry != null) {
            if (entry.key.equals(key)) {
                return entry.value;
            }
            entry = entry.next;
        }
        return -1;
    }

    public void remove(String key) {
        int index = hash(key);
        Entry entry = table[index];
        Entry prev = null;

        while (entry != null) {
            if (entry.key.equals(key)) {
                if (prev == null) {
                    table[index] = entry.next;
                } else {
                    prev.next = entry.next;
                }
                return;

            }
            prev = entry;
            entry = entry.next;
        }
    }

    public boolean containsKey(String key){
        int index = hash(key);

        Entry entry = table[index];

        while (entry!=null) {
            if(entry.key.equals(key)){
                return true;
            }
            entry = entry.next;
            
        }
        return false;
    }

    public void display(){
        for(int i=0; i<capacity; i++){
            Entry entry = table[i];

            while (entry!=null) {
                System.out.println("Key: "+ entry.key + ", Value : "+ entry.value);
                entry  = entry.next;
            }
        }
    }

    public static void main(String [] args){
        JavaDSA ht = new JavaDSA(10) ;

        ht.put("banana", 8);
        ht.put("orange", 6);
        ht.put("apple", 5);

        ht.display();

        int applecount = ht.get("apple");
        int bananacount = ht.get("banana");
        int orangecount = ht.get("orange");

        System.out.println("Number of apples : " + applecount);
        System.out.println("Number of banana : " + bananacount);
        System.out.println("Number of orange : " + orangecount);

        ht.put("banana", 10);

        ht.remove("orange");

        boolean containsapple = ht.containsKey("apple");
        System.out.println("Containes apple : "+ containsapple);

        boolean containsgreaps = ht.containsKey("greaps");
        System.out.println("Contains greaps : "+ containsgreaps);

        ht.display();
    }
}