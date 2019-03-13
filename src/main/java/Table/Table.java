package Table;

import org.omg.IOP.ENCODING_CDR_ENCAPS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This class needs to manage an ArrayList of Entry objects.  It needs a get method that takes a key and returns
 * its corresponding value, or null of the key is not in the arraylist.  It needs a put method that takes a key and value
 * and makes an entry with key, value.  NOTE: There cannot be two entries with the same key.
 * It also needs a remove method which takes a key and, if that key exists in the arraylist, removes that item.
 * Void return on `remove`.
 */
public class Table<K, V> {
    private ArrayList<Entry> entries;
   // Entry<K,V> entry = new Entry<K,V>();

    public Table() {
       entries = new ArrayList<Entry>();

    }

    public Entry get(K foo) {
        Entry result = null;
        if(entries.contains(foo)){

        }
        else {
            result = null;
        }
        return result;
    }

    public void put(K foo, V i) {
   //     entries.add(i,foo);
    }

    public void remove(K foo) {

    }
}
