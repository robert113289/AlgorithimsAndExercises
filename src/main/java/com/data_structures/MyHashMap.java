package com.data_structures;

import java.util.ArrayList;

class HashNode<K,V>{
    K key;
    V value;
    HashNode<K,V> next;

    public HashNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}

public class MyHashMap<K,V> {
    private int numBuckets =  10;
    private int size = 0;
    private ArrayList<HashNode<K,V>> bucketArray = new ArrayList<>(numBuckets);

    public MyHashMap() {
        for(int i = 0; i < numBuckets; i++){
            bucketArray.add(null);
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public void add(K key, V value){
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> head = bucketArray.get(bucketIndex);

        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketArray.get(bucketIndex);
        HashNode<K,V> newNode = new HashNode<K,V>(key,value);
        newNode.next = head;
        bucketArray.set(bucketIndex,newNode);

        //if load factor goes beyond threshold, then double hash table size
        if((1.0 * size) / numBuckets >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketArray;
            numBuckets *= 2;
            bucketArray = new ArrayList<>(numBuckets);
            size = 0;
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    add(headNode.key, headNode.value);
                    headNode = headNode.next;
                }
            }
        }
    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> head = bucketArray.get(bucketIndex);
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public V remove(K key){
        int bucketIndex = getBucketIndex(key);
        HashNode<K,V> head = bucketArray.get(bucketIndex);
        HashNode<K,V> prev = null;
        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            prev = head;
            head = head.next;
        }
        if(head == null){
            //key was not there;
            return null;
        }
        size--;
        if(prev != null){
            prev.next = head.next;
        } else {
            bucketArray.set(bucketIndex,head.next);
        }
        return head.value;
    }


    private int getBucketIndex(K key){
        int hashCode = key.hashCode();
        int index = hashCode % numBuckets;
        return index;
    }

}
