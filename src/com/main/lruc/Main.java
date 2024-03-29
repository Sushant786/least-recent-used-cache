package com.main.lruc;

public class Main {
    public static void main(String[] args) {
        new Main().invokeLRUCacheAlgorithm();
    }

    private void invokeLRUCacheAlgorithm() {
        LRUCache cache = new LRUCache(3);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // returns 1
        cache.put(3, 3);
        cache.put(4, 4);                        // evicts key 2
        System.out.println(cache.get(2));       // returns -1 (not found)
        cache.put(5, 5);                        // evicts key 1
        System.out.println(cache.get(1));       // returns -1 (not found)
        cache.put(6, 6);                        // evicts key 3
        System.out.println(cache.get(3));       // returns -1 (not found)
        System.out.println(cache.get(4));       // returns 4
        System.out.println(cache.get(5));       // returns 5
        System.out.println(cache.get(6));       // returns 6

    }
}
