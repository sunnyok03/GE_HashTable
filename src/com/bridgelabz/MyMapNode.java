package com.bridgelabz;

/*
Node class with key and value as parameters
 */
public class MyMapNode<K,V> {
    K key;
    V value;

    //constructor
    public MyMapNode(K key,V value){
        this.key = key;
        this.value = value;
    }
}
