/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import hashtable.HashTableArray;

/**
 *
 * @author mohammed
 */
public class HashTableDemo {

    public static void main(String[] args) {

        HashTableArray<String> hashTableArray = new HashTableArray<>(5);
        hashTableArray.put(1, "A");
        hashTableArray.put(10, "B");
        hashTableArray.put(6, "C");
        System.out.println(hashTableArray.get(1));
        System.out.println(hashTableArray.get(2)); // return null;
        System.out.println(hashTableArray.get(6));
        
    }

}
