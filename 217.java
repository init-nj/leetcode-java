class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hashmap = new HashSet<>(); 
        for (int num : nums){
            if (hashmap.contains(num)){
                return true;
            }
            hashmap.add(num);
        }
        return false;
    }
}
