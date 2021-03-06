package com.company.oracle;

import java.util.*;

public class GyanMultiValMap<K,V>{
    private final Map<K, Set<V>> multimap = new HashMap<>();

    private Map.Entry<K, V>[] entryTable;

    public void put(K key, V value) {
        this.multimap.computeIfAbsent(key, k -> new HashSet<>()).add(value);
    }

    public Set<V> get(K key) {
        return this.multimap.getOrDefault(key, Collections.emptySet());
    }

    public void remove(K key, V value) {
        this.multimap.computeIfPresent(key,
                (k, set) -> set.remove(value) && set.isEmpty() ? null : set);
    }

    public boolean contains(K key, V value) {
        return this.multimap.getOrDefault(key, Collections.emptySet()).contains(value);
    }

    public int size() {
        return this.multimap.values().stream().mapToInt(Set::size).sum();
    }

    public Set<V> values() {
        return (Set<V>) multimap.values().stream().flatMap(Set::stream);
    }


    @Override
    public String toString() {
        return "GyanMultiValMap{" +
                "multimap=" + multimap +
                '}';
    }
}
