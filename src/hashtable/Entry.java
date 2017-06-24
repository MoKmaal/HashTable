/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashtable;

/**
 *
 * @author mohammed
 */
public class Entry<T> {

    int key;
    T value;
    Entry next;

    public Entry() {
    }

    public Entry(int key, T value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }

}
