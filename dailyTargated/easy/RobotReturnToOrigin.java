package dailyTargated.easy;

public class RobotReturnToOrigin {

	public static void main(String[] args) {
		String moves = "LL";
		boolean res=judgeCircle(moves);
		System.out.println(res);
	}

	private static boolean judgeCircle(String moves) {
		int ud=0,rl=0;
		for(char c:moves.toCharArray()) {
			if(c=='U') ud++;
			else if(c=='D') ud--;
			else if(c=='R') rl++;
			else if(c=='L') rl--;
		}
		if(ud==0 && rl==0) return true;
		return false;
	}

}
