package dailyTargated.medium;

public class MaximizeConfusionOfExam {
	static int result=0;
	static int n;
	public static void main(String[] args) {
		String answerKey = "TFFT";
		int k = 1;
		int result=maximizeTheConfusion(answerKey,k);
		System.out.println(result);
	}

	private static int maximizeTheConfusion(String answerKey, int k) {
		char ans[]=answerKey.toCharArray();
		n=answerKey.length();
		int result=0;
		int i=0,j=0;
		int falseCount=0;
		while(j<n) {
			if(ans[j]=='F') falseCount++;
			while(falseCount>k) {
				if(ans[i]=='F') {
					falseCount--;
				}
				i++;
			}
			result=Math.max(result, j-i+1);
			j++;
		}
		i=0;
		j=0;
		int trueCount=0;
		while(j<n) {
			if(ans[j]=='T') trueCount++;
			while(trueCount>k) {
				if(ans[i]=='T') {
					trueCount--;
				}
				i++;
			}
			result=Math.max(result, j-i+1);
			j++;
		}
		return result;
	}

//	private static void solve(int i, char[] ans, int k) {
//		findMaxLen(ans);
//		if(i>=n || k<=0)
//			return;
//		
//		ans[i]=ans[i]=='T'?'F':'T';//flip
//		solve(i+1, ans, k-1);
//		
//		ans[i]=ans[i]=='T'?'F':'T';
//		solve(i+1, ans, k);
//	}

//	private static void findMaxLen(char[] ans) {
//		n=ans.length;
//		int len=0;
//		int i=0;
//		while(i<n) {
//			if(ans[i]=='T') {
//				len=1;
//				i++;
//				while(i<n && ans[i]=='T') {
//					len++;
//					i++;
//				}
//				result=Math.max(result, len);
//			}
//			else {
//				len=1;
//				i++;
//				while(i<n && ans[i]=='F') {
//					len++;
//					i++;
//				}
//				result=Math.max(result, len);
//			}
//		}
//	}

}
