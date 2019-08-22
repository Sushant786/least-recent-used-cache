package com.main.lruc;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    private int capacity;
    private LinkedHashMap<Integer, Integer> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new LinkedHashMap<Integer, Integer>(capacity + 1, 1.0f, true) {
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(Integer key) {
        Integer value = cache.get(key);
        if (value == null) {
            return -1;
        } else {
            put(key, value);
        }

        return value;
    }

    public void put(Integer key, Integer value) {
        if (cache.containsKey(key)) {
            cache.replace(key, value);
        } else {
           cache.put(key, value);
        }
    }
}
