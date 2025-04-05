//create a program in java finds the last duplicate in an array. the program should use a loop or recursion

import java.util.HashMap;

public class duplicateInArray {
    public static void lastduplicate(int[] arr) {
        HashMap<Integer, Integer> elementCount = new HashMap<>();
        HashMap<Integer, Integer> lastIndex = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            elementCount.put(current, elementCount.getOrDefault(current, 0) + 1);
            lastIndex.put(current, i);
        }

        int lastDuplicate = -1;
        int lastDuplicateIndex = -1;

        for (int key : elementCount.keySet()) {
            if (elementCount.get(key) > 1) {
                if (lastIndex.get(key) > lastDuplicateIndex) {
                    lastDuplicate = key;
                    lastDuplicateIndex = lastIndex.get(key);
                }
            }
        }

        if (lastDuplicate != -1) {
            System.out.println("Last duplicate: " + lastDuplicate);
            System.out.println("Last duplicate index: " + lastDuplicateIndex);
        } else {
            System.out.println("No duplicates found");
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 3, 2, 1, 6};
        lastduplicate(array);
    }
}
