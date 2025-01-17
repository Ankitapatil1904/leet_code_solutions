

class RandomizedSet {

    private Map<Integer, Integer> mp;
    private List<Integer> v;
    private Random rand;

    public RandomizedSet() {
        mp = new HashMap<>();
        v = new ArrayList<>();
        rand = new Random();
    }
    
    public boolean insert(int val) {
        if (!mp.containsKey(val)) {
            v.add(val);
            mp.put(val, v.size() - 1);
            return true;
        }
        return false;
    }
    
    public boolean remove(int val) {
        if (!mp.containsKey(val)) {
            return false;
        } else {
            int lastElement = v.get(v.size() - 1);
            int idx = mp.get(val);
            v.set(idx, lastElement);
            mp.put(lastElement, idx);
            v.remove(v.size() - 1);
            mp.remove(val);
            return true;
        }
    }
    
    public int getRandom() {
        return v.get(rand.nextInt(v.size()));
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
