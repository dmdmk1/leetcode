class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        int[][] pairs = new int[n][2];

        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        Arrays.sort(pairs, (a, b) -> Integer.compare(b[1], a[1]));

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        long maxScore = 0;

        for (int[] pair : pairs) {
            int n1 = pair[0];
            int n2 = pair[1];

            pq.add(n1);
            sum += n1;

            if (pq.size() > k) {
                sum -= pq.poll();
            }

            if (pq.size() == k) {
                maxScore = Math.max(maxScore, sum * n2);
            }
        }
        return maxScore;
    }
}