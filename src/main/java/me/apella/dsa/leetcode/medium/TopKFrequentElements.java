package me.apella.dsa.leetcode.medium;

import java.util.*;

public class TopKFrequentElements {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequentBucketSort(nums, k)));
    }

    // solution 1 (T - O(nlog(k), S - O(n))
    public static int[] topKFrequentUsingPriorityQueue(int[] nums, int k) {
        int[] arr = new int[k];
        HashMap<Integer, Integer> numMap = new HashMap<>();

        for (int num : nums) {
            numMap.put(num, numMap.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>((a, b) -> a.getValue() - b.getValue());

        for (Map.Entry<Integer, Integer> it : numMap.entrySet()) {
            pq.add(it);
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int i = k;

        while (!pq.isEmpty()) {
            arr[--i] = pq.poll().getKey();
        }

        return arr;
    }

    // T - O(n), S - O(n)
    public static int[] topKFrequentBucketSort(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length + 1];
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (int key : frequencyMap.keySet()) {
            int freq = frequencyMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int counter = 0;

        for (int pos = nums.length; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (Integer i : bucket[pos]) {
                    res[counter++] = i;
                }
            }
        }
        return res;
    }


}
