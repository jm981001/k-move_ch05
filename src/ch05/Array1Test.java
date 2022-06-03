package ch05;

public class Array1Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//값의 리스트로 배열 생성
		int[] scores= {83,90,87,99,85,79,88,92,77,95};//scores에는 힙 영역의 배열 시작 주소가 저장
		
		//System.out.println("scores[0]:"+ scores[0]);
		//System.out.println("scores[1]:"+ scores[1]);
		//System.out.println("scores[2]:"+ scores[2]);
		for(int i=0; i<scores.length; i++) {
			System.out.println("scores["+i+"]:"+scores[i]);
		}
	   int sum=0;
	   /*원래 코드 for(int i=0; i<scores.length; i++) { 
	    sum+=scores[i];
	   }
	   *///집합의 모든 요소를 순차적으로 접근한다면 index 사용없이 가능->향상된 for (밑에)
	   for(int score : scores) {
		   sum+=score;
	   }
	   System.out.println("총합:"+sum);
	  // double avg= (double)sum/3;
	   double avg= (double)sum/ scores.length;
	   System.out.println("평균:"+avg);
	   
	}

}
