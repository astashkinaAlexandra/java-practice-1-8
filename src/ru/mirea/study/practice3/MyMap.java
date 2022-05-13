package ru.mirea.study.practice3;

import java.util.*;
import java.util.concurrent.Semaphore;

public class MyMap implements Map<Integer, String> {
    private final Map<Integer, String> map = new HashMap<>();
    private final Semaphore sem = new Semaphore(1);

    @Override
    public int size() {
        try {
            sem.acquire();
            return map.size();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.size();
    }

    @Override
    public boolean isEmpty() {
        try {
            sem.acquire();
            return map.isEmpty();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        try {
            sem.acquire();
            return map.containsKey(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        try {
            sem.acquire();
            return map.containsValue(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.containsValue(value);
    }

    @Override
    public String get(Object key) {
        try {
            sem.acquire();
            return map.get(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.get(key);
    }

    @Override
    public String put(Integer key, String value) {
        try {
            sem.acquire();
            return map.put(key, value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.put(key, value);
    }

    @Override
    public String remove(Object key) {
        try {
            sem.acquire();
            return map.remove(key);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.remove(key);
    }


    @Override
    public void putAll(Map<? extends Integer, ? extends String> m) {
        try {
            sem.acquire();
            map.putAll(m);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        map.putAll(m);
    }

    @Override
    public void clear() {
        try {
            sem.acquire();
            map.clear();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
    }

    @Override
    public Set<Integer> keySet() {
        try {
            sem.acquire();
            return map.keySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.keySet();
    }

    @Override
    public Collection<String> values() {
        try {
            sem.acquire();
            return map.values();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.values();
    }

    @Override
    public Set<Entry<Integer, String>> entrySet() {
        try {
            sem.acquire();
            return map.entrySet();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            sem.release();
        }
        return map.entrySet();
    }
}

