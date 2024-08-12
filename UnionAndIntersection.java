// Find the Union and Intersection of the two sorted arrays

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class UnionAndIntersection {
    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 2, 3, 6};
        int[] arr2 = {3, 8, 6, 20, 7};

        Set<Integer> union = findUnion(arr1, arr2);
        Set<Integer> intersection = findIntersection(arr1, arr2);

        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
    }

    public static Set<Integer> findUnion(int[] arr1, int[] arr2) {
        Set<Integer> union = new HashSet<>();
        for (int num : arr1) {
            union.add(num);
        }
        for (int num : arr2) {
            union.add(num);
        }
        return union;
    }

    public static Set<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        Set<Integer> intersection = new HashSet<>();

        // Count frequency of elements in the first array
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find common elements in the second array
        for (int num : arr2) {
            if (map.containsKey(num)) {
                intersection.add(num);
                map.remove(num); // Remove to avoid duplicates
            }
        }

        return intersection;
    }
}
