class Solution {
    public int maxArea(int[] heights) {
        int area = 0;

        for(int i=0;i<heights.length;i++){
            int left=0;
            int right = heights.length - 1 -i;

            while(left<right){
                int width = right - left;
                int height = Math.min(heights[left],heights[right]);
                int temparea = width*height;

                area = Math.max(area,temparea);

                left++;
            }
         
        }
        return area;
        
    }
}
