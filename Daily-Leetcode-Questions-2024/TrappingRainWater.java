package dailyLeetcodeQuestions2024;

public class TrappingRainWater {

	public static void main(String[] args) {
		int height[]= {0,1,0,2,1,0,1,3,2,1,2,1};
		int result=trap(height);
		System.out.println(result);
	}

	private static int trap(int[] height) {
		int left=height[0],i=0,j=height.length-1;
		int right=height[j],sum=0;
		while(i<j) {
			if(left<=right) {
				sum+=left-height[i];
				i++;
				left=Math.max(left, height[i]);
			}
			else {
				sum+=right-height[j];
				j--;
				right=Math.max(right, height[j]);
			}
		}
		return sum;
	}

}
