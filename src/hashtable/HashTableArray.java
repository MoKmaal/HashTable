/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author mohammed
 * @param <T>
 */
public class HashTableArray<T> {

    Entry<T>[] arrayHash;
    int size;

    public HashTableArray(int size) {
        this.size = size;
        arrayHash = new Entry[size];
        for (int i = 0; i < arrayHash.length; i++) {
            arrayHash[i] = new Entry<>();

        }
    }

    /**
     * generate hash using remainder of array size
     *
     * @param key index
     * @return hash
     *
     */
    public int generateHash(int key) {
        return key % size;
    }

    public void put(int key, T value) {
        int index;
        index = generateHash(key);
        Entry arrayVal = arrayHash[index];
        Entry newEntry = new Entry(key, value);
        newEntry.next = arrayVal.next;
        arrayVal.next = newEntry;

    }

    public T get(int key) {
        T value = null;
        int index = generateHash(key);
        Entry arrayVal = arrayHash[index];
        while (arrayVal != null) {
            if (arrayVal.key == key) {
                value = (T) arrayVal.value;
                break;
            }
            arrayVal = arrayVal.next;
        }
        return value;
    }

}
