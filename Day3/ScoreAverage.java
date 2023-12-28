package Day3;

public class ScoreAverage {
	public static void main(String[] args) {
		double[][] score = {
				{3.3, 3.4},
				{3.5, 3.6},
				{3.7, 4.0},
				{4.1, 4.2}
		};
		double sum = 0;
		for(int year=0; year<score.length; year++) {
			for(int i=0; i<score[year].length; i++) {
				sum+=score[year][i];
			}
		}
		int n=score.length;
		int m = score[0].length; // 0번째 행의 열의 개수
		System.out.println("4년 전체 평점 평균은 "+ sum/(n*m));
	}
}
