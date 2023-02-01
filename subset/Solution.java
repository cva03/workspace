package subset;
class Solution {
    public int trap(int[] height) {
        int result = 0;
        for (int i = 1; i < height.length - 1; i++) {
            int leftMax = 0, rightMax = 0;
            for (int j = i; j >= 0; j--) {
                leftMax = Math.max(leftMax, height[j]);
            }
            for (int j = i; j < height.length; j++) {
                rightMax = Math.max(rightMax, height[j]);
            }
            result += Math.min(leftMax, rightMax) - height[i];
        }
        return result;
    }
}

class Main {
    public static void main(String[] args) {
        int[] test = {1,1,0,2,1,0,1,3,2,1,2,1};
        Solution s = new Solution();
        System.out.println(s.trap(test));
        System.out.print("\033[H\033[2J");// Output: 6
    }
}
