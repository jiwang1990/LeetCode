import java.util.LinkedHashMap;

public class LRUCache {
	private int capacity;
	private LinkedHashMap<Integer, Integer> lruMap = null;
	
	public LRUCache(int capacity) {
		this.capacity = capacity;
		lruMap = new LinkedHashMap<Integer, Integer>(capacity, 1);
	}

	public int get(int key) {
		Integer value = lruMap.get(key);
		if (value == null)
			return -1;
		else {
			lruMap.remove(key);
			lruMap.put(key, value);
			return value;
		}
	}

	public void set(int key, int value) {
		if(lruMap.size() >= capacity && !lruMap.containsKey(key)){
			Integer firstKey = lruMap.keySet().iterator().next();
			lruMap.remove(firstKey);
		}
		if(lruMap.containsKey(key))
			lruMap.remove(key);
		lruMap.put(key, value);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LRUCache lruCache = new LRUCache(2);
		/*
		lruCache.set(2, 1);
		System.out.println(lruCache.get(2));
		lruCache.set(3, 2);
		System.out.println(lruCache.get(2));
		System.out.println(lruCache.get(3));
		*/
		System.out.println(lruCache.get(2));
		lruCache.set(2, 6);
		System.out.println(lruCache.get(1));
		lruCache.set(1, 5);
		lruCache.set(1, 2);
		System.out.println(lruCache.get(1));
		System.out.println(lruCache.get(2));
	}

}
