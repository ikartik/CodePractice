package practice.problems.misc;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * @author kartik sharma
 * @date 24/04/18
 */

public class LRUCache {

    private Deque<Integer> d;
    private HashMap<Integer, Integer> map;
    private int size;

    public LRUCache(int capacity) {
        size = capacity;
        d = new LinkedList<>();
        map = new HashMap();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            d.remove(key);
            d.addFirst(key);
            return map.get(key);
        } else {
            return -1;
        }
    }

    public void set(int key, int value) {
        if (map.size() == size && !map.containsKey(key)) {
            map.remove(d.removeLast());
            d.addFirst(key);
            map.put(key, value);
        } else {
            d.remove(key);
            d.addFirst(key);
            map.put(key, value);
        }
    }

    public void printValues() {
        System.out.println("Dequeue : " + d);
        System.out.println("Hashmap : " + map);
    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

//        set(1, 10)
//        set(5, 12)
//        get(5)        returns 12
//        get(1)        returns 10
//        get(10)       returns -1
//        set(6, 14)    this pushes out key = 5 as LRU is full.
//        get(5)        returns -1

        cache.set(1, 10);
        cache.set(5, 12);
        System.out.println(cache.get(5));
        System.out.println(cache.get(1));
        System.out.println(cache.get(10));
        System.out.println(cache.get(5));
        cache.set(6, 14);
        System.out.println(cache.get(5));

        cache.printValues();

    }

}
