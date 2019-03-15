package TableNested;

import Table.Entry;
import Table.Table;

import java.util.ArrayList;

/**
 * All you need to do for this microlab is take the Table and Entry from the last one and make Entry a nested class.
 *  * Think about how nested classes should work with generics.
 */
public class TableNested<K, V> {
    private ArrayList<Entry> entries;

    public TableNested() {
        this.entries = new ArrayList<>();
    }

    public V get(K foo) {
        for(Entry entry: entries){
            if(entry.key.equals(foo)){
                return entry.value;
            }
        }
        return null;
    }

    public void put(K foo, V i) {
        remove(foo);
        entries.add(new Entry(foo,i));
    }

    public void remove(K foo) {
        for(Entry entry: entries){
            if(entry.key.equals(foo)){
                entries.remove(entry);
                break;
            }
        }
    }

    private class Entry{
        private K key;
        private V value;

        public Entry(K key, V value){
            this.key = key;
            this.value = value;
        }
    }

}
