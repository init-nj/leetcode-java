class Solution {
    public int[] sortArray(int[] nums) {
        MergeSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void MergeSort(int[] arr, int initial, int end){
        if (initial >= end){
            return;
        }
        int mid = (initial + end)/2;
        MergeSort(arr, initial, mid);
        MergeSort(arr, mid + 1, end);
        Merge(arr, initial, mid, end);
    }

    private void Merge(int[] arr, int l, int m, int r) {
        ArrayList<Integer> temp = new ArrayList<>();
        int i = l;
        int j = m + 1;

        while (i <= m && j <= r) {
            if (arr[i] <= arr[j]) {
                temp.add(arr[i]);
                i++;
            } else {
                temp.add(arr[j]);
                j++;
            }
        }


        while (i <= m) {
            temp.add(arr[i]);
            i++;
        }

        while (j <= r) {
            temp.add(arr[j]);
            j++;
        }

        for (i = l; i <= r; i++) {
            arr[i] = temp.get(i - l);
        }
    }
}
