// https://leetcode.com/problems/two-sum/description

int[] twoSum(int[] nums, int target) {
    int[] output = new int[2];
    boolean findIt = false;
    for (int i = 0; i < nums.length; i++) {
        for (int j = i + 1; j < nums.length; j++) {
            if ((nums[i] + nums[j]) == target) {
                output[0] = i;
                output[1] = j;
                findIt = true;
                break;
            }
        }
        if( findIt ) break;
    }
    return output;
}

void main() {
    int[] nums = {2,7,11,15};
    int target = 9;
    int[] result = twoSum(nums, target);
    IO.println(Arrays.toString(result));
}
