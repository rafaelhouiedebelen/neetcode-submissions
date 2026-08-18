class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        char[] arr1 = s.toCharArray();
        char[] arr2 = t.toCharArray();
        HashMap<Character, Integer> hMap1 = new HashMap<>();
        HashMap<Character, Integer> hMap2 = new HashMap<>();

        for (int i = 0; i < arr1.length; i++) {
            if (!hMap1.containsKey(arr1[i])) {
                hMap1.put(arr1[i], 1);  // add new entry
            } else {    // change value ++
                int temp = (hMap1.get(arr1[i])) + 1; 
                hMap1.replace(arr1[i], temp);
            }
        }

        for (int i = 0; i < arr2.length; i++) {
            if (!hMap2.containsKey(arr2[i])) {
                hMap2.put(arr2[i], 1);
            } else {
                int temp = (hMap2.get(arr2[i])) + 1;
                hMap2.replace(arr2[i], temp);
            }
        }

        return hMap1.equals(hMap2);

    }
}
