class Solution
{
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    ArrayList<Integer> list = new ArrayList<>();

    //add nums1
    for (int i = 0; i < m; i++) {
        list.add(nums1[i]);
    }

    //add nums2
    for (int i = 0; i < n; i++) {
        list.add(nums2[i]);
    }

    // Sort the list
    Collections.sort(list);

    // Update nums1 with the sorted elements
    for (int i = 0; i < list.size(); i++) {
        nums1[i] = list.get(i);
    }
  }
}