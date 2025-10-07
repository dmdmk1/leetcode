class Solution {
    public int[] avoidFlood(int[] rains) {
        int[] answer = new int[rains.length];
        Map<Integer, Integer> map = new HashMap<>(); // 각 호수에 마지막으로 비가 내린 날
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < rains.length; i++) {
            int lake = rains[i];

            if (lake == 0) {
                set.add(i);
                answer[i] = 1;
            } else {
                if (map.containsKey(lake)) {
                    Integer dryDay = set.higher(map.get(lake));

                    if (dryDay == null) {
                        return new int[0];
                    }

                    answer[dryDay] = lake;
                    set.remove(dryDay);
                }

                map.put(lake, i);
                answer[i] = -1;
            }
        }

        return answer;
    }
}