package com.bridgelabz;

import java.util.LinkedList;

/*
Implementation of Hash map class with generics key and value
 */
public class HashMap<K,V> {
    private final int size;
    private final LinkedList<MyMapNode<K,V>>[] list;

    /*
    @desc: constructor to initialize new object of hashmap
    @params: size of the list to be used for implementation
    @return:
     */
    public HashMap(int size){
        this.size = size;
        this.list = new LinkedList[size];

        for(int i=0;i<size;i++){
            this.list[i] = new LinkedList<>();
        }
    }

    /*
    @desc: get the index of the key in the list
    @params: key
    @return: index at which value of this key is stored
     */
    private int getIdx(K key){
        return Math.abs(key.hashCode())%size;
    }

    /*
    @desc: updating the value of the key passed by 1
    @params: key
    @return:
     */
    public void put(K key,V value){
        int idx = getIdx(key);

        for(MyMapNode<K,V> node : list[idx]){
            if(node.key.equals(key)){
                node.value = value;
                return;
            }
        }
        MyMapNode<K,V> temp = new MyMapNode<>(key,value);
        list[idx].add(temp);
    }

    /*
    @desc: get value for the given key
    @params: key
    @return: if found value else null
     */
    public V getValue(K key){
        int idx = getIdx(key);
        for(MyMapNode<K,V> node : list[idx]){
            if(node.key.equals(key)){
                return node.value;
            }
        }
        return null; //not found
    }



}
