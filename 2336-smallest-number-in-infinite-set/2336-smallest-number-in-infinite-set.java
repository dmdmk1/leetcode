class SmallestInfiniteSet {
    
    PriorityQueue<Integer> pq;
    int curr;

    public SmallestInfiniteSet() {
        pq = new PriorityQueue<>();
        curr = 1;
    }
    
    public int popSmallest() {
        return pq.isEmpty() ? curr++ : pq.poll();
    }

    public void addBack(int num) {
        if (num < curr && !pq.contains(num)) {
            pq.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */